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
    private final String[] EXPECTED_ARRAY = {"Joe","Joe","Nancy","Vance"};
    
    @Test
    public void testOne() { assertArrayEquals(ACTUAL_ARRAY, pt.Exercise2(ACTUAL_ARRAY));};
    
}
