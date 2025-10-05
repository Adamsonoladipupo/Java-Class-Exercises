import java.util.Scanner;

public class findError{
	public static void main(String[] args){


	String docstings = """
		Find and correct the error(s) in each 
		of the following segments of code:

		The following code should print whether 
		an integer value is negative or zero:
		
		switch (value) {
			case value < 0:
   				System.out.println("Negative");
  			case 0:
  		 		System.out.println("Zero");
   		}

	""";
	System.out.print(docstings);

	Scanner inputCollector = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int value = inputCollector.nextInt();
	switch (value) {
		case value < 0:
   			System.out.println("Negative");
  		case 0:
  		 	System.out.println("Zero");
   	}
}
}
