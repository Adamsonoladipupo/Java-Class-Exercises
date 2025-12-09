package bank;
import java.util.Scanner;
public class ATMManchine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        Bank bank = new Bank();

        String userInput = "9";
        while(!userInput.equals("0")){
            HelperMethods.mainMenu();
            HelperMethods.print("make a selection to proceed: ");
            userInput = input.nextLine();
            switch (userInput){
                case "1" ->{
                    HelperMethods.print("Enter Your name: ");
                    String accountName = input.nextLine();
                    HelperMethods.print("Enter Your password: ");
                    String accountPassword = input.nextLine();
                    Account newAccount = new Account();
                    newAccount.createAccount(accountName, accountPassword);
                    bank.addAccount(newAccount);

                    HelperMethods.print("Account created successfully, your account number is: " + newAccount.getAccountNumber());
                }
                case "2" -> {
                    HelperMethods.print("Enter account number ");
                    String accountNumber = input.nextLine();
                    HelperMethods.print("Enter amount: ");
                    int amount = input.nextInt();
                    Account account = bank.findAccountByAccountNumber(accountNumber);
                    account.deposit(amount,accountNumber);
                    HelperMethods.print(amount + " deposited successfully");

                }
                case "3" -> {
                    HelperMethods.print("Enter your account number ");
                    String accountNumber = input2.nextLine();
                    HelperMethods.print("Enter amount: ");
                    int amount = input2.nextInt();
                    HelperMethods.print("Enter your password: ");
                    String password = input3.nextLine();
                    Account account = bank.findAccountByAccountNumber(accountNumber);
                    account.withdraw(amount, password);
                    HelperMethods.print(amount + " withdrawn successfully");
                }
                case "4" ->{
                    HelperMethods.print("Enter your account number: ");
                    String accountNumber = input2.nextLine();
                    Account account = bank.findAccountByAccountNumber(accountNumber);
                    int balance = account.getAccountBalance();
                    HelperMethods.print("Your account balance is: " + balance);
                }
                case "5" ->{
                    HelperMethods.print("Enter your account number: ");
                    int accountNumber = input2.nextInt();
                    HelperMethods.print("Enter receiver's account number: ");
                    int receiverAccountNumber = input3.nextInt();
                    HelperMethods.print("How much are you transferring: ");
                    int amount = input3.nextInt();
                    HelperMethods.print("Enter your password: ");
                    String password = input3.nextLine();
                }
                case "444" -> {
                    System.out.println("Number of account created: " + bank.getCountAccounts());
                }
                case "0" -> {
                    HelperMethods.print("Thank you for using our bank...");
                }
                default -> {
                    HelperMethods.print("Invalid input");
                }

            }
        }


    }

}
