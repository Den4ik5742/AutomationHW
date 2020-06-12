package HomeWork9.Task2;

import forHomeWork9.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calc;

    @BeforeClass
    public void setUpData(){
        double a = 10;
        double b = 5;
        calc = new Calculator(a, b);
    }

    @Test
    public void testSum(){
        double expectedResult = 15;
        double actualResult = calc.sum();
        Assert.assertEquals(expectedResult, actualResult);
        if(expectedResult == actualResult){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }

    @Test
    public void testSubtraction(){
        double expectedResult = 5;
        double actualResult = calc.subtraction();
        Assert.assertEquals(expectedResult, actualResult);
        if(expectedResult == actualResult){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }

    @Test
    public void testMultiplication(){
        double expectedResult = 50;
        double actualResult = calc.multiplication();
        Assert.assertEquals(expectedResult, actualResult);
        if(expectedResult == actualResult){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }

    @Test
    public void testDivision(){
        double expectedResult = 2;
        double actualResult = calc.division();
        Assert.assertEquals(expectedResult, actualResult);
        if(expectedResult == actualResult){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }

    @Test
    public void testPowAction(){
        double expectedResult = 100000;
        double actualResult = calc.powAction();
        Assert.assertEquals(expectedResult, actualResult);
        if(expectedResult == actualResult){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }

}
