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
public class ExerciseOne_4 {
    
    public int[] reverseOrder(int[] numbersArray) {
        int[] returnOrder = new int[numbersArray.length];
        int arraySize = numbersArray.length - 1;
        int aNumber = 0;
        Arrays.sort(numbersArray);
        
        for(int i = arraySize ; i >= 0 ; --i) {
            returnOrder[aNumber] = numbersArray[i];
            aNumber += 1;
        }
        
        
        return returnOrder;
    }
    
}
