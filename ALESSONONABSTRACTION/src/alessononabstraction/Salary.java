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
public class Salary extends Employee {
    private double salary;
    
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    
    @Override
    public void mailCheck(){
      System.out.println("Within mailCheck of Salary class ");
      System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }
 
    public double getSalary() {
        return salary;
    }
   
    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }
   
    @Override
    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}
