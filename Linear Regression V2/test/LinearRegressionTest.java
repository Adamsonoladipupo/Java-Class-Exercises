import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearRegressionTest {
    Data data;
    LinearRegression linearRegression;

    @BeforeEach
    public void setUp(){
        data = new Data();
        linearRegression = new LinearRegression();
    }

    @Test
    public void multipleOneValueOfXAxisAndYAxisAddResultToXYArrayListTest(){
        data.addXAxis(2);
        data.addYAxis(3);
        assertEquals(1, data.getNumberOfXAxis());
        assertEquals(1, data.getNumberOfYAxis());
    }

}
