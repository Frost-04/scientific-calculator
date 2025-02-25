import com.gaurav.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sqrtTest() {
        assertEquals(5, Calculator.sqrt(25));
        assertEquals(Double.NaN, Calculator.sqrt(-4));
    }

    @Test
    void factorialTest() {
        assertEquals(120, Calculator.factorial(5));
        assertEquals(1, Calculator.factorial(0));
    }

    @Test
    void lnTest() {
        assertEquals(0, Calculator.ln(1));
        assertEquals(1, Calculator.ln(Math.E));
    }

    @Test
    void powerTest() {
        assertEquals(8, Calculator.power(2, 3));
        assertEquals(1, Calculator.power(10, 0));
    }
}
