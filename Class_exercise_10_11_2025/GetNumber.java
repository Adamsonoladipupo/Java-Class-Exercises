import java.util.Arrays;

public class GetNumber{
	public static void main(String[] args){
		int[] numberArray = {3,10,7,5};
		int number = 8;

		int[] numberArrayOne = {7,5,2,-4,10};
		int numberOne = 1;

		int[] result = getNewArray(numberArray, number);
		System.out.println(Arrays.toString(result));

		int[] resultOne = getNewArray(numberArrayOne, numberOne);
		System.out.println(Arrays.toString(resultOne));


	}

	public static int[] getNewArray(int[] array ,int number){
		int[] newList = new int[2];
		for (int count = 0; count < array.length; count++){
			for (int counter = 0; counter < array.length-1; counter++){
				if (array[count] + array[counter] == number){
					newList[0] = array[count];
					newList[1] = array[counter];
				}
			}
		}
		return newList;
	}

}