package com.springboot.security;

import com.springboot.security.entity.ERole;
import com.springboot.security.entity.RoleEntity;
import com.springboot.security.entity.UserEntity;
import com.springboot.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@SpringBootApplication
public class SpringBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

	private final PasswordEncoder passwordEncoder;
	private final UserRepository userRepository;

	@Autowired
	public SpringBootSecurityApplication(PasswordEncoder passwordEncoder, UserRepository userRepository) {
		this.passwordEncoder = passwordEncoder;
		this.userRepository = userRepository;
	}

	@Bean
	CommandLineRunner init() {
		return args -> {
			UserEntity userEntity = UserEntity.builder()
					.email("guille@mail.com")
					.username("guille")
					.password(passwordEncoder.encode("1234"))
					.roleEntities(Set.of(RoleEntity.builder()
							.name(ERole.valueOf(ERole.ADMIN.name()))
							.build()))
					.build();

			UserEntity userEntity1 = UserEntity.builder()
					.email("lusie@mail.com")
					.username("lusie")
					.password(passwordEncoder.encode("1234"))
					.roleEntities(Set.of(RoleEntity.builder()
							.name(ERole.valueOf(ERole.USER.name()))
							.build()))
					.build();

			UserEntity userEntity2 = UserEntity.builder()
					.email("drake@mail.com")
					.username("drake")
					.password(passwordEncoder.encode("1234"))
					.roleEntities(Set.of(RoleEntity.builder()
							.name(ERole.valueOf(ERole.INVITED.name()))
							.build()))
					.build();

			userRepository.save(userEntity);
			userRepository.save(userEntity1);
			userRepository.save(userEntity2);
		};
	}
}
