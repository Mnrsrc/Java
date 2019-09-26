/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmeticarrays;

/**
 *
 * @author Munire
 */
import javax.swing.*;
public class AritmeticArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 double firstTerm,lastTerm,numberOfTerms=1,accrual,sum=0;
 firstTerm=Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter first number"));
 lastTerm=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter last number:"));
 accrual=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter accrual for aritmetic array:"));
 numberOfTerms=(lastTerm-firstTerm+accrual)/accrual;
     for(double i=firstTerm;i<=lastTerm;i+=accrual){
         sum=(firstTerm+lastTerm)/2*numberOfTerms;
     }
     JOptionPane.showMessageDialog(null, sum, "Sum of Terms:",JOptionPane.PLAIN_MESSAGE);
    }
    
}
