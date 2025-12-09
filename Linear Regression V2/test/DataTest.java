import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    Data data;

    @BeforeEach
    public void setUp(){
        data = new Data();
    }
    @Test
    public void addOneValuesToXAxisTest(){
        data.addXAxis(4);
        assertEquals(1, data.getNumberOfXAxis());
    }

    @Test
    public void addOneValuesToYAxisTest(){
        data.addYAxis(4);
        assertEquals(1, data.getNumberOfYAxis());
    }

    @Test
    public void sumOf5ElementsInXAxisTest(){
        data.addXAxis(1);
        data.addXAxis(2);
        data.addXAxis(3);
        data.addXAxis(4);
        data.addXAxis(5);
        assertEquals(5, data.getNumberOfXAxis());
        assertEquals(15, data.sumOfXAxis());
    }

    @Test
    public void sumOf5ElementsInYAxisTest(){
        data.addYAxis(2);
        data.addYAxis(3);
        data.addYAxis(5);
        data.addYAxis(4);
        data.addYAxis(6);
        assertEquals(5, data.getNumberOfYAxis());
        assertEquals(20, data.sumOfYAxis());
    }

    @Test
    public void multipleOneValueOfXAxisAndYAxis(){
        data.addXAxis(2);
        data.addYAxis(3);
        assertEquals(1, data.getNumberOfXAxis());
        assertEquals(1, data.getNumberOfYAxis());
        assertEquals(6, data.multipleXandYAxis());
    }

    @Test
    public void computeXYListbyAddingMultiplicationOfXandYAxis(){
        data.addXAxis(2);
        data.addYAxis(3);
        assertEquals(1, data.getNumberOfXAxis());
        assertEquals(1, data.getNumberOfYAxis());
        assertEquals(6, data.multipleXandYAxis());
        data.addXY();
        assertEquals(1, data.getNumberOfXY());
    }

    @Test
    public void computeXYListbyAdding5XYTest(){
        data.addXAxis(1);
        data.addXAxis(2);
        data.addXAxis(3);
        data.addXAxis(4);
        data.addXAxis(5);
        assertEquals(5, data.getNumberOfXAxis());
        data.addYAxis(2);
        data.addYAxis(3);
        data.addYAxis(5);
        data.addYAxis(4);
        data.addYAxis(6);
        assertEquals(5, data.getNumberOfYAxis());
        data.computeXY();
        assertEquals(5, data.getNumberOfXY());
    }

    @Test
    public void getTheSumOfAllElementInXYList(){
        data.addXAxis(1);
        data.addXAxis(2);
        data.addXAxis(3);
        data.addXAxis(4);
        data.addXAxis(5);
        assertEquals(5, data.getNumberOfXAxis());
        data.addYAxis(2);
        data.addYAxis(3);
        data.addYAxis(5);
        data.addYAxis(4);
        data.addYAxis(6);
        assertEquals(5, data.getNumberOfYAxis());
        data.computeXY();
        assertEquals(5, data.getNumberOfXY());
        assertEquals(69, data.sumOfXY());
    }

    @Test
    public void XAxisSquareTest(){
        data.addXAxis(4);
        assertEquals(1, data.getNumberOfXAxis());
        assertEquals(16, data.squareOfXAxis());
    }

    @Test
    public void computingXsquareList5ValuesTest(){
        data.addXAxis(1);
        data.addXAxis(2);
        data.addXAxis(3);
        data.addXAxis(4);
        data.addXAxis(5);
        assertEquals(5, data.getNumberOfXAxis());
        data.computeXAxisSquare();
        assertEquals(5, data.getNumberOfXAxisSquare());
    }

    @Test
    public void getTheSumOfAllElementInXAxisSquareListTest(){
        data.addXAxis(1);
        data.addXAxis(2);
        data.addXAxis(3);
        data.addXAxis(4);
        data.addXAxis(5);
        assertEquals(5, data.getNumberOfXAxis());
        data.computeXAxisSquare();
        assertEquals(55, data.sumOfXAxisSquare());

    }

    @Test
    public void computeValueOfSlopeTest(){
        data.addXAxis(1);
        data.addXAxis(2);
        data.addXAxis(3);
        data.addXAxis(4);
        data.addXAxis(5);
        assertEquals(5, data.getNumberOfXAxis());
        data.addYAxis(2);
        data.addYAxis(3);
        data.addYAxis(5);
        data.addYAxis(4);
        data.addYAxis(6);
        assertEquals(5, data.getNumberOfYAxis());
        assertEquals(1.3, data.getSlope());
    }

    @Test
    public void computeValueOfIntercept(){
        data.addXAxis(1);
        data.addXAxis(2);
        data.addXAxis(3);
        data.addXAxis(4);
        data.addXAxis(5);
        assertEquals(5, data.getNumberOfXAxis());
        data.addYAxis(2);
        data.addYAxis(3);
        data.addYAxis(5);
        data.addYAxis(4);
        data.addYAxis(6);
        assertEquals(5, data.getNumberOfYAxis());
        assertEquals(0.9, data.getIntercept());

    }

    @Test
    public void predictTheValueOfYIfXIs6UsingLinearRegressionTest(){
        data.addXAxis(1);
        data.addXAxis(2);
        data.addXAxis(3);
        data.addXAxis(4);
        data.addXAxis(5);
        assertEquals(5, data.getNumberOfXAxis());
        data.addYAxis(2);
        data.addYAxis(3);
        data.addYAxis(5);
        data.addYAxis(4);
        data.addYAxis(6);
        assertEquals(5, data.getNumberOfYAxis());

        //assertEquals(6.5, data.predictYWithLinearRegression(6));
        System.out.print(data.predictYWithLinearRegression(6));
    }




}
