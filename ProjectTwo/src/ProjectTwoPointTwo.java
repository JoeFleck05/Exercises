
import com.sun.xml.internal.fastinfoset.util.StringArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephfleck
 */
public class ProjectTwoPointTwo {
    
    public String[] Execrise2(String[] valueList) {
      String[] finalArray = null;
      
      // create new HashMap
      HashMap<String, Integer> tempHash = new HashMap<String, Integer>();
      // add array to hashmap
      for(String vl : valueList){
          if(tempHash.containsKey(vl)){
              tempHash.put(vl, tempHash.get(vl) + 1);
          } else {
              tempHash.put(vl, 1);
          }
      }
      
      // create arraylist with hashmap keyset
      ArrayList<String> tempKeyArrayList = new ArrayList<>(tempHash.keySet());
      // create arraylist with hashmap size
      ArrayList<String> tempValueArrayList = new ArrayList<String>(tempHash.size());
      // Creating new int 
      int aNumber = 0;
      
      // Loop thru ArrayList of Keys to combine key and value into it
      for(String keyList : tempKeyArrayList) {
          tempValueArrayList.add(keyList + " " + tempHash.get(keyList).toString());
      }
      
      // Sort Arraylist by names
      Collections.sort(tempKeyArrayList);
      
      //Create another String Array
      String[] stringKeyArray;
      // Create temp int array for value
      int[] intTempArray = new int[tempValueArrayList.size()];
      String[] tempStringArray = new String[tempValueArrayList.size()];
      finalArray = new String[tempValueArrayList.size()];
      
      // Loop thru tempValueArrayList to retrieve value
      for(int i = tempValueArrayList.size() - 1 ; i >= 0 ; --i) {
          tempStringArray[aNumber] = tempValueArrayList.get(i);
          stringKeyArray = tempStringArray[aNumber].split(" ");
          intTempArray[aNumber] = Integer.parseInt(stringKeyArray[1]);
          ++aNumber;
      }
          
      Arrays.sort(intTempArray);
      
        reverseIntArray(intTempArray);
      
      
      return finalArray;
    }
    
    public int[] reverseIntArray(int[] numArray) {
        int startingPoint = numArray.length - 1;
        int positionNumber = 0;
        int[] returnNumArray = new int[numArray.length];
        
        for(int i = startingPoint ; i >= 0 ; --i) {
            System.out.println(i);
        }
        
        return returnNumArray;
    }
    
}
