package com.alishev.springcourse;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {
    @Override
    public String getSongs() {
        return "Wind cries Mary";
    }
}