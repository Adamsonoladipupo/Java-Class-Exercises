import java.util.Scanner;

public class EnergyNeeded{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the amount of water in kg:");
double AmountOfWater = input.nextDouble();
System.out.print("Enter the initial temperature:");
double InitialTemperature = input.nextDouble();
System.out.print("Enter the final temperature:");
double FinalTemprature = input.nextDouble();
double Energy = AmountOfWater * (FinalTemprature - InitialTemperature) * 4181;
System.out.printf("The amount of Energy needed is : %.3f joules", Energy);

}
}