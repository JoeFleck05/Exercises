package jaxbelementlistenerbeforemarshaltutorial;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephfleck
 */
@XmlRootElement
@XmlJavaTypeAdapter(XMLRootAdapter.class)
@XmlType(propOrder={"name", "child"})
public class Root {

   private String name;
   private Root child;

   public Root getChild() {
      return child;
   }

   public void setChild(Root report) {
      this.child = report;
   }
    
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
