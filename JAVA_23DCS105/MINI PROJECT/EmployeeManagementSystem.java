import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    private String id;
    private String name;
    private String department;
    private double salary;

    public Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department + ", Salary=" + salary + "]";
    }
}

public class EmployeeManagementSystem {

    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n***********Employee Management System***********");
            System.out.println("1. Add Employee :");
            System.out.println("2. View All Employees :");
            System.out.println("3. Update Employee :");
            System.out.println("4. Delete Employee :");
            System.out.println("5. Search Employee :");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    searchEmployee();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting Employee Management System.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        String id = scanner.next();
        System.out.print("Enter Employee Name: ");
        String name = scanner.next();
        System.out.print("Enter Employee Department: ");
        String department = scanner.next();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, department, salary);
        employees.add(employee);

        System.out.println("Employee added successfully !!!");
    }

    private static void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("***********List of Employees***********");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    private static void updateEmployee() {
        System.out.print("Enter Employee ID to update: ");
        String id = scanner.next();

        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                System.out.print("Enter new Name: ");
                employee.setName(scanner.next());
                System.out.print("Enter new Department: ");
                employee.setDepartment(scanner.next());
                System.out.print("Enter new Salary: ");
                employee.setSalary(scanner.nextDouble());

                System.out.println("Employee updated successfully !!!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    private static void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        String id = scanner.next();

        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                employees.remove(employee);
                System.out.println("Employee deleted successfully !!!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    private static void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        String id = scanner.next();

        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}
