/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseone;

import java.util.Arrays;

/**
 *
 * @author josephfleck
 */
public class ExerciseOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public int[] returnOrder(int[] n) {
        
        int numberOne = n.length - 1;
        int[] returnValueOrder = new int[numberOne + 1];
        int numberTwo = 0;
        Arrays.sort(n);
      
        for(int i = numberOne ; i >= 0 ; --i) {
            returnValueOrder[numberTwo] = n[i];
            numberTwo += 1;
        }
        return returnValueOrder;
    }
    
}
