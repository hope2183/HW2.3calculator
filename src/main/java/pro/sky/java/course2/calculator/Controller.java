package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/calculator")
    public String calculator() {
        return "Welcome to CALCULATOR. ";
    }

    private final CalculatorServiceInterface calculatorService;

    public Controller(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator/plus")
    public String calculateSum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculator() + "Sum is " + calculatorService.calculateSum(num1, num2);
    }

    @GetMapping("/calculator/minus")
    public String calculateMinusResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculator() + "Result is " + calculatorService.calculateMinusResult(num1, num2);
    }

    @GetMapping("/calculator/multiply")
    public String calculateMultiplyResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculator() + "Result is " + calculatorService.calculateMultiplyResult(num1, num2);
    }

    @GetMapping("/calculator/divide")
    public String calculateDivideResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            return calculator() + "Divide to 0 prohibited!";
        }
        return calculator() + "Result is " + calculatorService.calculateDivideResult(num1, num2);
    }
}
