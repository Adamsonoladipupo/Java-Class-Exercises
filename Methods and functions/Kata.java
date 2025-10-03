public class Kata{
	public static void main(String[] args){

	}

	/*public static boolean isPrime(int number){
		
	}*/

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
}