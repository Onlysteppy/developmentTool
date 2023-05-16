package com.code.util.date.java8;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Java8TimeMethodWithDemo1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.withDayOfMonth(1));
    }
}
