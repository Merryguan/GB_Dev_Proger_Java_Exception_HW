package edu.gb.proger.exception.hw.sem_2.task_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        Задача 4. Нахождение среднеарифметического числа.
        Напишите метод,
        который находит среднее значение массива целых чисел.
        Если массив пустой или null,
        метод должен вернуть Double.NaN
        и вывести сообщение об ошибке.
         */

        int[] array;

        if (args.length > 0) {
            array = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        } else {
            array = new int[] {10, 20, 30, 40, 50};
        }
        double average = findAverage(array);
        System.out.println(average);

    }

    public static double findAverage(int[] array) {

        try {

            if (array == null || array.length == 0) {
                System.out.println("Array is empty or null. Cannot compute average.");
                return Double.NaN;
            }

            double sum = 0;

            for (int num : array) {
                sum += num;
            }

            return sum / array.length;

        } catch (Exception e) {

            System.out.println("An error occurred while computing the average.");
            return Double.NaN;

        }

    }

}
