package com.api.rest.service.impl;

import com.api.rest.dto.UserDTO;
import com.api.rest.service.IKeycloakService;
import com.api.rest.util.KeycloakProvider;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.admin.client.resource.UserResource;
import org.keycloak.admin.client.resource.UsersResource;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class IKeycloakServiceImpl implements IKeycloakService {

    /**
     * Metodo para listar todos los usuarios de Keycloak
     * @return List<UserRepresentation>
     */
    @Override
    public List<UserRepresentation> findAllUsers() {
        return KeycloakProvider.getRealmResource()
                .users()
                .list();
    }

    /**
     * Metodo para buscar un usuario por el username
     * @param username
     * @return List<UserRepresentation>
     */
    @Override
    public List<UserRepresentation> searchUserByUsername(String username) {
        return KeycloakProvider.getRealmResource()
                .users()
                .searchByUsername(username,true);
    }

    /**
     * Metodo para crear un usuario nuevo en Keycloak
     * @param userDTO
     * @return String
     */
    @Override
    public String createUser(@NonNull UserDTO userDTO) {
        int status = 0;

        UsersResource usersResource = KeycloakProvider.getUserResource();
        UserRepresentation userRepresentation = new UserRepresentation();

        userRepresentation.setFirstName(userDTO.firstName());
        userRepresentation.setLastName(userDTO.lastName());
        userRepresentation.setEmail(userDTO.email());
        userRepresentation.setUsername(userDTO.username());
        userRepresentation.setEmailVerified(true);
        userRepresentation.setEnabled(true);

        Response response = usersResource.create(userRepresentation);
        status = response.getStatus();

        if (status == 201) {
            String path = response.getLocation().getPath(); // el path es una url de la cual debemos obtener el usuario
            String userId = path.substring(path.lastIndexOf("/") + 1);  // y el usuario se encontrara al final de la url, entonces toma el ultimo slash y toma la posicion siguiente

            CredentialRepresentation credentialRepresentation = new CredentialRepresentation();
            credentialRepresentation.setTemporary(false);
            credentialRepresentation.setType(OAuth2Constants.PASSWORD);
            credentialRepresentation.setValue(userDTO.password());

            usersResource.get(userId).resetPassword(credentialRepresentation);

            RealmResource realmResource = KeycloakProvider.getRealmResource();
//            AHORA DEBEMOS EXTRAER TODOS LOS ROLES DEL JWT, PARA PODER ASIGNARLOS POSTERIORMENTE
            List<RoleRepresentation> roleRepresentationList = null;
            if (userDTO.roles() == null || userDTO.roles().isEmpty()) {
                roleRepresentationList = List.of(realmResource.roles().get("user").toRepresentation()); // por defecto todos usuario tendra role de usuario tendran rol de usuario
            } else {    // en caso SI se especifico el rol debemos asignarlo
                roleRepresentationList = realmResource.roles()
                        .list()
                        .stream()
                        .filter(role -> userDTO.roles()
                                .stream()
                                .anyMatch(roleName -> roleName.equalsIgnoreCase(role.getName())))
                        .toList();
            }
            realmResource
                    .users()
                    .get(userId)
                    .roles()
                    .realmLevel()
                    .add(roleRepresentationList);

            return "User created successfully!";
        } else if (status == 409) {
            log.error("User exist already...");
            return "User exist already";
        } else {
            log.error("Error creating user, please contact with the administrator.");
            return "Error creating user, please contact with the administrator.";
        }
    }

    /**
     * Metodo para borrar un usuario en keycloak
     * @param userId
     */
    @Override
    public void deleteUser(String userId) {
        KeycloakProvider.getUserResource()
//                .delete() //elimina todo
                .get(userId)
                .remove();
    }

    /**
     * Metodo para actualiza un usuaio en Keycloak
     * @param userId
     * @param userDTO
     */
    @Override
    public void updateUser(String userId, @NonNull UserDTO userDTO) {
        CredentialRepresentation credentialRepresentation = new CredentialRepresentation();
        credentialRepresentation.setTemporary(false);
        credentialRepresentation.setType(CredentialRepresentation.PASSWORD);
        credentialRepresentation.setValue(userDTO.password());

        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setFirstName(userDTO.firstName());
        userRepresentation.setLastName(userDTO.lastName());
        userRepresentation.setEmail(userDTO.email());
        userRepresentation.setUsername(userDTO.username());
        userRepresentation.setEmailVerified(true);
        userRepresentation.setEnabled(true);
        userRepresentation.setCredentials(Collections.singletonList(credentialRepresentation));

        UserResource userResource = KeycloakProvider.getUserResource().get(userId);
        userResource.update(userRepresentation);
    }
}
