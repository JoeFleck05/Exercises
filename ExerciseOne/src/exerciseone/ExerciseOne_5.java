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
public class ExerciseOne_5 {
    
    public int[] reverseOrder(int[] arrayOfNumbers) {
        int[] returnOrder = new int[arrayOfNumbers.length];
        int starter = arrayOfNumbers.length - 1;
        int newArrayPosition = 0;
        Arrays.sort(arrayOfNumbers);
        for(int i = starter ; i >= 0 ; --i) {
            returnOrder[newArrayPosition] = arrayOfNumbers[i];
            newArrayPosition += 1;
        }
        return returnOrder;
    }
    
}
