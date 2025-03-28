package edu.gb.proger.exception.hw.sem_2.task_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        Задание 1. Проверка корректности даты.
        Напишите метод, который проверяет,
        является ли введенная строка корректной датой в формате "YYYY-MM-DD".
        Дата должна быть в пределах от 0001-01-01 до 9999-12-31.
        Если дата корректна, возвращайте её.
        Если нет — сообщение об ошибке.
         */

        System.out.println(validateDate("2025-03-28"));
        System.out.println(validateDate("2025-13-28"));

    }

    private static String validateDate(String date) {

        if (date.length() != 10) {
            return "Invalid date format. Please use YYYY-MM-DD.";
        }

        String yearStr = date.substring(0, 4);
        String monthStr = date.substring(5, 7);
        String dayStr = date.substring(8, 10);

        if (date.charAt(4) != '-' || date.charAt(7) != '-') {
            return "Invalid date format. Please use YYYY-MM-DD.";
        }

        int year = Integer.parseInt(yearStr);
        int month = Integer.parseInt(monthStr);
        int day = Integer.parseInt(dayStr);

        if (year < 1 || year > 9999) {
            return "Year out of range. Must be between 0001 and 9999.";
        }

        if (month < 1 || month > 12) {
            return "Month out of range. Must be between 01 and 12.";
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30,
                31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29; // Февраль в високосный год
        }
        if (day < 1 || day > daysInMonth[month - 1]) {
            return "Day out of range for the given month.";
        }

        return date;

    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
