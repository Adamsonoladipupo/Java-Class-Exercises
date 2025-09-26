import java.util.Scanner;

public class FutureInvestmentValue{
public static void main(String[] args){
System.out.println("Welcome! This program helps you know the future value of your investment");
Scanner input = new Scanner(System.in);

System.out.print("Enter your investment amount: ");
double InvestmentAmount = input.nextDouble();

System.out.print("Enter the annual interest rate: ");
double InterestRate = input.nextDouble();
// compute the percentage of the interest rate
double InterestRatePCT = InterestRate / 100;

System.out.print("Enter number of years: ");
double NumberOfYears = input.nextDouble();

double InterestRate_Plus1 = InterestRatePCT + 1;

double InvestmentValue = 0;

if ( NumberOfYears == 1){
InvestmentValue = InvestmentAmount * InterestRate_Plus1;
}
if ( NumberOfYears == 2){
InvestmentValue = InvestmentAmount * (InterestRate_Plus1*InterestRate_Plus1);
}
if ( NumberOfYears == 3){
InvestmentValue = InvestmentAmount * (InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1);
}
if ( NumberOfYears == 4){
InvestmentValue = InvestmentAmount * (InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1);
}
if ( NumberOfYears == 5){
InvestmentValue = InvestmentAmount * (InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1);
}
if ( NumberOfYears == 6){
InvestmentValue = InvestmentAmount * (InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1);
}
if ( NumberOfYears == 7){
InvestmentValue = InvestmentAmount * (InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1);
}
if ( NumberOfYears == 8){
InvestmentValue = InvestmentAmount * (InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1);
}
if ( NumberOfYears == 9){
InvestmentValue = InvestmentAmount * (InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1);
}
if ( NumberOfYears == 10){
InvestmentValue = InvestmentAmount * (InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1*InterestRate_Plus1);
}

System.out.printf("Your accumulated value is $%.2f", InvestmentValue );

}
}