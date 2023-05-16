package com.code.util.date.java8;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8TimeClassMethodDemo6 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.of(2023, Month.MAY, 17, 0, 0, 0));//2023-05-17T00:00

        Month month = Month.of(12);
        System.out.println(month);//DECEMBER

    }
}
