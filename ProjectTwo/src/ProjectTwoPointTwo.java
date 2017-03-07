
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
      HashMap<String, Integer> tempHash = new HashMap<String,Integer>();
      // add array to hashmap
      for(String vl : valueList){
          if(tempHash.containsKey(vl)){
              tempHash.put(vl, tempHash.get(vl) + 1);
          } else {
              tempHash.put(vl, 1);
          }
      }
      
      return finalArray;
    }
    
}
