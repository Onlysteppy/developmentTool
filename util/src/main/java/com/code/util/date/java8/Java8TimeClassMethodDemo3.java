package com.code.util.date.java8;

import java.time.*;

public class Java8TimeClassMethodDemo3 {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2023, 1, 1));//2023-01-01

        System.out.println(LocalTime.of(0, 0, 0));//00:00

        System.out.println(LocalDateTime.of(2023, 1, 1, 0, 0, 0));//2023-01-01T00:00

        System.out.println(LocalDateTime.of(LocalDate.of(2023, 1, 1), LocalTime.of(0, 0, 0)));//2023-01-01T00:00

    }
}
