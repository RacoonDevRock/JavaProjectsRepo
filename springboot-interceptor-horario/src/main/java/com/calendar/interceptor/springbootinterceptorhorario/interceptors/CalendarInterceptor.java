package com.calendar.interceptor.springbootinterceptorhorario.interceptors;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component("calendarInterceptor")
public class CalendarInterceptor implements HandlerInterceptor {

    @Value("${config.calendar.open}")
    private Integer open;

    @Value("${config.calendar.close}")
    private Integer close;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);

        if (hour >= open && hour < close) {
            StringBuilder message = new StringBuilder("Bienvenidos al horario de atencion a clientes");
            message.append(", atendemos desde las ");
            message.append(open);
            message.append("hrs. ");
            message.append("hasta las ");
            message.append(close);
            message.append("hrs. ");
            message.append("Gracias por su visita...");
            request.setAttribute("message", message.toString());
            return true;
        }

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> data = new HashMap<>();
        StringBuilder message = new StringBuilder("Cerrado, fuera de servicio...");
        message.append(" porfavor visitennos desde las ");
        message.append(open);
        message.append(" y las ");
        message.append(close);
        message.append("hrs. ");
        data.put("message", message.toString());
        data.put("data", new Date().toString());
        response.setContentType("application/json");
        response.setStatus(401);
        response.getWriter().write(objectMapper.writeValueAsString(data));

        return  false;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
}
