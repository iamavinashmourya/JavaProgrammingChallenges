/*
Implement a Java program for an employee payroll system. Define a class Employee with attributes id, name, designation, and hourlyRate. Create a constructor to initialize these attributes based on the designation provided. Implement methods to retrieve employee details and calculate salary based on hours worked.

Additionally, create a class PayrollSystem with a list of employees. Implement methods to add employees and process payroll for a given number of hours worked. Display salary details for each employee after processing payroll.

In the main method:

Create an instance of PayrollSystem.
Add at least three employees with different designations.
Process payroll for 40 hours worked.
Display the salary details for each employee.
*/

class Employee {
    private int id;
    private String name;
    private String designation;
    private double hourlyRate;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        if (designation.equals("Manager")) {
            this.hourlyRate = 50.0;
        } else {
            this.hourlyRate = 30.0;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double calculateSalary(int hoursWorked) {
        return hourlyRate * hoursWorked;
    }
}

class PayrollSystem {
    private Employee[] employees;
    private int count;

    public PayrollSystem(int size) {
        this.employees = new Employee[size];
        this.count = 0;
    }

    public void addEmployee(Employee employee) {
        employees[count++] = employee;
    }

    public void processPayroll(int hoursWorked) {
        System.out.println("Payroll Processing...");
        System.out.println("===================================");
        for (int i = 0; i < count; i++) {
            double salary = employees[i].calculateSalary(hoursWorked);
            System.out.println("Employee ID: " + employees[i].getId());
            System.out.println("Name: " + employees[i].getName());
            System.out.println("Designation: " + employees[i].getDesignation());
            System.out.println("Hours Worked: " + hoursWorked);
            System.out.println("Salary: $" + salary);
            System.out.println("-----------------------------------");
        }
        System.out.println("Payroll Processed Successfully");
    }
}

public class PayrollEmpSystem {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem(3);
        payrollSystem.addEmployee(new Employee(1, "John", "Manager"));
        payrollSystem.addEmployee(new Employee(2, "Alice", "Developer"));
        payrollSystem.addEmployee(new Employee(3, "Bob", "Developer"));
        payrollSystem.processPayroll(40);
    }
}
