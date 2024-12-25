package Test.Io;

import java.util.*;

public class VectorPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vector v=new Vector();
     v.add(10);
     v.add(20);
     v.add(30);
     v.add(40);
     v.add(50);
     v.add(60);
     v.add(70);
     v.add(80);
     
     //iterator,listiterator,Ennumration,forEach
     int val=50;
     ListIterator i=v.listIterator();
     while(i.hasNext())
     {
    	if((int)(i.next())==50)
    	{
    		i.set(900);
    	}
     }
     System.out.println("ForWord ...\n"+v);
     
//     ListIterator li=v.listIterator();
     while(i.hasPrevious())
     { 
    	 if((int)(i.previous())==30)
    	 {
    		 i.set(300);
    	 }
    	     
     }
     System.out.println("BackWord...\n"+i.previous());
   
 	
	}

}
