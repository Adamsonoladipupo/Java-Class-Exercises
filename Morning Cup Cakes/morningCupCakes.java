public class morningCupCakes{
	public static void main(String[] args){
		
	}

	public static int isSmallest(int[] integers){
		int smallest = integers[0];
		for (int count = 1; count < integers.length; count++){
			//System.out.println(integers[count]);
			if (integers[0] > integers[count]){
				smallest = integers[count];
			}
		}
		return smallest;
	}

	public static double isAverage(double[] arrayValues){
		double result = 0;
		for (int count = 0; count < arrayValues.length; count++){
			result += arrayValues[count];
		} result = result / arrayValues.length;

		return result;
	}
}