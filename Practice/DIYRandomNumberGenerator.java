public class DIYRandomNumberGenerator{
	public static void main(String[] args){

		System.out.print(getRandom(1, 20));
	}
	public static int getRandom(int min, int max){

		long number = Math.round(Math.random() * (min - max) + min);
		return (int)Math.abs(number);
		
	}
}
