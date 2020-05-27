package my_Program;
import java.util.*;
public class Freq_char {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a String: ");
     String st=sc.nextLine();
     sc.close();
     st=st.trim();
     System.out.println("Character frequencies:");
     int a[]=new int[256];
     int v[]=new int[256];
     for(char c:st.toCharArray())
          a[(int)c]++;
     for(char c:st.toCharArray())
     { if(v[(int)c]!=1)
    	 {
    	 System.out.println(c+" "+a[(int)c]);
    	 v[(int)c]++;
     }
     }
     
	}

}
