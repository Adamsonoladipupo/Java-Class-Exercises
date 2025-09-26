import java.util.Scanner;

public class RunwayLength{
public static void main(String[] args){
System.out.println("Welcome! This application helps you calculate the runway length of an airplane");

Scanner input = new Scanner(System.in);
System.out.print("Enter velocity in m/s:");
double v = input.nextDouble();

System.out.print("Enter acceleration in m/s^2:");
double a = input.nextDouble();

double RL = v*v/2*a;
System.out.print("Minimum runway length is : " + RL);
}
}