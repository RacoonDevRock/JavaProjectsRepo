package com.springboot.security.test.config;

//@Configuration  // anotaciones que indican la config de seguridad
//@EnableWebSecurity  // anotaciones que indican la config de seguridad
public class SecurityConfigTest {

//    // metodo que retorna un objeto de SecurityFilterChain(interface), permite configurar la segurida de la app
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {    // HttpSecurity(args), es un bean de la dependency of SpringSecurity, la clase total de config de spring
//        return http
//                // csrf -> Cross-Site Request Forgery - es una vulnerabilidad(ataque) que ocurre en las aplicaciones web.
//                // Un usuario mediante un formulario envia un request al servidor, entonces el csrf intercepta esta
//                // comunicacion, y es no recomendable ya que, filtra data. Spring ya activa la aseguridad pero para etapa
//                // de desarrollo, debemos inhabilitarlo(disable), habiltarlo al manejar formularios
//                .csrf(AbstractHttpConfigurer::disable)
//
//                // permite configurar la url/endpoints que estaran protegidas o no
//                .authorizeHttpRequests(authz -> authz
//                        // endpoints que seran de acceso disponible, es decir aquellos que tienen autorizacion
//                            .requestMatchers("/test/security/not/secured").permitAll() // permitAll(), cualquiera puede acceder
//
//                            .anyRequest().authenticated() // es decir cualquier otro endpoint que no sea aquel, necesitan autenticarse
//                )
//                .formLogin(login -> login
//                        .permitAll()
//                        .successHandler(successHandler()))  // url al cual se redirije en caso inicie sesion
//                .sessionManagement(session -> session
//                    // ALWAYS(creara una sesion en caso no existe, sino, reutiliza),
//                    // IF_REQUIRED(crea una sesion si es necesario, sino, reutiliza),
//                    // NEVER(no crea ninguna sesion, pero si existe, la usa),
//                    // STATELESS(no crea ninguna sesion, solicitudes de forma independientemente)
//                        .sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
//                        .invalidSessionUrl("/login")  // en caso no logre autenticarse, a donde redirije¿
//                        .sessionFixation()  // otra vulnerabilidad, al manejar con sesiones, toma los ID de sesiones, de otros y accede con aquel, obteniendo autorizacion
//                             .migrateSession()  // al detectar, un ataque a la sesion, automaticamente springsec, generará uno nuevo
//                            // .newSession()    // crea una nueva sesion
//                            // .none()
//                        .maximumSessions(1) // numero maximo de sesiones
//                        .expiredUrl("/login")
//
//                        // podemos definir/inyectar un objeto que se encargara de administrar, todos los registros de la session
//                        .sessionRegistry(sessionRegistry())
//                )
//                .build();
//    }
//
//    @Bean
//    public SessionRegistry sessionRegistry() {
//        return new SessionRegistryImpl();
//    }
//
//    public AuthenticationSuccessHandler successHandler() {
//        return ((request, response, authentication) -> {
//            response.sendRedirect("/api/security/session");
//        });
//    }

}
