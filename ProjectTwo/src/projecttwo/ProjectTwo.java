/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        int startingInt = 0;
        int loopStartingPoint = 0;
        int aNumber = 0;
        
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
        
        // create arraylist with hashmap set
        ArrayList<String> keyNames = new ArrayList<String>(frequencyMap.keySet());

        // sort arraylist by hashmap set
        Collections.sort(keyNames);

        // create another arraylist and setting it the size of the keyNames arraylist
        ArrayList<String> stringValueNames = new ArrayList<String>(keyNames.size());

        // Loop thru arraylist and add hashmap set to it
        for(String name : keyNames) {
            stringValueNames.add( name + " " + frequencyMap.get(name).toString() );
        }
        
        // reordering a arraylist
        Collections.sort(stringValueNames);

        String[] tempKeySetArray;
        int[] tempArray = new int[stringValueNames.size()];
        String[] finalReturnArray = new String[stringValueNames.size()];
        String[] returnStringArray = new String[stringValueNames.size()];
        
        for(int i = stringValueNames.size() - 1 ; i >= 0 ; --i) {
            returnStringArray[aNumber] = stringValueNames.get(i);
            tempKeySetArray = returnStringArray[aNumber].split(" ");
            tempArray[aNumber] = Integer.parseInt(tempKeySetArray[1]);
            ++aNumber;
        }
        
        Arrays.sort(tempArray);
        
        tempArray = reverseIntArray(tempArray);
        
        for(int temp : tempArray) {
            for(int i = loopStartingPoint ; i <= stringValueNames.size() - 1 ; ++i){
                if(stringValueNames.get(i).contains(Integer.toString(temp))){
                    finalReturnArray[startingInt] = stringValueNames.get(i);
                    stringValueNames.remove(i);
                    startingInt += 1;                    
                    loopStartingPoint = 0;
                    break;                    
                }
            }
        }
        
        return finalReturnArray;
    }
    
    public int[] reverseIntArray(int[] aArray) {
        int[] reverseArray = new int[aArray.length];
        int theNum = 0;
        for(int i = aArray.length - 1 ; i >= 0 ; --i) {
            reverseArray[theNum] = aArray[i];
            theNum += 1;
        }
        return reverseArray;
    }
    
}
