package LAB.OOPS.May26;

public class Manager extends Employee {
    private String department;

    Manager(String department) {
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name : " + getName());
        System.out.println("ID : " + getID());
        System.out.println("Salary : " + getSalary());
        System.out.println("Department : " + this.department);
    }
}
