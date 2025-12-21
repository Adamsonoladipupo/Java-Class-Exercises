public class Main {
    public static void main(String[] args){
        int lines = 10; // number of horizontal lines
        System.out.println("(a)");
        for (int i = 0; i < lines; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("(b)");
        for (int i = lines; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("(c)");
        for (int i = lines; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
            for (int k = lines; k >= i; k--){
                System.out.print(' ');
            }
        }

        System.out.println("(d)");
        for (int i = 0; i <= lines; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
            for (int k = lines; k > i; k--){
                System.out.print(' ');
            }
        }

    }
}