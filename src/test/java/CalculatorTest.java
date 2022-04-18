import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double EPSILON = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals(" factorial for True Positive", 5040, calculator.fact(7), EPSILON);
        assertEquals(" factorial for True Positive", 6, calculator.fact(3), EPSILON);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals(" factorial for False Positive", 12430, calculator.fact(9), EPSILON);
        assertNotEquals(" factorial for False Positive", 40, calculator.fact(7), EPSILON);
    }

    @Test
    public void powerTruePositive(){
        assertEquals(" power for True Positive", 16, calculator.power(4, 2), EPSILON);
        assertEquals(" power for True Positive", 625, calculator.power(5, 4), EPSILON);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals(" power for False Positive", 576, calculator.power(20, 3), EPSILON);
        assertNotEquals(" power for False Positive", 34, calculator.power(6, 4), EPSILON);
    }

    @Test
    public void logTruePositive(){
        assertEquals(" natural log for True Positive", 0, calculator.naturalLog(1), EPSILON);
        assertEquals(" natural log for True Positive", 0, calculator.naturalLog(1), EPSILON);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals(" natural log for False Positive", 43, calculator.naturalLog(45), EPSILON);
        assertNotEquals(" natural log for False Positive", 87, calculator.naturalLog(55), EPSILON);
    }

    @Test
    public void sqrtTruePositive(){
        assertEquals(" square root for True Positive", 9, calculator.squareRoot(81), EPSILON);
        assertEquals(" square root for True Positive", 10, calculator.squareRoot(100), EPSILON);
    }

    @Test
    public void sqrtFalsePositive(){
        assertNotEquals(" square root for False Positive", 222, calculator.squareRoot(22), EPSILON);
        assertNotEquals(" square root for False Positive", 444, calculator.squareRoot(44), EPSILON);

    }

    @Test
    public void addTruePositive(){
        assertEquals(" addition for True Positive", 6, calculator.add(4,2), EPSILON);
        assertEquals(" addition for True Positive", 10, calculator.add(8,2), EPSILON);
    }

    @Test
    public void addFalsePositive(){
        assertNotEquals(" addition for False Positive", 60, calculator.add(46,2), EPSILON);
        assertNotEquals(" addition for False Positive", 100, calculator.add(82,2), EPSILON);
    }

    @Test
    public void subTruePositive(){
        assertEquals(" subtraction for True Positive", 38, calculator.sub(40,2), EPSILON);
        assertEquals(" subtraction for True Positive", 66, calculator.sub(86,20), EPSILON);
    }

    @Test
    public void subFalsePositive(){
        assertNotEquals(" subtraction for False Positive", 3, calculator.sub(40,20), EPSILON);
        assertNotEquals(" subtraction for False Positive", 6, calculator.sub(8,20), EPSILON);
    }

    @Test
    public void mulTruePositive(){
        assertEquals(" multiplication for True Positive", 84, calculator.mul(4,21), EPSILON);
        assertEquals(" multiplication for True Positive", 1720, calculator.mul(86,20), EPSILON);
    }

    @Test
    public void mulFalsePositive(){
        assertNotEquals(" multiplication for False Positive", 84, calculator.mul(40,21), EPSILON);
        assertNotEquals(" multiplication for False Positive", 66, calculator.mul(86,2), EPSILON);
    }

    @Test
    public void divTruePositive(){
        assertEquals(" division for True Positive", 40, calculator.div(80,2), EPSILON);
        assertEquals(" division for True Positive", 66, calculator.div(132,2), EPSILON);
    }

    @Test
    public void divFalsePositive(){
        assertNotEquals(" division for False Positive", 400, calculator.div(80,2), EPSILON);
        assertNotEquals(" division for False Positive", 660, calculator.div(132,2), EPSILON);
        assertNotEquals(" division for Divide by zero exception", 66, calculator.div(13,0), EPSILON);

    }
}
