package edu.gb.proger.exception.hw.sem_2.task_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        Задача 3. Сортировка массива строк.
        Напишите метод,
        который принимает массив строк
        и сортирует его в алфавитном порядке.
        Если входной массив null,
        метод должен вернуть пустой массив
        и вывести сообщение об ошибке.
         */

        String[] strings = { "banana", "apple", "cherry"};

        System.out.println(Arrays.toString(sortStrings(strings)));

    }

    public static String[] sortStrings(String[] strings) {

        if (Arrays.compare(strings, null) == 0) {
            System.out.println("Input array is null. Returning an empty array.");
            return new String[0];
        }

        Arrays.sort(strings);

        return strings;

    }
}
