package Execptions;

public class LowAccountBalanceException extends RuntimeException{
    public LowAccountBalanceException (String message){
        super(message);
    }
}
