package my_Program;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s =new Scanner(System.in);
      System.out.println("Enter two strings");
      String s1=s.nextLine();
      String s2=s.nextLine();
      s.close();
      int ar[]=new int[256];
      for(char c:s1.toCharArray())
      {
    	  ar[(int)c]++;
      }
    	for(char c:s2.toCharArray())
    	{
    		ar[(int)c]--;
    	}
      for(int i=0;i<ar.length;i++)
      {
    	  if(ar[i]!=0)
    	  {
    		  System.out.println("Not Anagram");
    		  return;
    	  }
      }System.out.println("Anagram");
      
	}

}
