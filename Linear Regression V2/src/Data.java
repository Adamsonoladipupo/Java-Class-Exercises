import java.util.ArrayList;

public class Data {
    private ArrayList<Double> xAxis = new ArrayList<>();
    private ArrayList<Double> yAxis = new ArrayList<>();
    private ArrayList<Double> xy = new ArrayList<>();
    private ArrayList<Double> xSquare = new ArrayList<>();


    public void addXAxis(double number) {
        this.xAxis.add(number);
    }

    public int getNumberOfXAxis() {
        return this.xAxis.size();
    }

    public void addYAxis(double number) {
        this.yAxis.add(number);
    }

    public int getNumberOfYAxis() {
        return this.yAxis.size();
    }

    public double sumOfXAxis() {
        double summation = 0;
        for (int add = 0; add < this.xAxis.size(); add++){
            summation += this.xAxis.get(add);
        }
        return summation;
    }

    public double sumOfYAxis() {
        double summation = 0;
        for (int add = 0; add < this.yAxis.size(); add++){
            summation += this.yAxis.get(add);
        }
        return summation;
    }

    public double multipleXandYAxis() {
        double xy = 0;
        for (int count = 0; count < this.xAxis.size(); count++){
            xy = this.xAxis.get(count) * this.yAxis.get(count);
        }
        return xy;
    }

    public void addXY() {
        this.xy.add(multipleXandYAxis());
    }

    public int getNumberOfXY() {
        return this.xy.size();
    }

    public void computeXY() {
        double xy = 0;
        for (int count = 0; count < this.xAxis.size(); count++){
            xy += this.xAxis.get(count) * this.yAxis.get(count);
            this.xy.add(xy);
            xy = 0;
        }
    }

    public double sumOfXY() {
        double summation = 0;
        for (int add = 0; add < this.xy.size(); add++){
            summation += this.xy.get(add);
        }
        return summation;
    }


    public double squareOfXAxis() {
        double xaxisSquare = 0;
        for(int count = 0; count < this.xAxis.size(); count++){
            xaxisSquare += Math.pow(this.xAxis.get(count), 2);
        }
        return xaxisSquare;
    }

    public void computeXAxisSquare() {
        double xaxisSquare = 0;
//        double sumOfAllSquares = 0;
        for (int count = 0; count < this.xAxis.size(); count++){
            xaxisSquare = Math.pow(this.xAxis.get(count), 2);
            this.xSquare.add(xaxisSquare);
        }
    }

    public int getNumberOfXAxisSquare() {
        return this.xSquare.size();
    }

    public double sumOfXAxisSquare() {
        double summation = 0;
        for (int add = 0; add < this.xSquare.size(); add++){
            summation += this.xSquare.get(add);
        }
        return summation;
    }

    public double getSlope() {
        computeXAxisSquare();
        computeXY();
        double numeratorValue = (sumOfYAxis() * sumOfXAxisSquare()) - (sumOfXAxis() * sumOfXY());
        double denominatorValue = (getNumberOfXAxis() * sumOfXAxisSquare()) - (Math.pow(sumOfXAxis(),2));
        double slope = numeratorValue / denominatorValue;
        return slope;
    }

    public double getIntercept() {
        computeXAxisSquare();
        computeXY();
        double numeratorValue = getNumberOfXAxis() * sumOfXY() - sumOfXAxis() * sumOfYAxis();
        double denominatorValue = (getNumberOfXAxis() * sumOfXAxisSquare()) - (Math.pow(sumOfXAxis(),2));
        double intercept = numeratorValue / denominatorValue;
        return intercept;
    }

    public void printTable(){

        System.out.println("x\t\ty\t\txy\t\tx^2");
        for (int count = 0; count < this.xAxis.size(); count++){
            System.out.print(xAxis.get(count)+"\t\t");
            System.out.print(yAxis.get(count)+"\t");
            System.out.print(xy.get(count)+"\t");
            System.out.print(xSquare.get(count));
            System.out.println();
        }
    }

    public double predictYWithLinearRegression(double valueOfX) {
        double valueOfY = (getSlope()*(valueOfX)) - getIntercept();
        return valueOfY;
    }
}
