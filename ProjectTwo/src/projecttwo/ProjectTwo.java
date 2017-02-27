/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttwo;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author josephfleck
 */
public class ProjectTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String[] Exercise2(String[] stringArray) {
        String[] returnStringArray = null;
        
        // Sort array of string
        Arrays.sort(stringArray);
        
        // creating a hashmap
        HashMap<String, Integer> frequencyMap = new HashMap<String, Integer>();
        
        // write array value to hashmap
        for(String nameObject : stringArray) {
            if(frequencyMap.containsKey(nameObject)) {
                frequencyMap.put(nameObject, frequencyMap.get(nameObject) + 1 );
            } else {
                frequencyMap.put(nameObject,1);
            }
        }
        
        return returnStringArray;
    }
    
}
