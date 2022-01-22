package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/calculator")
    public String calculator(){
        return "Добро пожаловать в калькулятор. ";
    }
    private final CalculatorServiceInterface calculatorService;

    public Controller (CalculatorServiceInterface calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator/plus")
    public String calculateSum( @RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculator()+calculatorService.calculateSum(num1,num2);
    }
    @GetMapping("/calculator/minus")
    public String calculateMinusResult( @RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculator() + calculatorService.calculateMinusResult(num1, num2);
    }
    @GetMapping("/calculator/multiply")
    public String calculateMultiplyResult( @RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculator() + calculatorService.calculateMultiplyResult(num1, num2);
    }
    @GetMapping("/calculator/divide")
    public String calculateDivideResult( @RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculator() + calculatorService.calculateDivideResult(num1, num2);
    }
}
