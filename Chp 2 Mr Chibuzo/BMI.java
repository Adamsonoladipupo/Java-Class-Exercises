import java.util.Scanner;

public class BMI{
public static void main(String[] args){
// create new scanner to collet users inputs 
Scanner input = new Scanner(System.in);

System.out.println("Welcome to MedPlus.");
System.out.println("Proceed to measure your health using your weight and height");

System.out.print("Enter your weight (pounds):");
int w = input.nextInt();

float w_kg = w * 0.4535f; // covert weight in pounds to kilogram
System.out.printf("Your weight in kilograms is: %.4f%n", w_kg);

System.out.print("Enter your height (inches):");
int h = input.nextInt();

float h_m = h * 0.0254f; // convert height in inches to meter
System.out.printf("Your height in meters is: %.4f%n", h_m);

float hh = h_m * h_m; // square of the height */

// int hh = h * h; // square of the height

float bmi = w / hh;
System.out.printf("Your BMI is: %.4f%n", bmi);

}
}