/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exerciseone.ExerciseOne_5;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephfleck
 */
public class ExecriseOne_5Test {
    
    public ExecriseOne_5Test() {
    }
    
    ExerciseOne_5 ex5 = new ExerciseOne_5();
    private final int[] STARTING_ORDER = {123,543,1234};
    private final int[] EXPECTED_ORDER = {1234,543,123};
    
    private final int[] STARTING_ORDER_TWO = {12,5,43,12,34,0,1,2,3,4,90};
    private final int[] EXPECTED_ORDER_TWO = {90,43,34,12,12,5,4,3,2,1,0};
    
    @Test
    public void testOne() { assertArrayEquals(EXPECTED_ORDER, ex5.reverseOrder(STARTING_ORDER)); };
    
    @Test
    public void testTwo() { assertArrayEquals(EXPECTED_ORDER_TWO, ex5.reverseOrder(STARTING_ORDER_TWO)); };
}
