import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void subtract(){
        assertEquals(5, calculator.subtract(10,5));
    }

    @Test
    public void multiply(){
        assertEquals(10, calculator.multiply(5,2));
    }

    @Test
    public void divide(){
        assertEquals(10, calculator.divide(50,5), 0.10);
    }

}
