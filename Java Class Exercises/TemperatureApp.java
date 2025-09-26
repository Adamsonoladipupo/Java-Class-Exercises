/*
Pseudo code
- display a welcome message highlighting what the app is for
- ask the user to enter an input
- store the entered value in a variable
- check if the entered value is greater than 25, print "it is hot" if not
- check if the entered value is less than equals to 25 and greater equals to 16, print "it is warm" if not
- check if the entered value is less than equals to 15 and greater equals to 0, print "it is cold" if not
- check if the entered value is less than 0, print "it is freezing" if not
*/
import java.util.Scanner;

public class TemperatureApp{
public static void main(String[] args){
System.out.println("Welcome! This app helps you understand your temperature reading in Celsius");

Scanner input = new Scanner(System.in);
System.out.print("Enter your temperature reading in celsius: ");
double temp = input.nextDouble();

// computation
if (temp > 25){System.out.print("It is HOT");}
if (temp <= 25 && temp >= 16){System.out.print("It is WARM");}
if (temp <= 15 && temp >= 0){System.out.print("It is COLD");}
if (temp < 0){System.out.print("It is FREEZING");}
}
}