package Homework_3;

import java.util.Objects;

public class ParseData {

    public ParseData(String[] arr) {

    }

    private static boolean isAlpha(String str) {
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDigit(String str) {
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    private static boolean isDate(String s) {
        String [] str = s.split("\\.");
        if (str.length != 3) return  false;
        else if (str[0].length() != 2 | str[1].length() != 2 | str[2].length() != 4) {
            return false;
        }
        else {
            for (int i = 0; i < str.length; i++) {
                char[] chars = str[i].toCharArray();
                for (char c : chars) {
                    if (!Character.isDigit(c)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private static boolean isSex(String str) {
        String str1 = "f";
        String str2 = "m";
        return str.equals(str1) | str.equals(str2);
    }
    static String[] parse(String[] arr) throws DataIncorrectException {
        try {
            if (!isAlpha(arr[0])) {
                System.out.println("Invalid name entered.");
                throw new DataIncorrectException();
            }
            if (!isAlpha(arr[1])) {
                System.out.println("Invalid surname entered.");
                throw new DataIncorrectException();
            }
            if (!isAlpha(arr[2])) {
                System.out.println("Invalid patronymic entered.");
                throw new DataIncorrectException();
            }
            if (!isDate(arr[3])) {
                System.out.println("Invalid birthdate entered.");
                throw new DataIncorrectException();
            }
            if (!isDigit(arr[4])) {
                System.out.println("Invalid phone-number entered.");
                throw new DataIncorrectException();
            }
            if (!isSex(arr[5])) {
                System.out.println("Invalid sex entered.");
                throw new DataIncorrectException();
            }
        } catch (DataIncorrectException e) {
            arr = parse(UserUnput.checkInputData());
        }
        return arr;
    }
//    void checkParseData() {
//        try {
//            ParseData.parseData(this.arr1);
//        } catch (DataIncorrectException e) {
//            ParseData.checkParseData();
//        }
//    }
}


