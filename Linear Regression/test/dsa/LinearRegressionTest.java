package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class LinearRegressionTest {
    @Test
    public void AddDataToXAxis(){
        LinearRegression linearRegression = new LinearRegression();
        linearRegression.addXAxis((double)2);
        assertEquals(1, linearRegression.getNumberOfXAxis());
    }

    @Test
    public void AddDataToYAxis(){
        LinearRegression linearRegression = new LinearRegression();
        linearRegression.addYAxis((double)2);
        assertEquals(1, linearRegression.getNumberOfYAxis());
    }

    @Test
    public void AddTwoPairPointToXAxisAndYAxisRespectivelyTest(){
        LinearRegression linearRegression = new LinearRegression();
        linearRegression.addXAxis((double)1);
        linearRegression.addXAxis((double)3);
        assertEquals(2, linearRegression.getNumberOfXAxis());
        linearRegression.addYAxis((double)2);
        linearRegression.addYAxis((double)4);
        assertEquals(2, linearRegression.getNumberOfYAxis());
    }

    @Test
    public void FindTheMeanValueOfTwoXAxisPointsTest(){
        LinearRegression linearRegression = new LinearRegression();
        linearRegression.addXAxis((double)1);
        linearRegression.addXAxis((double)3);
        assertEquals(2, linearRegression.getNumberOfXAxis());
        assertEquals(2, linearRegression.getMeanOfXAxis());
    }

    @Test
    public void FindTheMeanValueOfTwoYAxisPointsTest(){
        LinearRegression linearRegression = new LinearRegression();
        linearRegression.addYAxis((double)2);
        linearRegression.addYAxis((double)4);
        assertEquals(2, linearRegression.getNumberOfYAxis());
        assertEquals(3, linearRegression.getMeanOfYAxis());
    }

    @Test
    public void FindTheSlopeOfTwoPairPointTest(){
        LinearRegression linearRegression = new LinearRegression();
        linearRegression.addXAxis((double)1);
        linearRegression.addXAxis((double)3);
        assertEquals(2, linearRegression.getNumberOfXAxis());
        linearRegression.addYAxis((double)2);
        linearRegression.addYAxis((double)4);
        assertEquals(2, linearRegression.getNumberOfYAxis());
        assertEquals(1, linearRegression.getSlope());
    }
     @Test
    public void FindTheInterceptOfTwoPairPointTest(){
         LinearRegression linearRegression = new LinearRegression();
         linearRegression.addXAxis((double)1);
         linearRegression.addXAxis((double)3);
         assertEquals(2, linearRegression.getNumberOfXAxis());
         linearRegression.addYAxis((double)2);
         linearRegression.addYAxis((double)4);
         assertEquals(2, linearRegression.getNumberOfYAxis());
         assertEquals(1, linearRegression.getIntercept());
     }

     @Test
     public void PredictYValueUsingLinearRegressionWithGivenXValue(){
         LinearRegression linearRegression = new LinearRegression();
         linearRegression.addXAxis((double)1);
         linearRegression.addXAxis((double)3);
         assertEquals(2, linearRegression.getNumberOfXAxis());
         linearRegression.addYAxis((double)2);
         linearRegression.addYAxis((double)4);
         assertEquals(2, linearRegression.getNumberOfYAxis());
         assertEquals(6, linearRegression.predictYValue(5));
     }

}
