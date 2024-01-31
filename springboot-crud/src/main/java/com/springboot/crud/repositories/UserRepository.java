package com.springboot.crud.repositories;

import com.springboot.crud.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
     boolean existsByUsername(String username);
     Optional<UserEntity> findByUsername(String username);
}
