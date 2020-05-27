package my_Program;
import java.util.*;
public class Triplet {
   static boolean check(int A[],int x,int i)
    {
    	int j=A.length-1;
    	while(i<j)
    	{
    		if(A[i]+A[j]<x)
    			i++;
    		else if(A[i]+A[j]>x)
    			j--;
    		else
    			return true;
    	}return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.println("Enter length of array: ");
      int n=s.nextInt();
      int ar[]=new int[n];
      System.out.println("Enter Array Elements: ");
      for(int k=0;k<n;k++)
    	  ar[k]=s.nextInt();
      s.close();
      Arrays.sort(ar);
      for(int i=0;i<n-2;i++)
      {
    	  if(check(ar,-ar[i],i+1)==true)
    		  {System.out.println("Exists, element "+(i+1)+"="+ar[i]);
    	  return;
      }
	} System.out.println("Does not exist");

}
}
