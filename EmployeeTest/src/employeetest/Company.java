/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeetest;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Stefan Etcu
 */
public class Company {
    
 /* Declaring the class fields private for encapsulation. */
    private String companyName;
    private ArrayList<Employee> staffMembers;
    
 /* Default constructor: 
        - Initializes the name with a default name
        - Creates a new ArrayList object for storing employees.*/
    public Company() {
        this.companyName = "default_Company_Name";
        this.staffMembers = new ArrayList<>();
    }
    
 /* Overloaded constructor (takes name as a parameter) :
        - Initializes the company's name with the one passed as a parameter. 
        - Creates a new ArrayList object for storing employees.*/
    public Company(String companyName) {
        this.companyName = companyName;
        this.staffMembers = new ArrayList<>();
    }
    
 /* addNewStaff() method takes an employee object as a parameter and adds it to the ArrayList that
    contains the company's staff. It makes use of the .add() method within the ArrayList class. */
    public void addNewStaff(Employee emp) {
        this.staffMembers.add(emp);
    }
    
 /* getStaffNumber() method has no parameters and returns the number of elements in the staff ArrayList.
    It makes use of the .size() method within the ArrayList class. */
    public int getStaffNumber() {
        return this.staffMembers.size();
    }
    
 /* listEmployees() takes an integer as parameter and prints out the objects in the ArrayList with the 
    employee number greater than the parameter. It makes use of the Iterator class to go through the 
    elements and creates a temporary employee object to store the value that .next() returns.
    It assigns null to the temporary object at the end of the iteration, therefore Java Garbage
    Collector will delete it after being used. */
    public void listEmployees(int myNumber) {
        Iterator<Employee> empIterator = staffMembers.iterator();
        Employee temp;
        while(empIterator.hasNext()) {
           temp = empIterator.next();
           if(temp.getEmpNum()>myNumber) {
               System.out.println(temp.getName());
           }
        }
        temp = null;
    }
}
