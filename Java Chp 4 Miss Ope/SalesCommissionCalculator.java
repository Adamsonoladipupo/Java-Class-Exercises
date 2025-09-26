/*
Pseudocode
- print a message welcoming the user and highlighting the use of the app
- prompt the user to enter the values of sold items 
- save these items into a variable
- calculate the 9% commision on each of these items.
- create a variable to hold the salespersons earnings
- add the commissions to the earnings 
- print the salesperson's earning at the end of the week.
*/

import java.util.Scanner;

public class SalesCommissionCalculator{
public static void main(String[] args){
System.out.println("Welcome! This app helps calculate your sales");
Scanner input = new Scanner(System.in);

double itemValue = 0;
double totalItemValue = 0;
int count = 0;


if (itemValue == 1){
count = 6;
}
while (count < 5){
System.out.print("Enter items value :");
itemValue = input.nextDouble();
count ++;
totalItemValue += itemValue;
}



double commission9Pec = totalItemValue * 0.09;
double earnings = 200 + commission9Pec;

System.out.printf("Your weekly commission is $%.2f and a total earning is $%.2f",commission9Pec, earnings);
}
}
