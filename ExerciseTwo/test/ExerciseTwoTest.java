/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercisetwo.ExerciseTwo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephfleck
 */
public class ExerciseTwoTest {
    
    public ExerciseTwoTest() {
    }
    
    ExerciseTwo et = new ExerciseTwo();
    
    private final int[] NUMBER_ARRAY = {89,1,24};
    private final int[] EXPECTED_ANSWER = {89,24,1};
    
    @Test
    public void testOne() { assertArrayEquals(EXPECTED_ANSWER, et.returnValue(NUMBER_ARRAY)); }
}
