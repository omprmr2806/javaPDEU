class Faculty extends Employee{
    String department;
    Faculty(String name, int employee, double salary, String department) {
        super(name, employee, salary);
        this.department = department;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
    double calculateBonus(){
        // return 20% of salary as bonus for faculty
        return salary * 0.2;
    }

}
class Administrative extends Employee{
    String position;
    Administrative(String name, int employee, double salary, String position) {
        super(name, employee, salary);
        this.position = position;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Position: " + position);
    }
    double calculateBonus(){
        // return 15% of salary as bonus for administrative staff
        return salary * 0.15;
    }
}

class Employee{
    String name;
    int employee;
    double salary;
    Employee(String name, int employee, double salary) {
        this.name = name;
        this.employee = employee;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employee);
        System.out.println("Salary: " + salary);
    }
    double calculateBonus(){
        return salary * 0.1;
    }

}
public class Lab3_1st {
    public static void main(String[] args) {
        Employee emp1= new Employee("OM",101,200000);
        Faculty fact1 = new Faculty("xyz",102,300000,"Computer Science");
        Administrative admin1 = new Administrative("Jane Doe",103,400000,"Manager");

        
}
}