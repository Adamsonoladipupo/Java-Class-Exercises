import java.util.Arrays;

public class Greeting{

	public static void main(String[] args){

		int[] list = {5,4,3,9,2,6,1};
		
		//greet();

		checkAndPrint(24);

		//System.out.println(getLargestElement(list));
		
		//System.out.println(Arrays.toString(SortArray(list)));
	}

	public static void greet(){
		System.out.println("Hello World!");
	}

	public static void checkAndPrint(int input){
		for (int count = 1; count <= input; count++){
			if (count % 4 == 0 && count % 6 == 0){
				System.out.println("Hello World");
			}
			else if (count % 4 == 0){
				System.out.println("Hello");
			}
			else if (count % 6 == 0){
				System.out.println("World");
			} else {System.out.println(count);}
		}

	}

	public static int getLargestElement(int[] arrayName){
		int largest = arrayName[0];
		for (int count = 0; count < arrayName.length; count++){
			if (arrayName[count] > largest){
				largest = arrayName[count];
			}
		}
		return largest;
	}

	public static int[] SortArray(int[] arrayName){
		for (int count = 0; count < arrayName.length-1; count++){
			for(int counter = 0; counter < arrayName.length-1-count; counter++){

				if (arrayName[counter] < arrayName[counter+1]){
					int tempVariable = arrayName[counter];
					arrayName[counter] = arrayName[counter+1];
					arrayName[counter+1] = tempVariable;
				}

			}
		}
		return arrayName;
	}
}