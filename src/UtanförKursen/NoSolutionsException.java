package UtanförKursen;

public class NoSolutionsException extends Throwable {
    public String message;

    public NoSolutionsException(String message) {
        this.message = message;
    }
}
