/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisetwo;

import java.util.Arrays;

/**
 *
 * @author josephfleck
 */
public class ExerciseTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public int[] returnValue(int[] numberArray) {
        int number = 0;
        int[] returnArray = new int[numberArray.length];
        int starter = numberArray.length - 1;
        Arrays.sort(numberArray);
        
        for(int i = starter ; i >= 0 ; --i ) {
            returnArray[number] = numberArray[i];
            number += 1;
        }
        return returnArray;
    }
    
}
