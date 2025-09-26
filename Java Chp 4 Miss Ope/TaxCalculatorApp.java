/*
Pseudocode
- display a welcome message to the user and an highlight on what the app is for
- continously ask the user for three inputs and store them in a variable
- compute the tax of each of the inputs by multiplying it with 0.15, 
- if the inputes is greater than 30,000, multiple by 0.20
- create a variable and store the total tax 
- print the total tax.
*/

import java.util.Scanner;

public class TaxCalculatorApp{
public static void main(String[] args){
System.out.println("Welcome! This app helps you calculate your tax");
System.out.println("Enter the monthly earning of three citizens");

Scanner input = new Scanner(System.in);
double earnings = 0;
double tax = 0;
double totalTax = 0;
int count = 0;

while (count < 3){
System.out.print("Enter Citizen monthly earnings: ");
earnings = input.nextDouble();
count ++;

tax = earnings * 0.15;
if (earnings > 30000){
tax = earnings * 0.20;
}
totalTax += tax;

}

System.out.printf("Total tax of the three citizens is: $%.2f", totalTax);
}
}
