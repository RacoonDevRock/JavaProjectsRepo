package com.springboot.security.security;

import com.springboot.security.security.filters.JwtAuthenticationFilter;
import com.springboot.security.security.filters.JwtAuthorizationFilter;
import com.springboot.security.security.jwt.JwtUtils;
import com.springboot.security.service.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    private final UserDetailServiceImpl userDetailService;
    private final JwtUtils jwtUtils;
    private final JwtAuthorizationFilter jwtAuthorizationFilter;

    @Autowired
    public SecurityConfig(UserDetailServiceImpl userDetailService, JwtUtils jwtUtils, JwtAuthorizationFilter jwtAuthorizationFilter) {
        this.userDetailService = userDetailService;
        this.jwtUtils = jwtUtils;
        this.jwtAuthorizationFilter = jwtAuthorizationFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity, AuthenticationManager authenticationManager) throws Exception {

        JwtAuthenticationFilter jwtAuthenticationFilter = new JwtAuthenticationFilter(jwtUtils);
        jwtAuthenticationFilter.setAuthenticationManager(authenticationManager);
        jwtAuthenticationFilter.setFilterProcessesUrl("/login");

        return httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers(HttpMethod.GET, "/proof/unsecured").permitAll()
                        .anyRequest().authenticated())
                .sessionManagement(sessManage -> sessManage
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .addFilter(jwtAuthenticationFilter)
                .addFilterBefore(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

//    LO OPTIMO ES OBTENER LOS DATOS DE AUTENTICACION SE RECUPEREN DE LA BD
//    @Bean
//    public UserDetailsService userDetailsService() {
//        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();   //creacion de usuario en memoria
//        inMemoryUserDetailsManager
//                .createUser(User
//                        .withUsername("guillermo")
//                        .password("1234")
//                        .roles()
//                        .build());
//        return inMemoryUserDetailsManager;
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // administra la autenticacion de nuestro usuario en memoria, y exije un passwordEncoder()
    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity httpSecurity, PasswordEncoder passwordEncoder) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder = httpSecurity.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder
                .userDetailsService(userDetailService)
                .passwordEncoder(passwordEncoder);
        return authenticationManagerBuilder.build();
    }

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("1234"));
    }

}
