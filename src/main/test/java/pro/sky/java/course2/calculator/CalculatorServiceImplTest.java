package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.AfterTestMethod;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {

    private CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void ReturnTwoIfOnePlusOne() {
        assertEquals(TWO, out.calculateSum(ONE, ONE));
    }

    @Test
    public void ReturnMinusThreeIfMinusThreePlusZero() {
        assertEquals(MINUS_THREE, out.calculateSum(MINUS_THREE, ZERO));
    }

    @Test
    public void ReturnZeroIfThreeMinusThree() {
        assertEquals(ZERO, out.calculateMinusResult(THREE, THREE));
    }

    @Test
    public void ReturnMinusOneIfOneMinusTwo() {
        assertEquals(MINUS_ONE, out.calculateMinusResult(ONE, TWO));
    }

    @Test
    public void ReturnMinusThreeIfThreeMultiplyMinusOne() {
        assertEquals(MINUS_THREE, out.calculateMultiplyResult(THREE, MINUS_ONE));
    }

    @Test
    public void ReturnZeroIfTwoMultiplyZero() {
        assertEquals(ZERO, out.calculateMultiplyResult(TWO, ZERO));
    }

    @Test
    public void ReturnZeroWhenZeroDivideByOne() {

        assertEquals(ZERO, out.calculateDivideResult(ZERO, ONE));
    }

    @Test
    public void ReturnZeroWhenZeroDivideByMinusOne() {

        assertEquals(ZERO, out.calculateDivideResult(ZERO, MINUS_ONE));
    }

    @Test
    public void ReturnMinusThreeWhenThreeDivideByMinusOne() {

        assertEquals(MINUS_THREE, out.calculateDivideResult(THREE, MINUS_ONE));
    }

    @Test
    public void ReturnExceptionWhenDivideByZero() {

        assertThrows(DivideToZeroException.class, () -> out.calculateDivideResult(THREE, ZERO));
    }

}




