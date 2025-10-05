public class NoCodeAnswerFive{
	public static void main(String[] args){


	String docstings = """
		Find and correct the error(s) in each 
		of the following segments of code:

		while (i = 1; i <= 10, i+)
		System.out.println(i); 

	""";
	System.out.print(docstings);
	int i = 1;
	for (i = 1; i <= 10; i++){
		System.out.println(i); 
	}
}
}
