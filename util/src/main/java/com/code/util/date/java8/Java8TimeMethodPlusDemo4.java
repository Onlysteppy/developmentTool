package com.code.util.date.java8;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Java8TimeMethodPlusDemo4 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.plus(1, ChronoUnit.SECONDS));
    }
}
