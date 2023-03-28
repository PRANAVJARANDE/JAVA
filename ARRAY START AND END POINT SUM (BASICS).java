import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int sum = sc.nextInt ();
    int l1 = 0, l2 = 0;

    int n = sc.nextInt ();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      {
	arr[i] = sc.nextInt ();
      }


    for (int i = 0; i < n; i++)
      {
	int y = arr[i];
	for (int j = i + 1; j < n; j++)
	  {
	    y = y + arr[j];
	    if (y == sum)
	      {
		l1 = i;
		l2 = j;
		break;
	      }

	  }
      }

    System.out.println ("LEFT INDEX-" + l1);
    System.out.println ("RIGHT INDEX-" + l2);
  }
}
