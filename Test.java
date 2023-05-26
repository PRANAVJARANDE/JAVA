package LAB.OOPS.May26;

public class Test {
    public static void main(String[] args) {
        Employee one = new Engineer("Java Coding");
        Employee two = new Manager("Civil Engineering");
        Employee three = new Employee();
        System.out.println("----------Engineer---------------");
        one.setName("Palash");
        one.setID(69);
        one.setSalary(10000);
        one.displayInfo();
        System.out.println("----------------Manager-----------------");
        two.setName("Pranav");
        two.setID(87);
        two.setSalary(500);
        two.displayInfo();
        System.out.println("----------------Employee--------------");
        three.setName("Mahesh");
        three.setID(68);
        three.setSalary(5000);
        three.displayInfo();

    }
}
