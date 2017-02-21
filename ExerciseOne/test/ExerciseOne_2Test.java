/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exerciseone.ExerciseOne_2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephfleck
 */
public class ExerciseOne_2Test {
    ExerciseOne_2 ex = new ExerciseOne_2();
    private final int[] NUMBER_ARRAY_ONE = {2,100,65};
    private final int[] EXPECTED_NUMBER_ARRAYONE = {100,65,2};
    
    private final int[] NUMBER_ARRAY_TWO = {2,100,65,14,67,9,0};
    private final int[] EXPECTED_NUMBER_ARRAYTWO = {100,67,65,14,9,2,0};
    
    @Test
    public void reverseNumberArrayOne() {assertArrayEquals(EXPECTED_NUMBER_ARRAYONE, ex.reverseNumberArray(NUMBER_ARRAY_ONE));}
    
    @Test
    public void reverseNumberArrayTwo() {assertArrayEquals(EXPECTED_NUMBER_ARRAYTWO, ex.reverseNumberArray(NUMBER_ARRAY_TWO));}    
}
