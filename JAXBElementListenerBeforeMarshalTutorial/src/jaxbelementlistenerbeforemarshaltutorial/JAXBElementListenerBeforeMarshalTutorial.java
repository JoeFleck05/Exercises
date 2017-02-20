/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxbelementlistenerbeforemarshaltutorial;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
/**
 *
 * @author josephfleck
 */
public class JAXBElementListenerBeforeMarshalTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
         // create JAXBContext
         JAXBContext jc = JAXBContext.newInstance(Root.class);
         
         // create new root
         Root rootA = new Root();
         rootA.setName("1");
         
         Root rootB = new Root();
         rootB.setName("2");
         rootA.setChild(rootB);
         
         Root rootC = new Root();
         rootC.setName("3");
         rootB.setChild(rootC);
         
         Root rootD = new Root();
         rootD.setName("4");
         rootC.setChild(rootD);
         
         Root rootE = new Root();
         rootE.setName("5");
         rootD.setChild(rootE);
         
         // create marshaller
         Marshaller marshaller = jc.createMarshaller();
         marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         
         // create new depth listener at depth 4
         DepthListener depthListener = new DepthListener(4);
         marshaller.setListener(depthListener);
         marshaller.setAdapter(new XMLRootAdapter(depthListener));
         marshaller.marshal(rootA, System.out);   
      } catch(Exception e) {
         e.printStackTrace();
      }
    }
    
}
