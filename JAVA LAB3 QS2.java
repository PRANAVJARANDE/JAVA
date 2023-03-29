import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		int w=0;
		for(int i=0;i<n;i++)
		{
		    w=w+(n+i*(n-i-1))*((int)str.charAt(i)-96);
		}
		System.out.println(w);
	}
}