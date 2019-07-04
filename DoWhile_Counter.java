/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile_counter;

/**
 *
 * @author Munire
 */
public class DoWhile_Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String counter="";
        int  number=1;
              System.out.println("Numbers From 1 to 10:\n");
        do  {
            counter=number + counter+ " ";
            number++;
              System.out.println( number );
        }
        while(number<=9);
      
    }
    
}
