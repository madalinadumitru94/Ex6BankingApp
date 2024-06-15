package PrincipiileOOP.Ex6bankingapp;

public class OperationNotSupportedException extends Exception{

    public OperationNotSupportedException(String message) {
        super(message);
    }
}