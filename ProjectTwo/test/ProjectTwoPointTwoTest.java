/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephfleck
 */
public class ProjectTwoPointTwoTest {
    ProjectTwoPointTwo pp = new ProjectTwoPointTwo();
    
    private final String[] VALUE_LIST = {"Joe","Joe","Nathan","Nate"};
    private final String[] EXPECTED_LIST = {"Joe 2","Nate 1","Nathan 1"};
    
    public ProjectTwoPointTwoTest() {
    }
    
    @Test
    public void testOne() { assertArrayEquals(EXPECTED_LIST, pp.Execrise2(VALUE_LIST)); }
}
