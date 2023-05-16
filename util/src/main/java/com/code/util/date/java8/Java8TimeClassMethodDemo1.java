package com.code.util.date.java8;

import java.time.*;

public class Java8TimeClassMethodDemo1 {
    public static void main(String[] args) {
        System.out.println(Instant.now());//2023-05-16T21:03:33.724Z

        System.out.println(LocalDate.now());//2023-05-17

        System.out.println(LocalTime.now());//05:03:33.893

        System.out.println(LocalDateTime.now());//2023-05-17T05:03:33.893

        System.out.println(ZonedDateTime.now());//2023-05-17T05:03:33.894+08:00[Asia/Shanghai]

    }
}
