package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        System.out.println(getNameOfWeekDays(7));

    }

    public static String getNameOfWeekDays(int weekDaysNumber) {
        String[] daysOfWeek = {
                "понедельник", "вторник", "среда", "четверг",
                "пятница", "суббота", "воскресенье"
        };

        if (weekDaysNumber >= 1 && weekDaysNumber <= 7) {
            return daysOfWeek[weekDaysNumber - 1];
        } else {
            return "такого дня недели не существует";
        }
    }
}