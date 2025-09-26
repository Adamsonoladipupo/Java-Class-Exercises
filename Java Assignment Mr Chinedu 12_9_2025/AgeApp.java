/*
Pseudo Code
-collect an input from the user
- stored entered number into a variable
- check is entered number is less than equals to 12, print "you are a child", if not
- check is entered number is grater than equals to 13 and less than equals to 19, print "you are a teen", if not
- check is entered number is grater than equals to 20 and less than equals to 59, print "you are an adult", if not
- print "you are a senior"
*/

import java.util.Scanner;

public class AgeApp{
public static void main(String[] args){
System.out.println("Welcome! This app helps you know your level based on your age");

Scanner input = new Scanner(System.in);
System.out.print("Enter your age: ");
int age = input.nextInt();

// computation
if (age <= 12){System.out.print("You are a CHILD");}
else if (age >= 13 && age <= 19){System.out.print("You are a TEEN");}
else if (age >= 20 && age <= 59){System.out.print("You are an ADULT");}
else {System.out.print("You are a SENIOR");}

}
}