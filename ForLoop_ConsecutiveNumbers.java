
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forloop_consecutivenumbers;

/**
 *
 * @author Munire
 */
import javax.swing.*;
public class ForLoop_ConsecutiveNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Consecutive numbers between 0 to 100:
       String  text = "";
       for(int i=0;i<101;i++)
       {
        text=text+i+" ";
      
       } 
       JOptionPane.showMessageDialog(null,text,"Consecutive Numbers between 0 to 100:",JOptionPane.PLAIN_MESSAGE);

    }
    
}
