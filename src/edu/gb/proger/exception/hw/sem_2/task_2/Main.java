package edu.gb.proger.exception.hw.sem_2.task_2;

public class Main {
    public static void main(String[] args) {

        /*
        Задача 2. Проверка строки на палиндром.
        Напишите метод,
        который проверяет, является ли введенная строка палиндромом.
        Если строка палиндром,
        возвращайте "Palindrome".
        Если нет —
        "Not a palindrome".
         */

        String input = "A man a plan a canal Panama";

        boolean result = PalindromeChecker.isPalindrome(input);
        System.out.println("Is the input a palindrome? " + result);

    }

    class PalindromeChecker {

        public static boolean isPalindrome(String input) {

            try {

                String cleanedInput = input.replace(" ", "").toLowerCase();

                int length = cleanedInput.length();

                for (int i = 0; i < length / 2; i++) {
                    if (cleanedInput.charAt(i) !=
                            cleanedInput.charAt(length - i - 1)) {
                        return false;
                    }
                }

                return true;

            } catch (Exception e) {

                System.err.println("An error occurred while checking for palindrome.");
                return false;
            }

        }

    }
}
