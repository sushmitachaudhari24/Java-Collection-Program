package collectin;

import java.util.Enumeration;
import java.util.Vector;

public class VectorOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Vector v=new Vector();
           v.add(10);
           v.add(20);
           v.add(30);
           v.add(10);
           v.add(20);
           v.add(40);
           v.add(50);
           v.add(60);
           v.add(10);
           v.add(70);
           System.out.println("Elements Before Sorting");
           for(Object obj:v)
           {
        	   System.out.print(" "+obj);
           }
           System.out.println("\nElements After Sorting");
           for(int i=0;i<v.size();i++)
           {
        	   for(int j=i+1;j<v.size();j++)
        	   {
        		   Object p=v.get(i);
        		   Object n=v.get(j);
        		   if((int)p>(int)n)
        		   {  v.set(i, n);
        		       v.set(j, p);
        		   }
        	   }
           }
          /* for(Object obj:v)  //enhanced for loop
           {
        	   System.out.print(" "+obj);
           }
           */
           int count=1;
           for(int i=0;i<v.size();i++)
           { 
        	  if(i<v.size()-1  && v.get(i)==v.get(i+1))
        	  {
        		  count++;
        	  }
        	  else
        	  {
        		  System.out.println(v.get(i)+"------- Count is "+count);
        		  count=1;
        	  }
           }
           
           System.out.println();
           Enumeration e=v.elements();
           while(e.hasMoreElements())
           {
        	   Object obj=e.nextElement();
        	   System.out.println(obj);
           }
           
          /* int sum=0;
           int max=(int)v.get(0);
           for(Object obj:v)
           {
        	   sum=sum+(int)obj;
        	   if((int)obj>max)
        	   {
        		   max=(int)obj;
        	   }
           }
                  System.out.println("Max from vector is "+max);
        System.out.println(v);
        System.out.println("Sum of All Elements is "+sum);*/
        /* int count=1;
           for(int i=0;i<v.size();i++)
           {   count=1;
         //  System.out.println();
         //  System.out.print(v.get(i));
              for(int j=i+1;j<v.size();j++)
              {
            	  Object p=v.get(i);
            	  Object n= v.get(j);
            	  if((int)p==(int)n)
            	  {
            		  count++;
            		  v.set(j,0);
            	  }
              }
              if((int)v.get(i)!=0)
              {
               System.out.println(v.get(i)+"--->"+count);
              }
             }*/
          // System.out.println(v);
        /*   Enumeration e=v.elements();
           while(e.hasMoreElements())
           {
             Object obj=e.nextElement();
             System.out.println(obj);
           }*/
	}

}
