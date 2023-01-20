package com.alishev.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    private static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void initMethod() {
        System.out.println("Start init method");
    }

    public void destroyMethod() {
        System.out.println("Start destroy method");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
