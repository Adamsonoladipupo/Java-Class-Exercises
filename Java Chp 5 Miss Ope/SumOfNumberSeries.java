public class SumOfNumberSeries{
	public static void main(String[] args){
		int nSeries = 0;
		int sumOfSeries = 0;
		for (int counter = 1; counter <= 100; counter++){
			nSeries++;
			sumOfSeries += counter;
			System.out.printf("%d  %10d %n", nSeries, sumOfSeries);
		}
	}
}