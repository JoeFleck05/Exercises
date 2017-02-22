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
public class ExerciseOne_3 {
    public int[] reverseOrder(int[] numberArray) {
        int[] returnNumberArray = new int[numberArray.length];
        int newInterator = 0;
        int arraySize = numberArray.length - 1;
        Arrays.sort(numberArray);
        
        for(int i = arraySize ; i >= 0 ; --i) {
            returnNumberArray[newInterator] = numberArray[i];
            newInterator += 1;
        }
        
        return returnNumberArray;
    }
}
