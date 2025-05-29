package com.udemy.learningspring.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Run a 5 k";
    }
}
