package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.java.course2.calculator.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplParamTest {
    private CalculatorServiceImpl out = new CalculatorServiceImpl();

    private static Stream<Arguments> provideArgumentsForCalculatorTests() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(ONE, MINUS_ONE),
                Arguments.of(MINUS_THREE, MINUS_ONE),
                Arguments.of(ZERO, MINUS_ONE),
                Arguments.of(ZERO, TWO));
    }
    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void ReturnCorrectSumResult(int num1, int num2){
        assertEquals(num1+num2, out.calculateSum(num1,num2));
    }
    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void ReturnCorrectMinusResult(int num1, int num2){
        assertEquals(num1-num2, out.calculateMinusResult(num1,num2));
    }
    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void ReturnCorrectMultiplyResult(int num1, int num2){
        assertEquals(num1*num2, out.calculateMultiplyResult(num1,num2));
    }
    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void ReturnCorrectDivideResult(int num1, int num2){
        assertEquals(num1/num2, out.calculateDivideResult(num1,num2));
    }
}
