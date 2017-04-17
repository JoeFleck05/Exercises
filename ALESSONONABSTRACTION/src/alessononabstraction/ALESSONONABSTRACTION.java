/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alessononabstraction;

/**
 *
 * @author josephfleck
 */
public class ALESSONONABSTRACTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
      System.out.println("Call mailCheck using Salary reference --");
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
      System.out.println(e.computePay());
    }
    
}
