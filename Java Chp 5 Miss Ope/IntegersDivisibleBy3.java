public class IntegersDivisibleBy3{
	public static void main(String[] args){
		int sumOfCount = 0;
		for(int count=1; count <=30; count++){
			if (count % 3 == 0){
				sumOfCount += count;
				System.out.println(count);
			}
		}
		System.out.printf("The sum of number divisible by three is : %d", sumOfCount);
}
}