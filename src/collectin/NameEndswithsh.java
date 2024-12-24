package collectin;
import java.util.*;
public class NameEndswithsh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList al=new ArrayList();
       Scanner sc=new Scanner(System.in);
     //  System.out.println("Enter How many elements Do you want to insert ");
       //int ind=sc.nextInt();
     
       al.add("ramesh");
       al.add("Rakesh");
       al.add("Amar");
       al.add("Akhbar");
       al.add("shenu");
       al.add("suresh");
       
       System.out.println("Names Starts with 'r' and ends with 'sh'...");
       for(Object obj:al)
       {
    	   String str=(String)obj;
    	   if(str.endsWith("sh") && str.startsWith("r"))
    	   {
    		   System.out.println(obj);
    	   }
       }
	}

}
