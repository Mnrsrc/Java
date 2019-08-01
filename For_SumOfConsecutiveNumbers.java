/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_sumofconsecutivenumbers;

/**
 *
 * @author Munire
 */
public class For_SumOfConsecutiveNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Sum and average of consecutive numbers:
        String text="";
        float sum=0;
        float mean;
        for(int i=1;i<10;i++){
            sum=sum+i;
           
        }
        mean=sum/10;
        System.out.println("Sum of numbers between 1 to 10:\t" + sum + "\nMeans of numbers between 1 to 10 :\t" + mean);
    }
    
}
