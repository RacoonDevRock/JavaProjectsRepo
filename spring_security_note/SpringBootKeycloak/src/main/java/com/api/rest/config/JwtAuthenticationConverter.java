package com.api.rest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtClaimNames;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

//AQUI AGREGAREMOS LOS ROLES A USAR
@Component
public class JwtAuthenticationConverter implements Converter<Jwt, AbstractAuthenticationToken> {    // AbstractAuthenticationToken clase que permite autorizarnos, que posee grantedAuthority

    private final JwtGrantedAuthoritiesConverter jwtGrantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter(); // objeto que ayudara a la conversión, extrae roles

    @Value("${jwt.auth.converter.principle-attribute}")
    private String principleAttribute;

    @Value("${jwt.auth.converter.resource-id}")
    private String resourceId;

    //    habra una coleccion de roles, en springsecurity
    @Override
    public AbstractAuthenticationToken convert(Jwt jwt) {
        Collection<GrantedAuthority> authorities = Stream
                .concat(jwtGrantedAuthoritiesConverter.convert(jwt).stream(), // esta tomando el token(jwt) y lo convierte a un stream de datos
                        extractResourceRoles(jwt).stream()) // extrae los roles del jwt luego de extraerlo ^ lo concatena
                .toList();
        return new JwtAuthenticationToken(jwt, authorities, getPrincipleName(jwt));
    }

    private Collection<? extends GrantedAuthority> extractResourceRoles(Jwt jwt) {  //accedemos al cuerpo del token en la seccion resource_acces{spring-client-api-rest{roles{NOMBRE DE LOS ROLES}}}
//        SE DEFINE MAPAS STRING-OBJECT PARA EL ACCESO DEL JSON QUE CONTIENE EL TOKEN, YA QUE FUNCIONA COMO CLAVE-VALOR
        Map<String, Object> resourceAccess;
        Map<String, Object> resource;
        Collection<String> resourceRoles;

        // Los claims son el contenido de un jwt y debemos extraer 'resource_access'
        if (jwt.getClaim("resource_access") == null) {  // suponiendo que este vacio
            return Set.of();    // retornamos una lista vacia, por lo que no brinda autorizacion
        } else {
            resourceAccess = jwt.getClaim("resource_access");
        }

        //tratamos de obtener el claim 'spring-client-api-rest'
        if (resourceAccess.get(resourceId) == null) {
            return Set.of();    // retornamos una lista vacia, por lo que no brinda autorizacion
        } else {
            resource = (Map<String, Object>) resourceAccess.get(resourceId);
        }

        // accedemos a los roles
        if (resource.get("roles") == null) {
            return Set.of();
        } else {
            resourceRoles = (Collection<String>) resource.get("roles"); // debe convertirse a estar manera ROLE_user
        }

        // concatemos con un stream.map() la cadena 'ROLE_' que precede al role
        return resourceRoles
                .stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_".concat(role)))
                .toList();
    }

    private String getPrincipleName(Jwt jwt) {
        String claimName = JwtClaimNames.SUB;   // SUB(constante que brinda el jwt) es el id que identifica el claim, siempre extraera la constante del jwt
        if (principleAttribute != null) {   // si 'preferred_username' (nombreUsuario)generado por el token, esta vacio, por defecto retorna SUB
            claimName = principleAttribute; // seteamos o sobreescribimos el valor de claimName
        }
        return jwt.getClaim(claimName); // si no esta vacio, retorna en el jwt, con metodo getClaim('preferred_username')
    }
}
