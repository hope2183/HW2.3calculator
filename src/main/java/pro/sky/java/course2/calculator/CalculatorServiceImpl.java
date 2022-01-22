package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServiceInterface {

    public String calculateSum(int num1, int num2) {
        int sum = num1+num2;
        return "Sum is " + sum;

    }

    public String calculateMinusResult(int num1, int num2) {
        int minusResult = num1 - num2;
        return "Result is " + minusResult;
    }

    public String calculateMultiplyResult(int num1, int num2) {
        int multiplyResult = num1 * num2;
        return "Result is " + multiplyResult;
    }

    public String calculateDivideResult(int num1, int num2) {
        if (num2 != 0) {
            int divideResult = num1 / num2;
            return "Result is " + divideResult;
        } else {
            return "На ноль делить нельзя!!!";
        }
    }
}