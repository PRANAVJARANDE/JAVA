import java.util.*;
import java.text.DecimalFormat;


public class Main
{
    
public static float average(int arr[])
{
        Scanner sc=new Scanner(System.in);
        
        int sum=0;
        int i=0;
		for(i=0;i<20;i++)
		{
		    arr[i]=sc.nextInt();
		    if(arr[i]==-1)
		    {
		        break;
		    }
		    sum=sum+arr[i];
		}
		
		float av=sum;
		return av/i;
}

    
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    
	    DecimalFormat df=new DecimalFormat("0.00");
		int arr[]=new int[20];
		
		System.out.println("AVERAGE IS- "+df.format(average(arr)));
	}
}
