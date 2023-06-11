/*package com.ds.practice;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator=new Calculator();
    }


    @Test
    public void testAdd(){
        int result= (int) calculator.calculate(2,3,'+');
        assertEquals(5,result);
    }

    @Test
    public void testSubract(){
        int result= (int) calculator.calculate(3,2,'-');
        assertEquals(1,result);
    }

    @Test
    public void testMultiply(){
        int result= (int) calculator.calculate(3,2,'*');
        assertEquals(6,result);
    }

    @Test
    public void testDivide(){
        int result= (int) calculator.calculate(30,3,'/');
        assertEquals(10,result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero(){
        calculator.calculate(30,0,'/');

    }
}
*/