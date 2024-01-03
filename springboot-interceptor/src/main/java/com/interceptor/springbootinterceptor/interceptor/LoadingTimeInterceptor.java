package com.interceptor.springbootinterceptor.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Component("loadingTimeInterceptor")
public class LoadingTimeInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(LoadingTimeInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod methodController = (HandlerMethod)handler;
        logger.info("LoadingTimeInterceptor: preHandle()... entrando... " + methodController.getMethod().getName());

        long start = System.currentTimeMillis();
        request.setAttribute("start", start);
        Random random = new Random();
        int delay = random.nextInt(500);
        Thread.sleep(delay);

//        Map<String , String> json = new HashMap<>();
//        json.put("error", "No tienes acceso a este recurso...");
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonString = objectMapper.writeValueAsString(json);
//        response.setContentType("application/json");
//        response.setStatus(403);
//        response.getWriter().write(jsonString);
//        return false;

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception {

        long end = System.currentTimeMillis();
        long start = (long) request.getAttribute("start");
        long result = end - start;

        logger.info("Tiempo transcurrido: "+result+" milisegundos");
        logger.info("LoadingTimeInterceptor: postHandle()... saliendo... " + ((HandlerMethod)handler).getMethod().getName());
    }
}
