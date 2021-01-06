import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(7, calculator.add(4, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(8, 6));
    }
//
    @Test
    public void canMultiply(){ assertEquals(12, calculator.multiply(3, 4));
    }
//
    @Test
    public void canDivide(){ assertEquals(3.00, calculator.divide(24.00, 8.00), 0.01);
    }


}
