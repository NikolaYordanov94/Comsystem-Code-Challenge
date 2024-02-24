package com.comsystem.homework.utils;

import org.springframework.stereotype.Component;

@Component
public class RobotUtil {
    public void validateDays(int days){
        if (days <= 0){
            throw new IllegalArgumentException("The days value must be a positive number");
        }
    }

    public void validateNumberOfStones(int numberOfStones){
        if(numberOfStones <= 0){
            throw new IllegalArgumentException("The stones value must be a positive number");
        }
    }
}
