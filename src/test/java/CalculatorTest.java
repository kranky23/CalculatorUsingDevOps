import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.fact(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.fact(4), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.fact(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.fact(3), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, calculator.power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, calculator.power(4, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.power(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.power(2, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, calculator.sqroot(4), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.sqroot(1), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.sqroot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.sqroot(4), DELTA);

    }

    @Test
    public void addTruePositive(){
        assertEquals("Finding addition for True Positive", 6, calculator.add(4,2), DELTA);
        assertEquals("Finding addition for True Positive", 10, calculator.add(8,2), DELTA);
    }

    @Test
    public void addFalsePositive(){
        assertNotEquals("Finding addition for False Positive", 60, calculator.add(46,2), DELTA);
        assertNotEquals("Finding addition for False Positive", 100, calculator.add(82,2), DELTA);
    }

    @Test
    public void subTruePositive(){
        assertEquals("Finding subtraction for True Positive", 38, calculator.sub(40,2), DELTA);
        assertEquals("Finding subtraction for True Positive", 66, calculator.sub(86,20), DELTA);
    }

    @Test
    public void subFalsePositive(){
        assertNotEquals("Finding subtraction for False Positive", 3, calculator.sub(40,20), DELTA);
        assertNotEquals("Finding subtraction for False Positive", 6, calculator.sub(8,20), DELTA);
    }

    @Test
    public void mulTruePositive(){
        assertEquals("Finding multiplication for True Positive", 84, calculator.mul(4,21), DELTA);
        assertEquals("Finding multiplication for True Positive", 1720, calculator.mul(86,20), DELTA);
    }

    @Test
    public void mulFalsePositive(){
        assertNotEquals("Finding multiplication for False Positive", 84, calculator.mul(40,21), DELTA);
        assertNotEquals("Finding multiplication for False Positive", 66, calculator.mul(86,2), DELTA);
    }

    @Test
    public void divTruePositive(){
        assertEquals("Finding division for True Positive", 40, calculator.div(80,2), DELTA);
        assertEquals("Finding division for True Positive", 66, calculator.div(132,2), DELTA);
    }

    @Test
    public void divFalsePositive(){
        assertNotEquals("Finding division for False Positive", 400, calculator.div(80,2), DELTA);
        assertNotEquals("Finding division for False Positive", 660, calculator.div(132,2), DELTA);
        assertNotEquals("Finding division for Divide by zero exception", 66, calculator.div(13,0), DELTA);

    }
}
