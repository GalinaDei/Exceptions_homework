package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 * 2. Если необходимо, исправьте данный код https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
 * 3. Дан следующий код, исправьте его там, где требуется https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit.
 * 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Homework_2 {
    public static void main(String[] args) throws IOException {
        GetFloat();  // к Задаче 1.
        double[] intArray = new double[]{1, 3, 3, 5, 6, 23, 2, 13, 34, 98}; // к Задаче 2.
        try {
         int d = 1;
         double catchedRes1 = intArray[8] / d;
         System.out.println("catchedRes1 = " + catchedRes1);
      } catch (ArithmeticException e) {
         System.err.println("Catching exception: " + e);
      }
        try {               // К Задаче 3.
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
        getString();  // К Задаче 4.
    }
    private static void GetFloat() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите дробное числоб знак разделитнля - запятая.");
            float num = 0;
            num = sc.nextFloat();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода.");
            GetFloat();
        }
    }
    /**
     * Задание 2
     * try {
     *    int d = 0;
     *    double catchedRes1 = intArray[8] / d;
     *    System.out.println("catchedRes1 = " + catchedRes1);
     * } catch (ArithmeticException e) {
     *    System.out.println("Catching exception: " + e);
     * }
     *
     */

    /**
     * * Задание 3
     *      *
     *      * public static void main(String[] args) throws Exception {
     *      *    try {
     *      *        int a = 90;
     *      *        int b = 3;
     *      *        System.out.println(a / b);
     *      *        printSum(23, 234);
     *      *        int[] abc = { 1, 2 };
     *      *        abc[3] = 9;
     *      *    } catch (Throwable ex) {
     *      *        System.out.println("Что-то пошло не так...");
     *      *    } catch (NullPointerException ex) {
     *      *        System.out.println("Указатель не может указывать на null!");
     *      *    } catch (IndexOutOfBoundsException ex) {
     *      *        System.out.println("Массив выходит за пределы своего размера!");
     *      *    }
     *      * }
     *      * public static void printSum(Integer a, Integer b) throws FileNotFoundException {
     *      *    System.out.println(a + b);
     *      * }
     */
    private static void printSum(Integer a, Integer b)  {
        System.out.println(a + b);
        }

    private static void getString () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст");
        String text = reader.readLine();
        if (text.length() == 0) {
            System.out.println("Пустую строку вводить нельзя");
            getString();
        }
        System.out.println(text);
    }
}
