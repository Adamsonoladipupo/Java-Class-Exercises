import java.util.Scanner;

public class FeetToMeter{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number in feets:");
double N_F = input.nextDouble();
double N_M = N_F * 0.305;
System.out.print(N_F + "feet is " + N_M + "meters");
}
}