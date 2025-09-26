import java.util.Scanner;

public class Ex16Chp2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter an number: ");
int Number = input.nextInt();
int SquareOfNumber = Number*Number;

if (Number == 100 ){
System.out.println("Your number entered is equals to 100");
}
if (Number < 100 ){
System.out.println("Your number entered is less than to 100");
}
if (Number > 100 ){
System.out.println("Your number entered is greater than to 100");
}
if (SquareOfNumber == 100 ){
System.out.println("and it's square is equals to 100");
}
if (SquareOfNumber < 100 ){
System.out.println("and it's square is less than to 100");
}
if (SquareOfNumber > 100 ){
System.out.println("and it's square is greater than to 100");
}
}
}