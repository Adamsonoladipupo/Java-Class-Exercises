package bank;

public class HelperMethods {

    public static void print(String userInput){
        System.out.print(userInput);
    }

    public static void mainMenu(){
        String menu = """
                Welcome to RoowahBank
                
                1. Create an account
                2. Desposit
                3. Withdraw 
                4. Check account balance
                5. Transfer to other account
                
                0. Exit
                """;
        print(menu);
    }
}
