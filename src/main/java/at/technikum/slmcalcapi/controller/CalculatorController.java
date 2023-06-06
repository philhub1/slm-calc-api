package at.technikum.slmcalcapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/calc/add")
    public int calculateSum(
            @RequestParam int a,
            @RequestParam int b
    ){
        return a+b;
    }


    //1. Testaufruf = http://localhost:8080/calc/add?a=5&b=6

}
