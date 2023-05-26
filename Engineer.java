package LAB.OOPS.May26;

public class Engineer extends Employee {
    private String project;

    Engineer(String project) {
        this.project = project;
    }

    public void displayInfo() {
        System.out.println("Name : " + getName());
        System.out.println("ID : " + getID());
        System.out.println("Salary : " + getSalary());
        System.out.println("Project : " + this.project);
    }
}
