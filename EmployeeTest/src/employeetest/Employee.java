/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeetest;

/**
 *
 * @author Stefan Etcu
 */
public class Employee {
 
 /* Declaring the fields of the class private for encapsulation.
    Initializing nextEmpnum with the value 1 so we can access it when we create the first employee. */
    private String name;
    private String email;
    private int empNum;
    private static int nextEmpNum = 1;
    
 /* Default constructor: 
        - Passes the nextEmpNum as the employee number.
        - Creates auto incremented default name and email for the employee (concatenating the employee 
          number at the end in order to avoid duplicates). 
        - Increments nextEmpNum so we'll have it ready for the next object. */
    public Employee(){
        this.empNum = nextEmpNum;
        this.name = "Default_System_Name_"; //+ this.empNum;
        this.email = "Default_System_Email_" + this.empNum;
        nextEmpNum += 1;
    }
    
 /* Overloaded constructor (takes name and email as parameters):
        - Passes the nextEmpNum as the employee number.
        - Initializes the name and email with the values passed as parameters.
        - Increments nextEmpNum so we'll have it ready for the next object. */
    public Employee(String name, String email) {
        this.empNum = nextEmpNum;
        this.name = name;
        this.email = email;
        nextEmpNum += 1;
    }
    
 /* Getter method for the Name - takes no parameters and returns employee's name. */
    public String getName() {
        return this.name;
    }
    
 /* Getter method for the Email - takes no parameters and returns employee's email. */
    public String getEmail() {
        return this.email;
    }
    
 /* Getter method for the Employee Number - takes no parameters and returns employee's number. */
    public int getEmpNum() {
        return this.empNum;
    }
    
 /* Getter method for the Next Employee Number - takes no parameters and returns the next employee number. */
    public int getNextEmpNum() {
        return nextEmpNum;
    }
    
 /* Setter method for the Email - takes the new email as a parameter and assigns it to the 
    email field only if iy has more than 3 characters. Otherwise, no changes are made.*/
    public void setEmail(String email) {
        int stringLength = email.length();
        if(stringLength > 3) {
            this.email = email;
        }
    }
}
