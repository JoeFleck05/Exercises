/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exerciseone.ExerciseOne;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephfleck
 */
public class ExerciseOneTest1 {
    
    ExerciseOne e = new ExerciseOne();
    private final int[] STARTING_ORDER = {99,21,56,104,56,12,1,88,1007};
    private final int[] EXPECTED_ORDER = {1007,104,99,88,56,56,21,12,1};
    
    private final int[] ORDER = {98,21,32,43,9};
    private final int[] EXPECTED = {98,43,32,21,9};
    
    private final int[] ORDER_STARTER = {98,21,32};
    private final int[] EXPECTED_ENDING = {98,32,21};
    
    public ExerciseOneTest1() {
    }
    
    @Test
    public void testOne() {assertArrayEquals(EXPECTED_ORDER,e.returnOrder(STARTING_ORDER));}
    
    @Test
    public void testTwo(){ assertArrayEquals(EXPECTED, e.returnOrder(ORDER)); }
    
    @Test
    public void testThree(){ assertArrayEquals(EXPECTED_ENDING, e.returnOrder(ORDER_STARTER)); }
    
}
