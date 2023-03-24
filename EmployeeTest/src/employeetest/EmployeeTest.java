/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeetest;

/**
 *
 * @author Stefan Etcu
 * @student number: sba22078
 * 
 * Advantages of using ArrayList instead of Array:
 *    1. ArrayList is a class and you can create objects and use methods within the class. Arrays only allow you to use .length() method which is constant.
 *    2. The capacity of an Array is fixed, where ArrayLists can increase and decrease size dynamically.
 *    3. ArrayLists allows removal or insertion of elements from different positions.
 *    4. ArrayLists can hold multiple types of objects if generics are not specified.
 */

public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("This would be my first change and my first commit on GitHub");
        System.out.println("Second attempt to commit to GitHub"); // This is where the second attempt should have been placed.
     /* The next block of code creates the 3 employees for our test and an extra two employees with the default constructor
        in order to test its functionality. */
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana","ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb","tt@gmail.com");
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();
        
     /* Next lines will print the employee number, the name and the email of all the objects created  in order to test
        if the getters values are correct. */
        System.out.println(emp1.getEmpNum() + " " + emp1.getName() + " " + emp1.getEmail());
        System.out.println(emp2.getEmpNum() + " " + emp2.getName() + " " + emp2.getEmail());
        System.out.println(emp3.getEmpNum() + " " + emp3.getName() + " " + emp3.getEmail());
        System.out.println(emp4.getEmpNum() + " " + emp4.getName() + " " + emp4.getEmail());
        System.out.println(emp5.getEmpNum() + " " + emp5.getName() + " " + emp5.getEmail() + "\n");
        
     /* The next line prints out the value stored in NextEmpNum. */
        System.out.println("The value stored in nextEmpNum at the moment is: " + emp1.getNextEmpNum() + " (should be 6)");
        
     /* Setting a new email address for the 4th object and testing the method's functionality. */
        emp4.setEmail("newEmail@gmail.com");
        System.out.println("Checking if the email was set: " + emp4.getEmail() +" (should be newEmail@gmail.com)");
     
     /* Setting a new email for the 4th object that's not bigger than 3 characters and printing the value for testing purposes.*/
        emp4.setEmail("bob");
        System.out.println("Checking if the email 'bob' was set: " + emp4.getEmail() + " (should be newEmail@gmail.com)" + "\n");
        
     /* m is the variable that dictates what employees are printed (PLEASE MODIFY FOR DIFFERENT RESULTS). */   
        int m = 1;
        
     /* Declaring and populating the projectGroup Array with the first 3 employees as asked in the CA. */
        Employee[] projectGroup = {emp1,emp2,emp3};
        
     /* Next block of code will print the employees in the Array with the employee number above the value stored in 'm'. */
        System.out.println("Employees in the Array with employee number above the value " + m);
        for(int i=0; i<projectGroup.length; i++) {
            if(projectGroup[i].getEmpNum() > m) {
                System.out.println(projectGroup[i].getName());
            }
        }
     /* Creating 2 companies with the two different constructors - we'll store the employees in the first one. */
        Company comp1 = new Company("DR Sports");
        Company comp2 = new Company();
     
     /* Adding the 3 employees in the company's list of staff using the addNewStaff method (see the Company Class). */
        comp1.addNewStaff(emp1);
        comp1.addNewStaff(emp2);
        comp1.addNewStaff(emp3);
        
     /* Printing the number of employees each company has in order to test the getStaffNumber() method. */
        System.out.println("\nThe first company has " + comp1.getStaffNumber() + " members. (result should be 3)");
        System.out.println("The second company has " + comp2.getStaffNumber() + " members. (result should be 0)\n");
        
     /* Printing the employees with the employee number above the value store in 'm'. 
        It uses the method listEmployees defined in the Company Class (takes 'm' as parameter). */
        System.out.println("Employees in the ArrayList with employee number above the value " + m);
        comp1.listEmployees(m);
        
    }
    
}
