/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxbelementlistenerbeforemarshaltutorial;

import javax.xml.bind.Marshaller;

/**
 *
 * @author josephfleck
 */
public class DepthListener extends Marshaller.Listener {
    private int targetDepth;
   private int depth = 0;

   public DepthListener(int depth) {
      this.targetDepth = depth;
   }

   @Override
   public void beforeMarshal(Object source) {
      depth++;
   }

   @Override
   public void afterMarshal(Object source) {
      depth--;
   }

   public boolean isMarshalDepth() {
      return depth <= targetDepth; 
   }    
}
