/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exerciseone.ExerciseOne_4;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephfleck
 */
public class ExerciseOne_4Test {
    
    public ExerciseOne_4Test() {
    }
    
    ExerciseOne_4 ex4 = new ExerciseOne_4();
    private final int[] START_NUMBER_ARRAY = {90,3,78};
    private final int[] EXPECTED_NUMBER_ARRAY = {90,78,3};
    
    private final int[] START_ONE = {1000,7890,43,12,9,8};
    private final int[] EXPECTED_ONE = {7890,1000,43,12,9,8};
    
    @Test
    public void testOne() { assertArrayEquals(EXPECTED_NUMBER_ARRAY, ex4.reverseOrder(START_NUMBER_ARRAY)); }
           
    @Test
    public void testTwo() { assertArrayEquals(EXPECTED_ONE, ex4.reverseOrder(START_ONE)); }
}
