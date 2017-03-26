
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
      String[] finalReturnArray = new String[tempValueArrayList.size()];
      String[] stringArray = new String[tempValueArrayList.size()];
      // Creating new int 
      int aNumber = 0;
      
      // Loop thru tempValueArrayList to retrieve value
      for(int i = tempValueArrayList.size() - 1 ; i >= 0 ; --i) {
          stringArray[aNumber] = tempValueArrayList.get(i);
          stringKeyArray = stringArray[aNumber].split(" ");
          intTempArray[aNumber] = Integer.parseInt(stringKeyArray[1]);
          ++aNumber;
      }
          
      Arrays.sort(intTempArray);
      
      int[] theArray = reverseIntArray(intTempArray);
      int startHere = 0;
      int thisNumber = 0;
      
      // outer loop using the int[] array created by the reverseIntArray method
      for(int numArray : theArray){
          // inner loop driven value array to to if tempValueArrayList contains numArray
          for(int i = startHere ; i <= tempValueArrayList.size() - 1 ; ++i){
              if(tempValueArrayList.get(i).contains(Integer.toString(numArray))){
                  finalReturnArray[thisNumber] = tempValueArrayList.get(i);
                  tempValueArrayList.remove(i);
                  thisNumber += 1;
                  startHere = 0;
                  break;
              }
          }
      }
      
      return finalReturnArray;
    }
    
    public int[] reverseIntArray(int[] numArray) {
        int startingPoint = numArray.length - 1;
        int positionNumber = 0;
        int[] returnNumArray = new int[numArray.length];
        
        for(int i = startingPoint ; i >= 0 ; --i) {
            returnNumArray[positionNumber] = numArray[i];
            positionNumber += 1;
        }
        
        return returnNumArray;
    }
    
}
