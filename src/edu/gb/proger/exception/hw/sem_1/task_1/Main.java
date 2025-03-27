package edu.gb.proger.exception.hw.sem_1.task_1;

public class Main {
    public static void main(String[] args) {
        /*
        Задание 1. Преобразование строки в число.
        Реализуйте метод convertAndSum,
        который принимает массив строк,
        каждая из которых должна быть преобразована в целое число.
        Метод возвращает сумму всех чисел.
        Если хотя бы одна строка не может быть преобразована в число,
        метод должен выбросить исключение NumberFormatException.
        Дополнительно,
        если сумма чисел превышает 100,
        выбрасывайте ArithmeticException с сообщением "Превышен лимит суммы".
         */

        String[] strings = { "40", "60", "Hello" };

        try {
            System.out.println(convertAndSum(strings));
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

    private static int convertAndSum(String[] arr) {

        int result = 0;

        for (String item : arr) {
            try {
                result = result + Integer.parseInt(item);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Ошибка преобразования строки в число: " + item);
            }
        }

        if (result > 100) {
            throw new ArithmeticException("Превышен лимит суммы");
        }

        return result;

    }
}
