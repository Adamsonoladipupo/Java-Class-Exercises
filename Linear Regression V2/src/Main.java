public class Main {
    public static void main(String[] args){
        Data data = new Data();
        data.addXAxis(1);
        data.addXAxis(2);
        data.addXAxis(3);
        data.addXAxis(4);

        data.addYAxis(1);
        data.addYAxis(2);
        data.addYAxis(3);
        data.addYAxis(4);

        System.out.println("Sum of all x-axis: " + data.sumOfXAxis());
        System.out.println("Sum of all x-axis: " + data.sumOfYAxis());
        data.computeXY();
        data.computeXAxisSquare();

        data.printTable();

        System.out.println();
        System.out.println("Sum of all xy: " + data.sumOfXY());
        System.out.println("Sum of all x^2: " + data.sumOfXAxisSquare());

        System.out.println();
        System.out.printf("Slope: %.3f",data.getSlope());
        System.out.println();
        System.out.printf("Intercept: %.3f", data.getIntercept());



    }
}