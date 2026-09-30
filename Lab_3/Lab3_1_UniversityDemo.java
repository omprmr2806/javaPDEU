class Employee {
    protected String name;
    protected int employeeId;
    protected double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Faculty extends Employee {
    private String department;

    public Faculty(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }
}

class AdministrativeStaff extends Employee {
    private String designation;

    public AdministrativeStaff(String name, int employeeId, double salary, String designation) {
        super(name, employeeId, salary);
        this.designation = designation;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Designation: " + designation);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }
}

public class Lab3_1_UniversityDemo {
    public static void main(String[] args) {
        Employee employee =
                new Employee("Rahul", 101, 50000);

        Faculty faculty =
                new Faculty("Amit", 102, 70000, "Computer Science");

        AdministrativeStaff staff =
                new AdministrativeStaff("Neha", 103, 60000, "Manager");

        System.out.println("=== Employee ===");
        employee.displayDetails();
        System.out.println("Bonus: " + employee.calculateBonus());

        System.out.println("\n=== Faculty ===");
        faculty.displayDetails();
        System.out.println("Bonus: " + faculty.calculateBonus());

        System.out.println("\n=== Administrative Staff ===");
        staff.displayDetails();
        System.out.println("Bonus: " + staff.calculateBonus());
    }
}
