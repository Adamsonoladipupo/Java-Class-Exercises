import java.util.Scanner;

public class testign2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		public static String sampleMethod( String select){
			String select = input.nextLine();
			String docstring = """
				Welcome!
				Enter 1 to get started
			""";
			System.out.print(docstring);
			String select = input.nextLine();
			switch (select){
				case 1-> { System.out.print("Getting started ...");}
			}
			
		}

		// System.out.print(sampleMethod);
	}
}
