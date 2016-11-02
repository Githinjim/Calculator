/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapplication;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author GithinjiM
 */
public class CalculatorApplication extends JFrame implements
        ActionListener {

    private static final long serialVersionUID = 1L;

    /* set contentPane and border layout */
    JPanel contentPane = new JPanel();
    BorderLayout borderLayout1 = new BorderLayout();

    JTextField box1 = new JTextField("box1 ");  //input expression
    JTextField box2 = new JTextField("box2 ");  // RPN
    JTextField box3 = new JTextField("box2 "); // Result

    public static final int WIDTH = 300;
    public static final int HEIGHT = 400;

    @SuppressWarnings("unused")
    private int i = 0;

    public static void main(String[] args) {
        CalculatorApplication myFrame = new CalculatorApplication();
        /* set the size of the frame in number of pixzels */
        myFrame.setSize(270, 350);

        /* display the frame */
        myFrame.setVisible(true);
    }

    /**
     * The calculator class
     */
    public CalculatorApplication() {

        this.setSize(new Dimension(400, 400));
        this.setTitle("Calculator");
        this.setBounds(200, 200, 500, 500);
        this.setContentPane(contentPane);

        /* set Panel for every button in center of the border layout */
        JPanel southResultPanel = new JPanel(new FlowLayout()); // set panel for button
        southResultPanel.setLayout(new GridLayout(3, 1)); // 5x4 grid layout
        contentPane.add(southResultPanel, BorderLayout.NORTH);
        southResultPanel.add(box1, 0); // set text field
        southResultPanel.add(box2, 1); // set text field
        southResultPanel.add(box3, 2); // set text field
        //this allows the numbers entered to appear on th textfields.
        this.add(southResultPanel, BorderLayout.SOUTH);
        box1.setEditable(true);
        box2.setEditable(true);
        box3.setEditable(true);

        //makes panel for the numbers from 0-9 and
        //also other operands required.
        JPanel buttonPanel = new JPanel(); // set panel for button
        buttonPanel.setLayout(new GridLayout(4, 5)); // 5x4 grid layout
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        buttonPanel.add(new JButton("7"), 0);
        buttonPanel.add(new JButton("8"), 1);
        buttonPanel.add(new JButton("9"), 2);
        buttonPanel.add(new JButton("("), 3); // put button to layout
        buttonPanel.add(new JButton(")"), 4);
        buttonPanel.add(new JButton("4"), 5);
        buttonPanel.add(new JButton("5"), 6);
        buttonPanel.add(new JButton("6"), 7);
        buttonPanel.add(new JButton("!"), 8);
        buttonPanel.add(new JButton("/"), 9);
        buttonPanel.add(new JButton("1"), 10);
        buttonPanel.add(new JButton("2"), 11);
        buttonPanel.add(new JButton("3"), 12);
        buttonPanel.add(new JButton("+"), 13);
        buttonPanel.add(new JButton("*"), 14);
        buttonPanel.add(new JButton("0"), 15);
        buttonPanel.add(new JButton("."), 16);
        buttonPanel.add(new JButton("="), 17);
        buttonPanel.add(new JButton("-"), 18);
        buttonPanel.add(new JButton("C"), 19);//C is a clear button

        contentPane.add(new JButton(), BorderLayout.SOUTH); // clear button
        this.setVisible(true);
    }

    /* This method is for getting input
        /* @param btn get keyword from button
        /* @throws NumberFormatException throw NumberFormatException 
     */
    public void appendResult(String c) {
        boolean isInt = false;
        try {
            i = Integer.parseInt(c);
            isInt = true;
        } catch (NumberFormatException er) {
        }//throws a number exception
        if (isInt || c.equals(".")) {//button selected is number or a point
            box1.setText(box1.getText() + c);
        } else {//only if the button slected is a operator
            box1.setText(box1.getText() + " " + c); //use blank to seperate numbers
        }
    }

    /* This method is window action when window is open*/
 /* @param e this is action when window is open*/
    public void actionPerformed(ActionEvent e) {
        String row1 = null;
        if ("YUP".equals(e.getActionCommand())) {
            // Build a Sting to print to the text box with the queue contents
            // output the string of the queue
            box1.setText((String) row1);

        } else if ("NOPE".equals(e.getActionCommand())) {
            row1 = "You think you selected No";
            // Build a Sting to print to the text box with the queue contents
            // output the string of the queue
            box1.setText((String) row1);

        } else {
            System.out.println(" Error encountered.  No button selected.");
        }
    }

    public void ActionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * define number button
     */
    /* This class is intended for setting up button numbers*/
 /* @author Michael Githinji
       /* @version 1.8.0_25
     */
    public class NumberButton extends JButton implements ActionListener {

        private static final long serialVersionUID = 1L;

        /**
         * /* This method get number and add to action listener /* @param key
         * get number from number button
         */
        public NumberButton(String keyTop) {
            super(keyTop);
            this.addActionListener(this);//sets actionListeners
        }

        /**
         * /* This method is action when button typed /* @param e when a button
         * is typed
         */
        public void actionPerformed(ActionEvent evt) {
            String keyNumber = this.getText();
            appendResult(keyNumber);
        }
    }

    /**
     * defined calculate numbers
     */
    /*This class is for setting up for calculation                               
        /* @author Michael Githinji
        /* @version 1.8.0_25
     */
    public class CalcButton extends JButton implements ActionListener {

        private static final long serialVersionUID = 1L;

        /**
         * /* This method is get operator and add to action listener /* @param
         * operator get operator
         */
        public CalcButton(String op) {
            super(op);
            this.addActionListener(this);
        }

        /**
         * /* This method is action when button typed. Also doing calculate
         * when type "=". /* @param e when operator button is typed
         */
        public void actionPerformed(ActionEvent e) {

            this.getText();
            String expression = box1.getText();
            Evaluator<Object> parser = new Evaluator<Object>(expression);
            String RPNexp = parser.Convertor();
            box2.setText(RPNexp);
            box3.setText("" + String.format("%.4f", Evaluator.Compute(RPNexp)));
        }
    }

    /**
     * define clear button
     */
    public class ClearButton extends JButton implements ActionListener {

        private static final long serialVersionUID = 1L;

        public ClearButton() {
            super("C");
            this.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent evt) {
            box1.setText("");
            box2.setText("");
            box3.setText("");
        }
    }
}
