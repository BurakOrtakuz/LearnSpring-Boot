package com.udemy.learningspring.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Tennis bowling for 15 minutes";
    }
}
