import java.util.Scanner;

public class vowelOrConsonant{
public static void main(String[] args){
System.out.println("Welcome! This app helps you check if a letter is Consonant or Vowel");

Scanner input = new Scanner(System.in);
System.out.print("Enter a letter: ");
String letter = input.nextLine();
if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u") ) {
	System.out.printf("%s is a Vowel Letter", letter);
} else if (letter.equalsIgnoreCase("b") || letter.equalsIgnoreCase("c") || letter.equalsIgnoreCase("d") || letter.equalsIgnoreCase("f") || letter.equalsIgnoreCase("g") || letter.equalsIgnoreCase("h") || letter.equalsIgnoreCase("j") || letter.equalsIgnoreCase("k") || letter.equalsIgnoreCase("l") || letter.equalsIgnoreCase("m") || letter.equalsIgnoreCase("n") || letter.equalsIgnoreCase("p") || letter.equalsIgnoreCase("q") || letter.equalsIgnoreCase("r") || letter.equalsIgnoreCase("s") || letter.equalsIgnoreCase("t") || letter.equalsIgnoreCase("v") || letter.equalsIgnoreCase("w") || letter.equalsIgnoreCase("x") || letter.equalsIgnoreCase("y") || letter.equalsIgnoreCase("z") ) {
System.out.printf("%s is a Consonant letter", letter);
}
else {
System.out.print("Invalid input");
}
}
}
