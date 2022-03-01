package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

    public String calculator() {
        return "Welcome to CALCULATOR. ";
    }

    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public String calculateSum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculator() + "Sum is " + calculatorService.calculateSum(num1, num2);
    }

    @GetMapping("/minus")
    public String calculateMinusResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculator() + "Result is " + calculatorService.calculateMinusResult(num1, num2);
    }

    @GetMapping("/multiply")
    public String calculateMultiplyResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculator() + "Result is " + calculatorService.calculateMultiplyResult(num1, num2);
    }

    @GetMapping("/divide")
    public String calculateDivideResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {

        return calculator() + "Result is " + calculatorService.calculateDivideResult(num1, num2);
    }
}
