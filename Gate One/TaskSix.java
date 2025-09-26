public class TaskOne{
public static void main(String[] args){
int multipleOfFour = 1;
int multipleOfEight = 1;
for (int count = 1; count<=5; count++){
	multipleOfFour = multipleOfFour * 4;
	System.out.printf("%10d", multipleOfFour);
}
for (int count = 1; count<=5; count++){
	multipleOfEight = multipleOfEight * 8;
	System.out.printf("%10d", multipleOfEight);
}

}
}