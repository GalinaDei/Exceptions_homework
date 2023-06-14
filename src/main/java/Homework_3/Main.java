package Homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] array =  UserUnput.checkInputData();
        ParseData parseData = new ParseData(array);
        String[] data = ParseData.parse(array);
        WriteToFile.writeToFile(data);


    }
// Ivanova Zalina Germanovna 13.02.2000 89520996756 f
// Zaitsev Sergei Ivanovich 29.02.2001 89520996756 m
// Ivanova Anna Nikolaevna 13.12.1989 89520996756 f
}
