public class NoCodeAnswerForLoop{
public static void main(String[] args){

	String docstrings = """
		The following code should output 
		the odd integers from 19 to 1

		 for (int i = 19; i > 1; i =+ 1)
                  System.out.println(i);
	""";
	System.out.print(docstrings);
		for (int i = 19; i > 1; i-=2)
			System.out.println(i);
}
}