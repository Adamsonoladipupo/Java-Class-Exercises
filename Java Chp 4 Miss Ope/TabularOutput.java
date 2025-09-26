

public class TabularOutput{
public static void main(String[] args){
 System.out.println("N1  N2  N3  N4");
 double number = 1;
 double raiseToPower = 1;
 double rTPResult = 0;
 for (int i=1; i<5; i++){
  rTPResult = Math.pow(number, raiseToPower);
  System.out.printf("%.0f   ", rTPResult);
  raiseToPower++;
 }


 
}
}
