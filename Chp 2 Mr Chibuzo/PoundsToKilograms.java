import java.util.Scanner;
public class PoundsToKilograms{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter your weight in Pounds:");
double W_P = input.nextDouble();
double W_K = W_P * 0.454;
System.out.println(W_P + " pounds is " + W_K + " kilograms");
}
}