public class exercise_5_9_D{
	public static void main(String[] args){

		String docstrings = """
			The following code should output the 
			even integers from 1 to 50:


			counter = 0;
			do {
				System.out.println(counter + 1);
				counter += 2;
			} while (counter <= 51);
		""";
		System.out.print(docstrings);

			int counter = 0;
			do {
				System.out.println(counter + 1);
				counter += 2;
			} while (counter <= 50);


	}
}