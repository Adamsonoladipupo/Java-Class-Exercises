public class TaskOne{
public static void main(String[] args){
int multipleOfFour = 1;
int multipleOfEight = 1;
int sumOfMultiplesFour = 0;
int sumOfMultiplesEight = 0;
for (int count = 1; count<=5; count++){
	multipleOfFour = multipleOfFour * 4;
	sumOfMultiplesFour += multipleOfFour;
}
for (int count = 1; count<=5; count++){
	multipleOfEight = multipleOfEight * 8;
	sumOfMultiplesEight += multipleOfEight;
}
int SquareOfTotalSuOfMutliples = sumOfMultiplesFour+sumOfMultiplesEight ;
System.out.print(SquareOfTotalSuOfMutliples*SquareOfTotalSuOfMutliples);
}
}