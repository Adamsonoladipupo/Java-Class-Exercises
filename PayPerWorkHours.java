/*
Pseudo code
- display a welcome message highlighting what the app is for
- ask the user to enter two inputs
- store the first input as work hours and second inputs as hourly rate, store them both in different variables.
- check if the work hours is above 40, if so, multiply the work hour by 1.5. if no, retain the work hour.
- create a new variable as pay as store the multiplication of the work hours and the hourly rate in it. 
- print the variable pay as the total payment
*/

import java.util.Scanner;

public class PayPerWorkHours{
public static void main(String[] args){
System.out.println("Welcome! This app helps you calculate your payment based on your hours of work and work rate");

Scanner input = new Scanner(System.in);
System.out.print("Enter the number of hours worked: ");
double workHours = input.nextDouble();

System.out.print("Enter the hourly rate: ");
double hourlyRate = input.nextDouble();
double pay = 0;
if ( workHours > 40 ){
workHours = workHours * 1.5;
pay = workHours * hourlyRate;
} else {
pay = workHours * hourlyRate;
}

System.out.printf("Your total payment after %.2f hours is: $%.2f", workHours, pay);

}
}
