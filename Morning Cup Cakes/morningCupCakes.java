public class morningCupCakes{
	public static void main(String[] args){
		
	}

	public static int isSmallest(int[] integers){
		int smallest = integers[0];
		for (int count = 1; count < integers.length; count++){
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

	public static int countOccurence(int[] integers){
		int occurence = 0;
		for (int count = 0; count < integers.length; count++){
			if (integers[count] == integers[1]){
				occurence++;
			}
		}
		return occurence;
	}

	public static boolean containsElement(int number, int[] integers){
		boolean check = false;
		for (int count = 0; count < integers.length; count++){
			if (number == integers[count]){
				check = true;
			}
		}
		return check;
	}

	public static int getFirstElement(int[] integers){
		int result = 0;
		if (integers.length > 0){
			result = integers[0];			
		} else{	
			result = integers[];
		}
		return result;
		
	}

	public static int getLastElement(int[] integers){
		int result = 0;
		if (integers.length > 0){
			result = integers[integers.length-1];			
		} else{	
			result = integers[];
		}
		return result;
		
	}

}