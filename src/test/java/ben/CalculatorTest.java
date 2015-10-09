package ben;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Calculator Test.
 */
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testMultiply() {
        int actualProduct = calculator.multiply(6, 7);

        assertEquals("Product should be 42", 42, actualProduct);
    }
}
