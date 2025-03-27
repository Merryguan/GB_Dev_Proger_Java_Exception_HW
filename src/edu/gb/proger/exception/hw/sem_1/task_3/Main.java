package edu.gb.proger.exception.hw.sem_1.task_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        Задача 3. Обработка исключений для разностных массивов.
        Реализуйте метод subArraysWithExceptionHandling,
        который принимает два массива целых чисел.
        Метод должен возвращать новый массив,
        где каждый элемент является разностью соответствующих элементов двух входных массивов.
        Если длины массивов не равны,
        выбрасывайте IllegalArgumentException с сообщением "Массивы разной длины".
        Если результат разности оказывается отрицательным,
        выбрасывайте RuntimeException с сообщением "Отрицательный результат разности".
         */

        int[] arr1 = new int[] { 2, 10, 5, 9 };
        int[] arr2 = new int[] { 1, 9, 4, 7, 3 };

        try {
            System.out.println(Arrays.toString(subArraysWithExceptionHandling(arr1, arr2)));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    private static int[] subArraysWithExceptionHandling(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Массивы разной длины");
        }

        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
            if (result[i] < 0) {
                throw new RuntimeException("Отрицательный результат разности");
            }
        }

        return result;

    }
}
