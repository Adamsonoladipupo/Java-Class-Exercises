public class morningCupCakes{
	public static void main(String[] args){
		
	}


	public static double isAverage(double[] arrayValues){
		double result = 0;
		for (int count = 0; count < arrayValues.length; count++){
			result += arrayValues[count];
		} result = result / arrayValues.length;

		return result;
	}
}