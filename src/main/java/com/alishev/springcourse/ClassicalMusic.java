package com.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {
    @PostConstruct
    private void intMethod() {
        System.out.println("InitMethod working");
    }

    @PreDestroy
    private void destroyMethod() {
        System.out.println("DestroyMethod working");
    }

    @Override
    public String getSongs() {
        return "Hungarian Rhapsody";
    }
}