import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(2.0, 1.0);
    }

    @Test
    public void hasNum1(){
        assertEquals(2, calculator.getNumber1(), 0.01);
    }

    @Test
    public void Add(){
        assertEquals(3, calculator.add(), 0.01);
    }

    @Test
    public void Subtract(){
        assertEquals(1, calculator.subtract(), 0.01);
    }

    @Test
    public void Multiply(){
        assertEquals(2, calculator.multiply(), 0.01);
    }

    @Test
    public void Divide(){
        assertEquals(2, calculator.divide(), 0.01);
    }
}
