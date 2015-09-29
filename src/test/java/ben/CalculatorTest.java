package ben;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Calculator Test.
 */
public class CalculatorTest {

    private static final int A = 6;

    private static final int B = 7;

    private static final int EXPECTED_PRODUCT = 42;

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int actualProduct = calculator.multiply(A, B);

        assertEquals("Product should be " + EXPECTED_PRODUCT, EXPECTED_PRODUCT, actualProduct);
    }
}
