/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exerciseone.ExerciseOne_3;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephfleck
 */
public class ExerciseOne_3Test {
    
    public ExerciseOne_3Test() {
    }
    ExerciseOne_3 ex3 = new ExerciseOne_3();
    private final int[] SENT_NUMBER_ARRAY_ONE = {100,4000,0};
    private final int[] EXPECTED_NUMBER_ARRAY = {4000,100,0};
    
    @Test
    public void testOneResultReverse(){ assertArrayEquals(EXPECTED_NUMBER_ARRAY, ex3.reverseOrder(SENT_NUMBER_ARRAY_ONE)); }
    
    //@Test
    //public void testTwoResultReverse(){ assertArrayEquals(EXPECTED_NUMBER_ARRAY, ex3.reverseOrder(SENT_NUMBER_ARRAY_ONE)); }
}
