package gmail.cymin0724.jenkinstest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CalculatorController{
    @Autowired
    private Calculator calculator;

    @RequestMapping("/")
    public String index(){
        return "Hello World! Changed!";
    }
    @RequestMapping("/sum")
    public String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return String.valueOf(calculator.sum(a, b));
    }
}
