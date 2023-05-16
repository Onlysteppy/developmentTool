package com.code.util.date.java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Java8TimeClassMethodDemo5 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        //上海时间
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);//2023-05-17T05:11:43.024+08:00[Asia/Shanghai]

        //东京时间
        ZonedDateTime tokyoZonedDateTime = now.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoZonedDateTime);//2023-05-17T05:11:43.024+09:00[Asia/Tokyo]


    }
}
