public class morningCupCakes{
	public static void main(String[] args){
		
	}
	public static double inSmallest(int counter, double userInput){
		double[] integers = new double[userInput];
		for (int count = 0; count < userInput){
			
		}
	}

	public static double isAverage(int indexes, double userInput){
		System.out.print("Enter number of array index");
		int indexes = input.nextInt();
		double result = 0;
		double[] array = new double[indexes];
		for (int count = 0; count < indexes; count++){
			System.out.printf("Enter number for index: %d: ", count);
			array[count] = input.nextDouble();
			result += array[count];
		} 
		result = result / indexes;
		//System.out.printf("The average is: %f", result);

		return result;
	}
}