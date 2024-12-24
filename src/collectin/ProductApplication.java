package collectin;
import java.text.*;
import java.util.*;
public class ProductApplication {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
      Stack s=new Stack();
      do {
    	  System.out.println("1.Add new Product");
    	  System.out.println("2.View Product List");
    	  System.out.println("3.View Product by Expiry date(Those Product Top on the list Whose Expiry date is near)");
    	  System.out.println("4.Delete Product by Expiry Date");
    	  System.out.println("Enter Your Choice");
    	  int ch=sc.nextInt();
    	  switch(ch)
    	  {
    	  case 1:System.out.println("Enter Product Details:ID Name Price Expiry Date(dd/mm/yyyy):");
    	         int id=sc.nextInt();
    	         String name=sc.next();
    	         int price =sc.nextInt();
    	         String date=sc.next();
;    		     Product p=new Product();
    	       
    	         try {
    	        	
    	        	  p.setId(id);
    	    	         p.setName(name);
    	    	         p.setPrice(price);
    	    	        p.setDate(date);
    	         }
    	         catch(Exception e)
    	         {
    	        	 System.out.println(e.getMessage());
    	         }
    	         boolean b=s.add(p);
    	         if(b)
    	         {
    	        	 System.out.println("Data Added SuccessFully");
    	         }
    	         else
    	         {
    	        	 System.out.println("!!! Something Wrong !!!");
    	         }
    	        break;
    	  case 2: System.out.println("....Product List....\n");
    	          Iterator i=s.iterator();
    	          while(i.hasNext())
    	          {
    	        	  Object obj=i.next();
    	        	  Product pr=(Product)obj;
    	        	  System.out.println(pr.getId()+"\t"+pr.getName()+"\t"+pr.getPrice()+"\t"+pr.getDate());
    	          }
    		  break;
    	  case 3: System.out.println("Product List by Expiry Date ");
    	        
    	          Iterator it=s.iterator();
    	          while(it.hasNext())
    	          {
    	        	  Object obj=it.next();  
    	        	  Product pr=(Product)obj;
    	        	  System.out.println(pr.getId()+"\t"+pr.getName()+"\t"+pr.getPrice()+"\t"+pr.getDate());
    	          }
    		  break;
    	  case 4:break;
    	  default:System.out.println("You have Entered Wrong Choice");
    	  }
         }while(true);
	}

}
