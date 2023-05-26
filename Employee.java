package LAB.OOPS.May26;

public class Employee {
    private int id;
    private String name;
    private double salary;

    Employee() {

    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("ID : " + this.id);
        System.out.println("Salary : " + this.salary);
    }
}
