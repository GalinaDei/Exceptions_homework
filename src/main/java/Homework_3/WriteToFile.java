package Homework_3;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeToFile(String[] arr) {
        String path = arr[0]+".txt";
        try (FileWriter fileWriter = new FileWriter(path, true)){
            for (int i = 0; i < arr.length; i++) {
                fileWriter.append(arr[i]);
                fileWriter.append(" ");
            }
            fileWriter.append("\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
