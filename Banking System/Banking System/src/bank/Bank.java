//package bank;
//
//import Execptions.InvalidNegativeAmountException;
//import Execptions.InvalidPasswordException;
//
//public class Bank {
//    private int accounts = 0;
//
//    Bank(){
//
//    }
//
//
//    // helper methods for validating user input
//    public void validateNegativeInput(int amount){
//        if (amount < 0){
//            throw new InvalidNegativeAmountException("Invalid amount");
//        }
//    }
//    public void ValidateLowerThanaccountBalance(int amount){
//        if (amount > accountBalance) throw new InvalidNegativeAmountException("Insufficient funds");
//
//    }
//    public void validatingIncorrectPassword(String inputPassword){
//        if (!inputPassword.equals(this.password)){
//            throw new InvalidPasswordException("Incorrect password");
//        }
//    }
//
//}
