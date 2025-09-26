import java.util.Scanner;

public class NumberOfYears{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
double Number = input.nextDouble();
// computing for number of years in a given minutes
double Year = Number / 525600;
double YearRemainder =  Number % 525600;
double Day = YearRemainder / 1440;
// System.out.print(Number, "minutes is approximatly" + Year + "years and " + Day + "days ");
System.out.printf("%.1f minutes is approximately %.1f years and %.1f days", Number, Year, Day);
}
}