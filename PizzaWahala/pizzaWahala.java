import java.util.Scanner;

public class pizzaWahala{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		printPizzaType();
		
	}

	public static void printPizzaType(){
	Scanner input = new Scanner(System.in);
	String docPizzaType = """

	Welcome to Pizza Wahala Joint!
	
	_________________________________________________  
	| Pizza Type  | Number of slices | price per box |
	-------------------------------------------------
	| Sapa size   | 4		 | 2,500	 |
	-------------------------------------------------
	| Small Money | 6		 | 2,900	 |
	-------------------------------------------------
	| Big boys    | 8		 | 4,000	 |
	-------------------------------------------------
	| Odogwu      | 12		 | 5,200	 |
	-------------------------------------------------

	Select a pizza type.
	1-> Sapa size
	2-> Small money
	3-> Big boys
	4-> Odogwu
	
	""";
	System.out.print(docPizzaType);
	String pizzaType = input.nextLine();
	switch (pizzaType){
		case "1"-> {printSapaSize();}
		case "2"-> {printSmallMoney();}
		case "3"-> { printBigBoys();}
		case "4"-> { printOdowu();}
		default -> {
			System.out.print("Invalid input, select from the options");
			printPizzaType();
		}
	}
		
	}

	public static void printSapaSize(){
	Scanner input = new Scanner(System.in);

	String docSapaSize = """

	Sapa size Selected ...
	Cost: $2,500 per box (4 slices)

	How many guest are you inviting?
	
	""";
	System.out.print(docSapaSize);
	double guest = 0;
	guest = input.nextDouble();
	double box = guest / 4;
	if (box % 1 != 0){
		box = box + 1;
		box = (int)box;
	}
	double totalCost = box * 2500;
	double leftOver = (box * 4) - guest;

	System.out.printf("Number of pizza box for %.0f guest is: %.0f %n", guest, box);
	System.out.printf("It will cost you: $%.1f %n", totalCost);
	System.out.printf("Letf over pizza is: %.0f", leftOver);	
	}

	public static void printSmallMoney(){
	Scanner input = new Scanner(System.in);

	String docSapaSize = """

	Small Money size Selected ...
	Cost: $2,900 per box (6 slices)

	How many guest are you inviting?
	
	""";
	System.out.print(docSapaSize);
	double guest = 0;
	guest = input.nextDouble();
	double box = guest / 6;
	if (box % 1 != 0){
		box = box + 1;
		box = (int)box;
	}
	double totalCost = box * 2900;
	double leftOver = (box * 6) - guest;

	System.out.printf("Number of pizza box for %.0f guest is: %.0f %n", guest, box);
	System.out.printf("It will cost you: $%.1f %n", totalCost);
	System.out.printf("Letf over pizza is: %.0f", leftOver);	
	}


	public static void printBigBoys(){
	Scanner input = new Scanner(System.in);

	String docSapaSize = """

	Sapa size Selected ...
	Cost: $4,000 per box (8 slices)

	How many guest are you inviting?
	
	""";
	System.out.print(docSapaSize);
	double guest = 0;
	guest = input.nextDouble();
	double box = guest / 8;
	if (box % 1 != 0){
		box = box + 1;
		box = (int)box;
	}
	double totalCost = box * 4000;
	double leftOver = (box * 8) - guest;

	System.out.printf("Number of pizza box for %.0f guest is: %.0f %n", guest, box);
	System.out.printf("It will cost you: $%.1f %n", totalCost);
	System.out.printf("Letf over pizza is: %.0f", leftOver);	
	}

	public static void printOdowu(){
	Scanner input = new Scanner(System.in);

	String docSapaSize = """

	Sapa size Selected ...
	Cost: $5,200 per box (12 slices)

	How many guest are you inviting?
	
	""";
	System.out.print(docSapaSize);
	double guest = 0;
	guest = input.nextDouble();
	double box = guest / 12;
	if (box % 1 != 0){
		box = box + 1;
		box = (int)box;
	}
	double totalCost = box * 5200;
	double leftOver = (box * 12) - guest;

	System.out.printf("Number of pizza box for %.0f guest is: %.0f %n", guest, box);
	System.out.printf("It will cost you: $%.1f %n", totalCost);
	System.out.printf("Letf over pizza is: %.0f", leftOver);	
	}
}