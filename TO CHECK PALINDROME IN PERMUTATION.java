import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    String s = sc.next ();



    int l = s.length ();

    int freq[] = new int[l];

    int count = 0;
    for (int i = 0; i < l; i++)
      {
	int k = 0;
	for (int j = 0; j < l; j++)
	  {
	    if (s.charAt (i) == s.charAt (j))
	      {
		k++;
	      }
	  }
	freq[i] = k % 2;
	if (freq[i] == 1)
	  {
	    count++;
	  }
	if (count == 2)
	  {
	    break;
	  }
      }

    if (count == 0 || count == 1)
      {
	System.out.println ("PALINDROME IN PERMUTATION");
      }
    else
      {
	System.out.println ("NOT PALINDROME IN PERMUTATION");
      }

  }
}
