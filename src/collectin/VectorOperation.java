package collectin;
import java.util.*;
public class VectorOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vector v=new Vector();
         do {
        	 System.out.println("1.Add New\n2.View All Elements \n3.Search Element by Contains Method \n4.Search Element by indexof method\n5.Search Element by get() method ");
        	 System.out.println("6.Count Elements by using size\n7.Replace Element by using Index");
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("Enter your choice");
        	 int ch=sc.nextInt();
        	 switch(ch)
        	 {
        	 case 1:System.out.println("Enter Element to Add");
        	         int value=sc.nextInt();
        	         boolean b=v.add(value);
        	         if(b)
        	         {
        	        	 System.out.println("Element added");
        	         }
        	         else
        	         {
        	        	 System.out.println("Element not Added");
        	         }
        	         break;
        	 case 2:System.out.println("Elements of vector are ...");
        	            System.out.println(v);
        	            break;
        	 case 3:System.out.println("Enter a Element to search ");
        	        int se=sc.nextInt();
        	        b=v.contains(se);
        	        if(b)
        	        {
        	        	System.out.println("Present");
        	        }
        	        else
        	        {
        	        	System.out.println("Not Present");
        	        }
        	        break;
        	 case 4:System.out.println("Enter a Element to search ");
 	                se=sc.nextInt();  
 	                int ind=v.indexOf(se);
 	                if(ind!=-1)
 	                {
 	                	System.out.println("Present");
 	                }
 	                else
       	            {
       	        	 System.out.println("Not Present");
       	            }
 	                break;
        	 case 5:System.out.println("Enter a Element to search ");
                    se=sc.nextInt();     
                    ind=v.indexOf(se);
                    if(ind!=-1)
 	                {
 	                	System.out.println("Present "+v.get(ind));
 	                }
 	                else
       	            {
       	        	 System.out.println("Not Present "+ind);
       	            }
                    break;
        	 case 6:System.out.println("Total Elements Present in Vector are "+v.size());
        	         break;
        	 case 7:System.out.println("Enter a Element to which we want to replace and Enter new element ");
        	         se=sc.nextInt();   
        	         int n=sc.nextInt();
                     ind=v.indexOf(se);    
                     if(ind!=-1)
                     {
                    	 v.set(ind,n);
                     }else {
                    	 System.out.println("Sorry not present");
                     }break;
              default:System.out.println("You have entered Wrong Choice");       
        	 }
         }while(true);
	}

}
