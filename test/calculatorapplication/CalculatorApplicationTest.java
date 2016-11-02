/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapplication;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kings90
 */
public class CalculatorApplicationTest {

    public CalculatorApplicationTest() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class CalculatorApplication.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculatorApplication.main(args);

    }

    /**
     * Test of expression method, of class CalculatorApplication.
     */
    @Test
    public void testExpression() {
        System.out.println("expression");
        String btn = "";
        CalculatorApplication instance = null;
        instance.expression(btn);

    }

    /**
     * Test of windowOpened method, of class CalculatorApplication.
     */
    @Test
    public void testWindowOpened() {
        System.out.println("windowOpened");
        WindowEvent e = null;
        CalculatorApplication instance = null;
        instance.windowOpened(e);

    }

    /**
     * Test of windowActivated method, of class CalculatorApplication.
     */
    @Test
    public void testWindowActivated() {
        System.out.println("windowActivated");
        WindowEvent e = null;
        CalculatorApplication instance = null;
        instance.windowActivated(e);

    }

    /**
     * Test of windowIconified method, of class CalculatorApplication.
     */
    @Test
    public void testWindowIconified() {
        System.out.println("windowIconified");
        WindowEvent e = null;
        CalculatorApplication instance = null;
        instance.windowIconified(e);

    }

    /**
     * Test of windowDeiconified method, of class CalculatorApplication.
     */
    @Test
    public void testWindowDeiconified() {
        System.out.println("windowDeiconified");
        WindowEvent e = null;
        CalculatorApplication instance = null;
        instance.windowDeiconified(e);

    }

    /**
     * Test of windowDeactivated method, of class CalculatorApplication.
     */
    @Test
    public void testWindowDeactivated() {
        System.out.println("windowDeactivated");
        WindowEvent e = null;
        CalculatorApplication instance = null;
        instance.windowDeactivated(e);

    }

    /**
     * Test of windowClosing method, of class CalculatorApplication.
     */
    @Test
    public void testWindowClosing() {
        System.out.println("windowClosing");
        WindowEvent e = null;
        CalculatorApplication instance = null;
        instance.windowClosing(e);

    }

    /**
     * Test of windowClosed method, of class CalculatorApplication.
     */
    @Test
    public void testWindowClosed() {
        System.out.println("windowClosed");
        WindowEvent e = null;
        CalculatorApplication instance = null;
        instance.windowClosed(e);

    }

    /**
     * Test of actionPerformed method, of class CalculatorApplication.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        CalculatorApplication instance = null;
        instance.actionPerformed(e);

    }

}
