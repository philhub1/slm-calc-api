package at.technikum.slmcalcapi.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    @Test
    void addTwoPositiveIntegers(){
        //Arrange
        CalculatorController controller = new CalculatorController();
        int a = 5;
        int b = 6;

        //Act
        int result = controller.calculateSum(a,b);

        //Assert
        assertEquals(11,result);

    }

    @Test
    void addOnePositiveAndOneNegativeIntegers(){
        //Arrange
        CalculatorController controller = new CalculatorController();
        int a = 5;
        int b = -6;

        //Act
        int result = controller.calculateSum(a,b);

        //Assert
        assertEquals(-1,result);

    }

    @Test
    void addTwoNegativeIntegers(){
        //Arrange
        CalculatorController controller = new CalculatorController();
        int a = -5;
        int b = -7;

        //Act
        int result = controller.calculateSum(a,b);

        //Assert
        assertEquals(-12,result);

    }


}