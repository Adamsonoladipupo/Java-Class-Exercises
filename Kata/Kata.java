public class Kata{
	public static void main(String[] args){

	}

	public static boolean isPrime(int number){
		int factors = 0;
		boolean isPrime ;

		for (int count = 2; count < number; count++){
			if (number % count == 0 ){
				factors++;
			}
		}
		if (factors > 0){isPrime = false;	
		} else {isPrime = true;}

		return isPrime;

	}


	public static int numberOfFactorsIn(int userInput){

		int count = 0;
		int numberOfFactors = 0;
		for ( count = 1; count<=userInput; count++){
			if (userInput%count == 0){
				numberOfFactors++;
			}
		}
		
		return numberOfFactors;
	}

	public static boolean isOdd(int number){
		boolean isOdd;
		if (number % 2 == 0){
			isOdd = false;
		} else {isOdd = true;}

		return isOdd;
	}
	public static boolean isLeapYear(int number){
		boolean isLeapYear;
		if (number % 4 == 0 && number % 100 != 0){
			isLeapYear = true;
		}
		else if(number % 4 == 0 && number % 100 == 0 && number % 400 == 0){
			isLeapYear = true;
		}
		else if(number % 4 == 0 && number % 100 == 0 && number % 400 != 0){
			isLeapYear = false;
		}
		else {isLeapYear = false;}
		

		return isLeapYear;
	}

	public static double fahrenheitToCelsius(double number){
		
		double toCelsius = (5 * (number - 32))/9;
		return toCelsius ;
	}

	public static void printStar(int numberOfRow){

	}
	public static boolean isEven(int number){
		boolean isEven;
		if (number % 2 == 0){
			isEven = true;
		}else {isEven = false;}

		return isEven;
	}

	public static double divide(double number1, double number2){
		double quotient = number1 / number2;
		return quotient;
	}

	public static double removeNegative(double number){
		double removeNegative = -1 * number;
		return removeNegative;
	}

	public static double subtract(double number1, double number2){
		double subtractResult  = number1 - number2;
		double result = removeNegative(subtractResult);
		return result;
	}
	
	public static long factorialOf(long number){
		long factorial = 1;
		for (int count = 1; count <= number; count++){
			factorial = factorial * count;
		}
		
		return factorial;
	}
	
	public static long squareOf(long number){
		long square = number * number;
		return square;
	}

	public static boolean isSquare(int number){
		boolean isSquare;
		double squareRoot = Math.sqrt(number);
		if (squareRoot % 1 == 0){
			isSquare = true;
		}else{isSquare = false;}
		
		return isSquare;
	}




}

