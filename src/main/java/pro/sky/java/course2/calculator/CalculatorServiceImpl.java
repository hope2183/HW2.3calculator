package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServiceInterface {

    public int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public int calculateMinusResult(int num1, int num2) {
        return num1 - num2;
    }

    public int calculateMultiplyResult(int num1, int num2) {
        return num1 * num2;
    }

    public double calculateDivideResult(int num1, int num2) {

        return (double) num1 / num2;
    }

}
