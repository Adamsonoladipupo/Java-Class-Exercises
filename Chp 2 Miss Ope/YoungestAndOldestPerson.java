import java.util.Scanner;

public class YoungestAndOldestPerson{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("Enter first person name: ");
String Name1 = input.nextLine();
System.out.print("Enter first person age: ");
int Age1 = input.nextInt();

System.out.print("Enter second person name: ");
String Name2 = input.next();
System.out.print("Enter second person age: ");
int Age2 = input.nextInt();

System.out.print("Enter third person name: ");
String Name3 = input.next();
System.out.print("Enter third person age: ");
int Age3 = input.nextInt();

// Computation

int YoungestAge = Age1; 
String YoungestName = Name1;
if (Age2 < YoungestAge ){ YoungestAge = Age2; YoungestName = Name2; }
if (Age3 < YoungestAge ){ YoungestAge = Age3; YoungestName = Name3; }

int OldestAge = Age1; 
String OldestName = Name1;
if (Age2 > OldestAge ){ OldestAge = Age2; OldestName = Name2; }
if (Age3 > OldestAge ){ OldestAge = Age3; OldestName = Name3; }

System.out.printf("%s is the youngest person %n", YoungestName);
System.out.printf("%s is the oldest person", OldestName);
}
}