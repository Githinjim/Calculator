/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapplication;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kings90
 */
public class EvaluatorTest {
    
    public EvaluatorTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Convertor method, of class Evaluator.
     */
    @Test
    public void testConvertor() {
        System.out.println("Convertor");
        Evaluator instance = null;
        String expResult = "";
        String result = instance.Convertor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Operator method, of class Evaluator.
     */
    @Test
    public void testOperator() {
        System.out.println("Operator");
        char operator = ' ';
        int process1 = 0;
        Evaluator instance = null;
        instance.Operator(operator, process1);
       
    }

    /**
     * Test of endParenthesis method, of class Evaluator.
     */
    @Test
    public void testEndParenthesis() {
        System.out.println("endParenthesis");
        char leftParenthesis ='(';
        Evaluator instance =null;
        instance.endParenthesis(leftParenthesis);
        
    }

    /**
     * Test of Compute method, of class Evaluator.
     */
    @Test
    public void testCompute() {
        System.out.println("Compute");
        String expression = "";
        String expResult = "";
        String result = Evaluator.Compute(expression);
        assertEquals(expResult, result);
      
    }
    
}
