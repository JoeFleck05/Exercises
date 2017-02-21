package exerciseone;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephfleck
 */
public class ExerciseOne_2 {
    
    public int[] reverseNumberArray(int[] numArray) {
        int[] returnNumberArray = new int[numArray.length];
        int arraySize = numArray.length - 1;
        int newArrayLocation = 0;
        Arrays.sort(numArray);
        for(int i = arraySize ; i >= 0 ; --i) {
            returnNumberArray[newArrayLocation] = numArray[i];
            newArrayLocation += 1;
        }
        return returnNumberArray;
    }
}
