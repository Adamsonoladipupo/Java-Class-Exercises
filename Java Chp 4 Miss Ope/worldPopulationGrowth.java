
public class worldPopulationGrowth{
	public static void main(String[] args){
		
		String doctstring = """
			/* P(t) = P0 x (1 + r)^t where: P(t) is the population after t years, P0 is the current population, r is the growth rate (%), and t is the number of years
*/
		""";

		double population = 0;
		double currentPopulation = 628;
		double population_RP = 0;
		double rate = 0.85;
		int count = 0;
		for (count = 1; count<=100; count++){
			population_RP = currentPopulation * (1 + rate);
			population = math.pow(population_RP, count);
			count--;
			populationDifference = population - math.pow(population_RP, count);
			System.out.printf("Year: %d   Population: %d   difference: %d", count, population);
		}


	}
}