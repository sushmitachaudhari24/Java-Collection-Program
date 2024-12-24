package collectin;
import java.util.*;
public class ProductPApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Productp p[]=new Productp[6];
	    p[0]=new Productp(1,"cookie",40,3 ,"Biscuit");
		p[1]=new Productp(2,"parle",10,2,"Biscuit");
		p[2]=new Productp(3,"GoodDay",20,4,"Biscuit");
	    p[3]=new Productp(4,"Perk",5,5,"Cadbury");
		p[4]=new Productp(5,"Munch",10,3,"Cadbury");
		System.out.println("1.Update the Stock(Add Or Delete\n2.Display Product in Specific Category\n3.Display Product with highest Stock and display its details\nEnter ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("1.Add \n2.Delete");
		      int c=sc.nextInt();
		      switch(c)
		      {
		      case 1:System.out.println("Enter Priduct id,name,price,quantity,category");
		      int id=sc.nextInt();
		      String name=sc.next();
		      int price=sc.nextInt();
		      int qty=sc.nextInt();
		      String ctgy =sc.next();
		     p[5]=new Productp(id,name,price,qty,ctgy);
		    	  break;
		      
		      case 2:System.out.println("Enter Id to search");
		            int sid=sc.nextInt();
		            int ind=-1;
		            for(int i=0;i<p.length-1;i++)
		            {
		            	if(p[i].getId()==sid)
		            	{
		            		ind=i;
		            		break;
		            	}
		            }
		           // p[p.length-1]=null;
		            for(int i=ind;i<p.length-1;i++)
		            {
		              p[i]=p[i+1];
		            }
		            System.out.println("Product Data ");
		            for(int i=0;i<p.length-1;i++)
		            {
		             System.out.println(i+"..."+p[i].getId()+"\t"+p[i].getPname()+"\t"+p[i].getPrice()+"\t"+p[i].getQty()+"\t"+p[i].getCategory());
		            }
		    	  break;
		      }
			  break;
		case 2:System.out.println("Enter a category to display product");
		       String scategory=sc.next();
		       System.out.println("Here is the data After search..");
		       for(int i=0;i<p.length-1;i++)
		       {
		    	   if(p[i].getCategory().equalsIgnoreCase(scategory))
		    	   {
		    		   System.out.println(i+"..."+p[i].getId()+"\t"+p[i].getPname()+"\t"+p[i].getPrice()+"\t"+p[i].getQty()+"\t"+p[i].getCategory());
		    	   }
		    	   
		       }
		       
			break;
		case 3:int max=p[0].getQty();
		int in=-1;
			for(int i=0;i<p.length-1;i++)
		     {
				if(max<p[i].getQty())
				{
					max=p[i].getQty();
					in=i;
				}
			
		     }
			 System.out.println(p[in].getId()+"\t"+p[in].getPname()+"\t"+p[in].getPrice()+"\t"+p[in].getQty()+"\t"+p[in].getCategory());
			   break;
		default:System.out.println("You have entered wrong choice!!!");
		}
	}

}
