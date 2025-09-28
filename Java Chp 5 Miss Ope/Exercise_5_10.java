import java.util.Scanner;

public class exercise_5_10{
	public static void main(String[] args){
	
		String docstrings = """
			The following code should output the 
			even integers from 1 to 50:


 1// Exercise 5.10: Printing.java
 2 public class Counting {
 3  public static void main( String[] args ) { 
4      Scanner s = new Scanner(System.in); 
5   
6      for (int i = 1; i < 3; i++) {
 7           for (int j = 1; j < 5; j++)
 8              System.out.print('*');
 9            System.out.println("\n#####");
 10      } // end outer for loop 
11  } // end main 
12 } // end class Counting 
		""";
		System.out.print(docstrings);
	
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 5; j++)
			System.out.print('*');
			System.out.println("\n#####");
		}

	}
}