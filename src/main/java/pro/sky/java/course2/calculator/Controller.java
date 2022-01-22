package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final CalculatorServiceInterface calculatorService;

    public Controller (CalculatorServiceInterface calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping ("/calculator")
    public String showWelcome(){
        return "Добро пожаловать в калькулятор. ";
    }

    @GetMapping("/calculator/plus")
    public String calculateSum( @RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return showWelcome() + calculatorService.calculateSum(num1,num2);
    }
    @GetMapping("/calculator/minus")
    public String calculateMinusResult( @RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return showWelcome() + calculatorService.calculateMinusResult(num1, num2);
    }
    @GetMapping("/calculator/multiply")
    public String calculateMultiplyResult( @RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return showWelcome() + calculatorService.calculateMultiplyResult(num1, num2);
    }
    @GetMapping("/calculator/divide")
    public String calculateDivideResult( @RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return showWelcome() + calculatorService.calculateDivideResult(num1, num2);
    }
}
