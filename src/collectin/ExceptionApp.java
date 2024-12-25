package Test.Io;
import java.util.*;
public class ExceptionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String str[]=new String[4];
       try {        
    	   System.out.println("Enter String Array Values");
           for(int i=0;i<str.length;i++)
           {
        	   str[i]=sc.next();
           }
      }
      catch(InputMismatchException e)//for taking correct input
      {
   	   System.out.println(" Error is "+e+"\nSpecify  values");
      }
      
       
       
       System.out.println(" Array value into integer");
       try {        
    	    int num=Integer.parseInt(str[0]);//block for conversion string to int
    	    System.out.println(num);
       }
       catch(NumberFormatException e)
       {
    	   System.out.println(" Error is "+e+"\nSpecify int values");
       }
    
       
       try {
    	   System.out.println(" Enter a String index to view value....");
    	   int in=sc.nextInt();
    	   System.out.println(str[in]);
       }
       catch( ArrayIndexOutOfBoundsException e)
       {
    	   System.out.println("Error is "+e);
       }
	}

}
