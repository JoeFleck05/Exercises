/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxbelementlistenerbeforemarshaltutorial;

/**
 *
 * @author josephfleck
 */
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class XMLRootAdapter extends XmlAdapter<Root, Root> {

   private DepthListener depthListener;

   Public XMLRootAdapter() {
   }

   public XMLRootAdapter(DepthListener depthListener) {
      this.depthListener = depthListener;
   }

   @Override
   public Root unmarshal(Root root) throws Exception {
      return root;
   }

   @Override
   public Root marshal(Root root) throws Exception {
      if(depthListener != null && !depthListener.isMarshalDepth()) {
         return null;
      }
      return root;
   }
}