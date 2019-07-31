/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_exponentialwithseries;

/**
 *
 * @author Munire
 */
 import javax.swing.*;
public class While_ExponentialWithSeries {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        
      double number=Double.parseDouble(JOptionPane.showInputDialog("Please input a number"));
      String text;
      double  result=1;
      double counter=1;
      double factorial=1;
      double power=1;
      while(counter<200)
      {
     
      factorial=factorial*counter;
      power=power*number;
      result=result+power/factorial;
      counter++;
      }
      text="exponantial("+number+")="+result;
      JOptionPane.showMessageDialog(null,text,"Exponential Computation with While Loop:",JOptionPane.PLAIN_MESSAGE);
    }
    
}
