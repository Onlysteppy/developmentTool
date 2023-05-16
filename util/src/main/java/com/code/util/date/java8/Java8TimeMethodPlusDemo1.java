package com.code.util.date.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Java8TimeMethodPlusDemo1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.plusDays(4));
        System.out.println(now.plusWeeks(2));
        System.out.println(now.plusMonths(5));
        System.out.println(now.plusYears(1));
    }
}
