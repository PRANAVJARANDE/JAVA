import java.util.*;
public class Student
{
    private int ID;
    private int nhc;
    private int points;
    private float gpa;
    
    void setdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ID-");
        ID=sc.nextInt();
        System.out.print("ENTER no. of hours-");
        nhc=sc.nextInt();
        System.out.print("ENTER points-");
        points=sc.nextInt();
    }
    
    void calcgpa()
    {;
        gpa=(float)nhc/points;
    }
    
    void display()
    {
        System.out.println("ID-"+ID);
        System.out.println("HOURS CREDITED-"+nhc);
        System.out.println("Points"+points);
        System.out.println("GFA-"+gpa);
    }
    
    
}