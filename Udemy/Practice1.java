package Udemy;

// import Udemy.Employee.Manager;

class Employee {
    private String name;
    private double salary;
    
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // @Override
    public String getDetails() {
        return "Employee [name=" + getName() + ", salary=" + getSalary() + "]";
    }
}
class Manager extends Employee{
    private String department;
    
    Manager(String name,double salary,String department){
        super(name,salary);
        this.department=department;
    }
    public String getDep(){
        return department;
    }
    @Override
    public String getDetails(){
        return ""+super.getDetails()+" Department: "+getDep()+""; 
    }
}
public class Practice1 {
    public static void main(String[] args) {
       
        Employee e=new Employee("ALice",50000.0);

        Manager m=new Manager("Alice", 50000.0, "IT");

        System.out.println(e.getDetails());
        System.out.println(m.getDetails());
        
    }
}
