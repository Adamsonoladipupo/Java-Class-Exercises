package Execptions;

public class InvalidNegativeAmountException extends RuntimeException{
    public InvalidNegativeAmountException(String message){
        super(message);
    }
}
