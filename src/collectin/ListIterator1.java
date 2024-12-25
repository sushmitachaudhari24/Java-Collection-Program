package Test.Io;

import java.util.*;

public class ListIterator1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       ArrayList al=new ArrayList();
       Scanner sc=new Scanner(System.in);
     al.add(100);
     al.add("asds");
     al.add(1234);
     al.add("A");
     al.add(3.14);
     ListIterator li=al.listIterator();
   
     System.out.println("Forword Direction");
     while(li.hasNext())
     {
    	 Object obj=li.next();
         System.out.println(" .."+obj);
     }
     System.out.println("Backword Direction");
     while(li.hasPrevious())
     {
    	 Object obj=li.previous();
    	 System.out.println(" .."+obj);
     }
	}

}
