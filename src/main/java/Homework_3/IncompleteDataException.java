package Homework_3;

public class IncompleteDataException extends RuntimeException{
    public IncompleteDataException() {
        super("Incomplete or redundant data entered");
    }
}
