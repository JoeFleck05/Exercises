/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import projecttwo.ProjectTwo;

/**
 *
 * @author josephfleck
 */
public class ProjectTwoTest {
    
    public ProjectTwoTest() {
    }
    
    ProjectTwo pt = new ProjectTwo();
    
    private final String[] ACTUAL_ARRAY = {"Joe","Joe","Vance","Nancy"};
    private final String[] EXPECTED_ARRAY = {"Joe 2","Nancy 1","Vance 1"};
    
    private final String[] ARRAY_OF_NAMES = {"joe","joe","joe","joe","jared","jared","jared","nathan","julia","julia","julia","nancy","nathan","julia","julia","nancy","jared","jared","jared","jared","jared","jared","jared"};
    private final String[] EXPECTED_RESULT = {"jared 10","julia 5","joe 4","nathan 2","nancy 2"};
    private final String[] PROVED_IT_ARRAY_OF_NAMES = {"joe","joe","joe","jared","jared","nathan"};
    private final String[] PROVE_RETURN_ARRAY = {"joe 3","jared 2","nathan 1"};
    
    @Test
    public void testOne() { assertArrayEquals(EXPECTED_ARRAY, pt.Exercise2(ACTUAL_ARRAY));};
    
    @Test
    public void testTwo() { assertArrayEquals(PROVE_RETURN_ARRAY, pt.Exercise2(PROVED_IT_ARRAY_OF_NAMES)); }
    
    @Test
    public void testThree() { assertArrayEquals(EXPECTED_RESULT, pt.Exercise2(ARRAY_OF_NAMES)); };
    
}
