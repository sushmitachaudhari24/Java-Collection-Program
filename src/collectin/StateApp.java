package collectin;

import java.util.*;

public class StateApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       LinkedList l=new LinkedList();
       do {
    	   System.out.println("1.Add new State");
    	   System.out.println("2.View States");
    	   System.out.println("3.Search state by name");
    	   System.out.println("4.Delete state by name");
    	   System.out.println("Enter your choice");
    	   int choice=sc.nextInt();
    	     switch(choice)
    	     {
    	      case 1: System.out.println("Enter State Id and StateName");
    	             int id=sc.nextInt();
    	             String sname=sc.next();
    	    	    State s = new State();
    	    	    s.setStateId(id);
    	    	    s.setStateName(sname);
    	    	    l.add(s);
    	    	     break;
    	      case 2:
    	             if(l.isEmpty())
    	             {
    	            	 System.out.println("Data not available");
    	             }
    	             else {
    	    	      Iterator i= l.iterator();
    	             System.out.println("States are...");
    	              while(i.hasNext())
    	              {
    	            	  Object obj=i.next();
    	            	  State st=(State)obj;
    	            	  System.out.println(st.getStateId()+"\t"+st.getStateName());
    	              }
    	             }
    	    	     break;
    	      case 3: boolean flag=true;
    	          String sstate;
    	    	    if(l.isEmpty())
                      {
           	          System.out.println("List is Empty");
                      }
                      else {
    	    	     System.out.println("Enter state to search");
    	             sstate=sc.next();
    	             for(Object obj:l)
    	             {  
    	            	 State st=(State)obj;
    	            	 if(st.getStateName().contains(sstate))
    	            	 {   System.out.println(st.getStateId()+"\t"+st.getStateName()); 
    	            		 System.out.println("Search Successfull");
    	            		 flag=true;
    	            		 break;
    	            	 }
    	            	 else {
    	            		   flag=false;
    	            	 }
    	             }
                      }
    	             if(flag=false)
    	             {
    	            	 System.out.println("Search is UnSuccessfull");
    	             }
    	    	  break;
    	      case 4:
	            // boolean flag=trueIter
	               if(l.isEmpty())
	               {
	            	   System.out.println("List is Empty");
	               }
	               else {
	            	   System.out.println("Enter state to search");
		               sstate=sc.next();
	               Iterator <State> i1=l.iterator();
	               while(i1.hasNext())
	               {  
	            	 State st=(State)i1.next();
	            	 if(st.getStateName().equalsIgnoreCase(sstate))
	            	 {  i1.remove();
	            		 flag=true;
	            		 break;
	            	 }
	            	 else {
	            		   flag=false;
	            	 }
	                }
	               }
	               if(flag=true)
  	             {
  	            	 System.out.println("Data Removed Successfully");
  	             }
    	    	     break;
    	      default:System.out.println("You have entered wrong choice");
    	     }
          }while(true);
	}

}
