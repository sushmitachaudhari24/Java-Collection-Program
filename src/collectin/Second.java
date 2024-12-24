package collectin;

import java.util.ArrayList;
import java.util.Iterator;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      ArrayList<Integer> al=new ArrayList<Integer>();
      al.add(100);
      al.add(200);
      al.add(300);
      al.add(400);
      al.add(500);
      //al.add(600);
      int count=al.size();
      System.out.println(count);
     System.out.println("Elements are\n");
     System.out.println(al);
     
    // System.out.println("Which element you want to delete");
     Iterator itr=al.iterator();
     boolean bi= al.isEmpty();
     if(bi)
     {System.out.println("Empty");}
     else
     {System.out.println("Not Empty");
     
     }
     while(itr.hasNext())
     {
    	 Object obj=itr.next();
     if((int)obj==200)
     {
    	System.out.println("present");
    	al.remove(obj);
    	break;
    	
     }
     }
     
     System.out.println(al);
     
}
	
}
