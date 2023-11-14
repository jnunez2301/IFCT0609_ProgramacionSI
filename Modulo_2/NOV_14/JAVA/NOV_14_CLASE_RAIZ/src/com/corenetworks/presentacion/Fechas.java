package com.corenetworks.presentacion;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Fechas {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date + "LocalDate.now()");
        System.out.println(date.plusDays(30));
        LocalDate parseDate = LocalDate.parse("2021-01-20");
        System.out.println(parseDate + "parseDate");
        LocalDate ofDate = LocalDate.of(2023,10,5);
        System.out.println(ofDate + "LocalDate.of()");

        LocalTime local = LocalTime.now();
        System.out.println(local + " -> LocalTime.now()");
        System.out.println(local.getHour() + ": hour " + local.getMinute() + " minute " + local.getSecond() + " second ");

        LocalTime time1 = LocalTime.of(17, 10);
        LocalTime time2 = LocalTime.of(18, 10);
        Duration duration = Duration.between(time1, time2);
        System.out.println(duration + " duration ");
    }
}
