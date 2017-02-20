/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxbelementtut;

import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;


/**
 *
 * @author josephfleck
 */
public class JAXBElementTut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            // Create a student object
            Student student = new Student();
            
            // fill details of the student
            student.setName("Joe");
            student.setId(1);
            student.setAge(43);
        try {
            //Create JAXBelement of type Student
            //Pass it the student object
            JAXBElement<Student> jaxbElement = new JAXBElement(
                    new QName(Student.class.getSimpleName()), Student.class, student);
            
            //Create a String writer object which will be
            //used to write jaxbElment XML to string
            StringWriter writer = new StringWriter();
        
            // create JAXBContext which will be used to update writer
            JAXBContext context = JAXBContext.newInstance(Student.class);
            
            // marshall or convert jaxbElement containing student to xml format
            context.createMarshaller().marshal(jaxbElement, writer);
            
            //print XML string representation of Student object
            System.out.println(writer.toString());
            
        } catch (JAXBException ex) {
            Logger.getLogger(JAXBElementTut.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
