package com.springboot.aop.services;

public interface IGreetingService {
    String sayHello(String person, String phrase);
    String sayHelloError(String person, String phrase);
}
