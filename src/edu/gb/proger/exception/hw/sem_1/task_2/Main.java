package edu.gb.proger.exception.hw.sem_1.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Задача 2. Объединение массивов с проверкой длины и содержимого.
        Реализуйте метод mergeAndValidateArrays,
        который принимает два массива целых чисел.
        Метод должен объединить массивы
        и вернуть новый массив.
        Если длины массивов не равны,
        выбрасывайте исключение IllegalArgumentException.
        Если хотя бы один элемент объединенного массива отрицательный,
        выбрасывайте исключение RuntimeException
        с сообщением "Обнаружен отрицательный элемент".
         */

        int[] arr1 = new int[] { 1, 3, 5};
        int[] arr2 = new int[] { 9, -5, 3};

        try {
            System.out.println(Arrays.toString(mergeAndValidateArrays(arr1, arr2)));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    private static int[] mergeAndValidateArrays(int[] arr1, int[] arr2) {

       int[] result = new int[arr1.length+arr2.length];

        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Длины массивов не равны");
        }

        System.arraycopy(arr1, 0, result , 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        for (int item : result) {
            if (item < 0) {
                throw new RuntimeException("Обнаружен отрицательный элемент");
            }
        }

        return result;

    }
}
