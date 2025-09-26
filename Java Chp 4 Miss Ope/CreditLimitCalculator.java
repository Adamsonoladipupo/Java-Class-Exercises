/*
Pseudocode
- display a welcome message to the user and an highlight on what the app is for
- ask the user for five inputs and store them in a variable
- check if the user have exceeded credit limit by: new Balance = initial account Balance + Charges incured by the user - amount of credit applied for.
- print the new about balance of the user. 
- print "credit limited exceeded" if the credit limited have been exceeded.
*/
import java.util.Scanner;
public class CreditLimitCalculator{
public static void main(String[] args){
System.out.println("Welcome! This app helps you know your credit limit");

Scanner input = new Scanner(System.in);

System.out.print("Enter account number: ");
int accountNumber = input.nextInt();

System.out.print("Enter account balance at the beginning of the month: ");
int accountBalance = input.nextInt();

System.out.print("Enter total item charged by the customer: ");
int itemsCharges = input.nextInt();

System.out.print("Enter total of all credits applied to: ");
int creditApplied = input.nextInt();

System.out.print("Enter allowed credit limite: ");
int creditLimit = input.nextInt();

int newBalance = accountBalance + itemsCharges - creditApplied;

System.out.printf("Your new account balance is %d %n", newBalance);

if (newBalance > creditLimit){
System.out.printf("Credit limit exceeded!");
}

}
}