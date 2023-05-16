package com.code.util.date.java8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Java8TimeMethodPlusDemo3 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.plus(Period.of(1, 1, 1)));
    }
}
