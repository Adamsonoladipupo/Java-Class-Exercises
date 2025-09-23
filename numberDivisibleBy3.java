/*
Pseudocode
- declear and initialize a variable to 0 (for numbers within 1 - 30)
- declear and initialize a another variable to 0 (store the sum of numbers divisible by 3)
- Itireate thirthy times, for each itiration check for numbers that has no remainder when divided by 3, i.e. Each of these numbers are added and store in the second variable declared above.
- at the end of the itiration, print the sum of the number (second variable)
*/

public class numberDivisibleBy3{
public static void main(String[] args){
int numbers = 0;
int sumOfNumbers = 0;
for (numbers=1;numbers<=30;numbers++){
if (numbers%3==0){
sumOfNumbers = sumOfNumbers + numbers;
System.out.printf("number divisible by 3: %d %n", numbers);
}
}
System.out.printf("Sum of numbers divisible from 1 - 30 is: %d", sumOfNumbers);

}
}
