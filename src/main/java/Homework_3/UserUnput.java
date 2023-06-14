package Homework_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserUnput {
    public static String[] getData() throws IncompleteDataException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные через пробел: Фамилия Имя Отчество датарождения(дд.мм.гггг) номертелефона(целое беззнаковое число) пол(латиницей f или m)");
        String text = sc.nextLine();
        String[] data = text.split(" ");
        if (data.length != 6) {
            System.out.println("Incomplete or redundant data entered, try again");
            throw new IncompleteDataException();
            }
        return data;
    }
    static String[] checkInputData() {
        String[] arr = null;
        try {
            arr = UserUnput.getData();

        } catch (IncompleteDataException e) {
            arr = UserUnput.checkInputData();
        }
        return arr;
    }


}
