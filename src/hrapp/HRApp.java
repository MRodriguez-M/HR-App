/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hrapp;

/**
 *
 * @author Melissa
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the HR App!");
        
        Employee e1 = new Employee(1, "Peter P.", 4000);
        Employee e2 = new Employee(2, "Otto O.", 10000);
        Department d1 = new Department("Research and Development");
        
        Employee[] employees = {e1, e2};
        d1.addEmployees(employees);
        
        System.out.println(d1.toString());
        for(Employee e: d1.getEmployees()) {
            System.out.println("Employee: " + e);
        }
    }
    
}
