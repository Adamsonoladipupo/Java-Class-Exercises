package dsa;

import java.util.ArrayList;

public class LinearRegression {
    private ArrayList<Double> xAxis = new ArrayList<>();
    private ArrayList<Double> yAxis = new ArrayList<>();

    LinearRegression(){
    }

    public void addXAxis(Double number) {
        this.xAxis.add(number);
    }

    public int getNumberOfXAxis() {
        return this.xAxis.size();
    }

    public void addYAxis(Double number) {
        this.yAxis.add(number);
    }

    public int getNumberOfYAxis() {
        return this.yAxis.size();
    }

    public double getMeanOfXAxis() {
        Double mean = 0.0;
        for (int count = 0; count < this.xAxis.size(); count++){
            mean += this.xAxis.get(count);
        }
        mean = (mean/this.xAxis.size());
        return mean;
    }

    public double getMeanOfYAxis() {
        double mean = 0;
        for (int count = 0; count < this.yAxis.size(); count++){
            mean += this.yAxis.get(count);
        }
        mean = mean/this.yAxis.size();
        return mean;
    }

    public double getSlope() {
        double slope = 0;
        double meanOfXAxis = getMeanOfXAxis();
        double meanOfYAxis = getMeanOfYAxis();
        double multiply = (this.xAxis.get(0) - meanOfXAxis) * (this.yAxis.get(0) - meanOfYAxis);
        multiply += (this.xAxis.get(1) - meanOfXAxis) * (this.yAxis.get(1) - meanOfYAxis);
        double sumOfXandXBar = Math.pow((this.xAxis.get(0) - meanOfXAxis),2) + Math.pow((this.xAxis.get(1) - meanOfXAxis),2);
        slope = multiply/sumOfXandXBar;
        return slope;
    }

    public double getIntercept() {
        double intercept = 0;
        intercept = getMeanOfYAxis() - getSlope() * getMeanOfXAxis();
        return intercept;
    }

    public double predictYValue(double xValue){
        double predictedYValue = 0;
        predictedYValue = getIntercept() + getSlope() * xValue;
        return predictedYValue;
    }
}
