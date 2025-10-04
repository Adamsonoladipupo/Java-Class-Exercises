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
}

