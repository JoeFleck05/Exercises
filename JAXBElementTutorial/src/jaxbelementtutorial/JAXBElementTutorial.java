/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxbelementtutorial;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
/**
 *
 * @author josephfleck
 */
public class JAXBElementTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating country object
        Country countryIndia = new Country();
        countryIndia.setCountryName("India");
        countryIndia.setCountryPopulation(50000000);
        
        //Creating listOfStates
        ArrayList<State> stateList = new ArrayList<State>();
        State mpState = new State("Madhya Pradesh",10000000);
        stateList.add(mpState);
        State maharastraState = new State("Maharastra",20000000);
        stateList.add(maharastraState);
        State unitedStatesOne = new State("Ohio",110000000);
        stateList.add(unitedStatesOne);
        State unitedStatesTwo = new State("Cleveland",396815);
        stateList.add(unitedStatesTwo);
        State unitedStatesThree = new State("Columbus",787033);
        stateList.add(unitedStatesThree);
        
        countryIndia.setListOfStates(stateList);
        
        try {
            // create JAXB context and initializing Marshaller
            JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            //for getting nice formatted output
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            
            //specify the location and name of xml file to be created
            File XMLfile = new File("/Users/josephfleck/Documents/CountryRecord.xml");
            
            //Writing to XML file
            jaxbMarshaller.marshal(countryIndia, XMLfile);
            //Writing to console
            jaxbMarshaller.marshal(countryIndia, System.out);
            
        } catch (JAXBException e) {
            //some exception occured
            e.printStackTrace();
        }
        
    }
    
}
