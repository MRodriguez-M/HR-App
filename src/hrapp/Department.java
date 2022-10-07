/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

/**
 *
 * @author Melissa
 */
public class Department {
    private String deptName;
    private Employee[] employees;
    
    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    @Override
    public String toString() {
        return "Department Name: " + getDeptName();
    }
    
    public void addEmployees(Employee[] empArr) {
        employees = empArr;
    }
    
    public Employee[] getEmployees() {
        int count = 0;
        for(Employee e: employees) {
            if(e != null) {
                count++;
            }
        }
        
        Employee[] empArr = new Employee[count];
        for(int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                empArr[i] = employees[i];
            }
        }
        
        return empArr;
    }
    
    public int noNullCount() {
        int count = 0;
        for(Employee e: employees) {
            if(e != null) {
                count++;
            }
        }
        
        return count;
    }
    
    public Employee getEmployeeID(int idNum) {
        for(Employee e: employees) {
            if(e.getId() == idNum) {
                return e;
            }
        }
        
        return null;
    }
    
    public double getTotalSalary() {
        double total = 0.0;
        
        for(Employee e: employees) {
            total += e.getSalary();
        }
        
        return total;
    }
}
