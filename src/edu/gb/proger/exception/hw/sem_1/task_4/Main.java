package edu.gb.proger.exception.hw.sem_1.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Задача 4. Поиск и замена строк.
        Реализуйте метод findAndReplace,
        который принимает массив строк,
        строку для поиска
        и строку для замены.
        Если искомая строка не найдена,
        добавьте сообщение об ошибке в список.
        Верните новый массив строк с выполненной заменой.
         */

        List<String> errors = new ArrayList<>();
        String[] arr = new String[] { "ok", "Hello", "hello", "false", "True" };

        String[] result = findAndReplace(arr, "hello", "Gatcha", errors);

        System.out.println("Результаты замены: " + Arrays.toString(result));

        if (!errors.isEmpty()) {
            System.out.println("Обнаружены ошибки:");
            for (String error : errors) {
                System.out.println(error);
            }
        }

    }

    private static String[] findAndReplace(String[] arr, String target, String replace, List<String> errors) {

        boolean found = false;
        String[] reuslt = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                reuslt[i] = replace;
                found = true;
            } else {
                reuslt[i] = arr[i];
            }
        }

        if (!found) {
            errors.add("Искомая строка \"" + target + "\" не найдена");
        }

        return reuslt;

    }
}
