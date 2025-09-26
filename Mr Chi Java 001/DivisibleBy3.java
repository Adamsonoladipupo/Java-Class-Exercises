import java.util.Scanner;

public class DivisibleBy3{
public static void main (String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number divisible by 3");
int Number = input.nextInt();

if (Number % 3 == 0){
System.out.printf("%d is divisible by 3", Number);
}

if (Number % 3 != 0){
System.out.printf("%d is not divisible by 3", Number);
}
}
}