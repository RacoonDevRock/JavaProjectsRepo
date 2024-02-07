package com.springboot.aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingServicePointCuts {

    @Pointcut("execution(* com.springboot.aop.services.IGreetingService.*(..))")
    public void greetingLoggerPointCut() {}
}
