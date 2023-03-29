import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        
        int m=-100000;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                arr[i]=-arr[i];
            }
            
            m=Math.max(m,arr[i]);
            
        }
        
        int m1=-100000;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=m)
            {
            m1=Math.max(m1,arr[i]);
            }
        }
        
        System.out.println(m+m1);
    }
}
