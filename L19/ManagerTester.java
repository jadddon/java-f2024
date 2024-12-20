package L19; // Package declaration

import java.util.ArrayList; // Import ArrayList class for dynamic array

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming: This program demonstrates the use of classes and objects to model real-world entities, such as a manager.
 * 2. Inheritance: The Manager class extends the Employee class, showcasing how to build upon existing classes.
 * 3. Polymorphism: The program utilizes polymorphism by treating Manager objects as Employee objects, highlighting the flexibility of object-oriented programming.
 * 4. Encapsulation: The Manager class encapsulates the manager's bonus and provides methods to manipulate and access it, emphasizing the importance of data hiding and abstraction.
 * 5. Method Overriding: The Manager class overrides the getTotalCompensation method of the Employee class to include the manager's bonus, illustrating how to modify behavior in subclasses.
 * 6. Dynamic Array: The program uses an ArrayList to dynamically manage a collection of Employee objects, demonstrating the flexibility of dynamic arrays.
 * 
 * This program tests the Manager class by creating Manager objects, accessing and modifying their properties, and printing their information to the console. It also demonstrates the use of polymorphism by treating Manager objects as Employee objects and calculates the average total compensation of a staff.
 */

public class ManagerTester {
    public static void main(String[] args) {
        // Create a Manager object with name "Steve", salary 2, and bonus 1000000
        Manager m = new Manager("Steve", 2, 1000000);
        // Print the name of the manager
        System.out.println(m.getName());
        // Print the total compensation of the manager
        System.out.println(m.getTotalCompensation());
        // Set the salary of the manager to 1
        m.setSalary(1);
        // Print the total compensation of the manager after salary change
        System.out.println(m.getTotalCompensation());
        // Set the bonus of the manager to 1000003
        m.setBonus(1000003);
        // Print the total compensation of the manager after bonus change
        System.out.println(m.getTotalCompensation());
        // Print a string representation of the manager
        System.out.println(m);
        // Assign the manager object to an Employee variable
        Employee e = m;
        // Print the name of the employee (which is the same as the manager)
        System.out.println(m.getName());
        // This line is commented out because through the variable e, one can only invoke methods
        // originally defined in Employee, not in Manager.
        //e.setBonus(100000);
        // Print the total compensation of the employee (which is the same as the manager)
        System.out.println(e.getTotalCompensation());
        // Print a string representation of the employee (which is the same as the manager)
        System.out.println(e);
        // Create an Employee object with name "Jack" and salary 60000
        Employee x = new Employee("Jack", 60000);
        // This line is commented out because a Manager cannot be set equal to an object from its superclass.
        //Manager y = x;
        // Create an array of Employee objects
        Employee[] staff = new Employee[4];
        // Assign employees to the array
        staff[0] = x;
        staff[1] = m;
        staff[2] = new Employee("John", 71000);
        staff[3] = new Manager("Paul", 2, 10000000);
        // Print the average total compensation of the staff
        System.out.println(averageTotalCompensation(staff));
        // Create an array of Manager objects
        Manager[] seniorStaff = new Manager[2];
        // Assign managers to the array
        seniorStaff[0] = m;
        seniorStaff[1] = new Manager("Paul", 2, 10000000);
        // Print the average total compensation of the senior staff
        System.out.println(averageTotalCompensation(seniorStaff));
        // Create an ArrayList of Employee objects
        ArrayList<Employee> staff2 = new ArrayList<>();
        // Add employees to the ArrayList
        staff2.add(x);
        staff2.add(m);
        staff2.add(new Manager("Jim", 2, 50000));
        // Print the average total compensation of the staff in the ArrayList
        System.out.println(averageTotalCompensation2(staff2));
    }

    // Method to calculate the average total compensation of an array of Employee objects
    public static double averageTotalCompensation(Employee[] s) {
        double sum = 0;
        // Iterate through the array of employees to calculate the sum of their total compensations
        for (Employee e : s) {
            sum += e.getTotalCompensation();
        }
        // Return the average total compensation
        return sum / s.length;
    }

    // Method to calculate the average total compensation of an ArrayList of Employee objects
    public static double averageTotalCompensation2(ArrayList<Employee> s) {
        double sum = 0;
        // Iterate through the ArrayList of employees to calculate the sum of their total compensations
        for (Employee e : s) {
            sum += e.getTotalCompensation();
        }
        // Return the average total compensation
        return sum / s.size();
    }
}