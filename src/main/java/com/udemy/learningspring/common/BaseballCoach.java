package com.udemy.learningspring.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Evet ";
    }
}
