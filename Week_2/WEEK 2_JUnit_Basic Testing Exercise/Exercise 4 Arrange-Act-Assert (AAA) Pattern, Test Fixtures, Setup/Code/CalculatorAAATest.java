import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAAATest {

    private Calculator calc;

    // Runs before each test method
    @Before
    public void setUp() {
        System.out.println("Setup: Creating Calculator instance");
        calc = new Calculator();
    }

    // Runs after each test method
    @After
    public void tearDown() {
        System.out.println("Teardown: Cleaning up Calculator\n");
        calc = null;
    }

    @Test
    public void testAddition() {
        // Arrange done in @Before

        // Act
        int result = calc.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        int result = calc.subtract(20, 7);
        assertEquals(13, result);
    }

    @Test
    public void testMultiplication() {
        int result = calc.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        int result = calc.divide(30, 5);
        assertEquals(6, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calc.divide(10, 0); // Should throw ArithmeticException
    }
}
