import java.util.*;
class Member{
    String name,address;
    int age;
    long num;
    double salary;
    Scanner sc=new Scanner(System.in);
    void printSalary()
    {
        System.out.println(salary);
    }
    void getdata()
    {
        System.out.println("Enter the Name : ");
        name=sc.nextLine();
        System.out.println("Enter the Age : ");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Address : ");
        address=sc.nextLine();
        System.out.println("Enter the Phone number : ");
        num=sc.nextLong();
        System.out.println("Enter the Salary : ");
        salary=sc.nextDouble();

    }
    void print()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Phone Number : "+num);
        System.out.println("Address : "+address);
        System.out.print("Salary : ");
        printSalary();

    }
}

class Employee extends Member{
    String specialization;
    @Override
    void getdata() {
        super.getdata();
        sc.nextLine();
        System.out.println("Enter the Designation of Employee : ");
        specialization=sc.nextLine();
    }
    @Override
    void print()
    {
        super.print();
        System.out.println("Specialization : "+specialization);
    }

}

class Manager extends Member{
    String department;
    @Override
    void getdata() {
        super.getdata();
        sc.nextLine();
        System.out.println("Enter the Department : ");
        department=sc.nextLine();
    }
    @Override
    void print()
    {
        super.print();
        System.out.println("Department : "+department);
    }

}
public class Prac18 {
    public static void main(String[] args) {
        Employee obj1=new Employee();
        Manager obj2=new Manager();
        obj1.getdata();
        System.out.println("*********EMPLOYEE*********");
        obj1.print();
        obj2.getdata();
        System.out.println("*********MANAGER*********");
        obj2.print();

    }
}