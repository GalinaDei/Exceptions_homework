package Homework_3;

public class DataIncorrectException extends RuntimeException{
    public DataIncorrectException() {
        super("Invalid data entered.");
    }
}
