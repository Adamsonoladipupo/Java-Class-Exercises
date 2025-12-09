public class Main {
    public static void main(String[] args){
        Data data = new Data();
        data.addXAxis(1);
        data.addXAxis(2);
        data.addXAxis(3);
        data.addXAxis(4);

        data.addYAxis(40);
        data.addYAxis(55);
        data.addYAxis(65);
        data.addYAxis(80);


        System.out.println("Sum of all x-axis: " + data.sumOfXAxis());
        System.out.println("Sum of all x-axis: " + data.sumOfYAxis());
        data.computeXY();
        data.computeXAxisSquare();
        data.printTable();
    }
}