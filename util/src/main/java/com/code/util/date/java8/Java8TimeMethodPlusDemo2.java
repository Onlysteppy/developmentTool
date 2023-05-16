package com.code.util.date.java8;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java8TimeMethodPlusDemo2 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now.plusNanos(4));
        System.out.println(now.plusSeconds(2));
        System.out.println(now.plusMinutes(5));
        System.out.println(now.plusHours(1));
    }
}
