/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallcalc;

/**
 *
 * @author rahulthawal
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class SmallCalc implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    JFrame frame;
    JLabel firstOperand, secondOperand, answer;
    JTextField op1, op2, ans;
    JButton plus, mul;
    
    
    // setting layout
 public void initGUI ( ) {
 
       frame = new JFrame();


       firstOperand = new JLabel("First Operand");
       secondOperand = new JLabel("Second Operand");
       answer = new JLabel("Answer");


       op1 = new JTextField (15);
       op2 = new JTextField (15);
       ans = new JTextField (15);

       plus = new JButton("+");
       plus.setPreferredSize(new Dimension(70,25));

       mul = new JButton("*");
       mul.setPreferredSize(new Dimension(70,25));

       Container cont = frame.getContentPane();
       cont.setLayout(new FlowLayout());

       cont.add(firstOperand);
       cont.add(op1);

        cont.add(secondOperand);
        cont.add(op2);

        cont.add(plus);
        cont.add(mul);
        
        cont.add(answer);
        cont.add(ans);
        
        plus.addActionListener(this);
        mul.addActionListener(this);


 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(200, 220);
frame.setVisible(true);
 }
 //constructor
public SmallCalc ( ) {
initGUI();
        }


public void actionPerformed(ActionEvent event) {


String oper, result;
int num1, num2, res = 0;
/* All the information regarding an event is contained
inside the event object. Here we are calling the
getSource() method on the event object to figure out
the button that has generated that event. */

if (event.getSource() == plus) {

 oper = op1.getText();
 num1 = Integer.parseInt(oper);

 oper = op2.getText();
 num2 = Integer.parseInt (oper);
 
 res = num1+num2;
 result = res +"";
 
 ans.setText(result);
 }
else if (event.getSource() == plus) {

 oper = op1.getText();
 num1 = Integer.parseInt(oper);

 oper = op2.getText();
 num2 = Integer.parseInt (oper);
 
 res = num1*num2;
 result = res +"";
 
 ans.setText(result);
 }

}
    public static void main(String[] args) {
        // TODO code application logic here
        SmallCalc sc = new SmallCalc();
    }
    
}
