package com.springboot.security.test.config;

//@RestController
//@RequestMapping("/test/security")
public class TestController {
//
//    private final SessionRegistry sessionRegistry;
//
//    @Autowired
//    public TestController(SessionRegistry sessionRegistry) {
//        this.sessionRegistry = sessionRegistry;
//    }
//
//    @GetMapping("/not/secured")
//    public String index() {
//        return "Hello, DUDE...";
//    }
//
//    @GetMapping("/secured")
//    public String indexSecure() {
//        return "Hello, COP...";
//    }
//
//    @GetMapping("/session")
//    public ResponseEntity<?> getDetailsSessionUser() {
//
//        String sessionId = "";
//        User userObject = null;
//
//        List<Object> sessions = sessionRegistry.getAllPrincipals();
//        for (Object session :
//                sessions) {
//            if (session instanceof User) {
//                userObject = (User) session;    // recuperamos el usuario de la sesion
//            }
//            List<SessionInformation> sessionInformations = sessionRegistry.getAllSessions(session,false);
//            for (SessionInformation sessionInformation : sessionInformations) {
//                sessionId = sessionInformation.getSessionId();
//            }
//        }
//
//        Map<String, Object> response = new HashMap<>();
//        response.put("response", "Hello World");
//        response.put("sessionId", sessionId);
//        response.put("sessionUser", userObject);
//
//        return ResponseEntity.ok(response);
//    }
//
}
