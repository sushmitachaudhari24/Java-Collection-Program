package collectin;
import java.util.*;
public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector v=new Vector();
      Product p[]=new Product[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<p.length;i++)
      {
    	  p[i]=new Product();
      }
      p[0].setId(1);
      p[0].setName("parle");
      p[0].setPrice(10);
      
      p[1].setId(2);
      p[1].setName("monaco");
      p[1].setPrice(10);
      
      p[2].setId(3);
      p[2].setName("cadbury");
      p[2].setPrice(20);
      
      p[3].setId(4);
      p[3].setName("milk");
      p[3].setPrice(12);
      
      p[4].setId(5);
      p[4].setName("salt");
      p[4].setPrice(10);
      
     System.out.println("Product List is...\n");
    
      for(Object obj:p)
      {
    	  v.add(obj);
      }
    
      for(Object obj:v)
      {Product pd=(Product)obj;
    	  System.out.println(pd.getId()+" "+pd.getName()+" "+pd.getPrice());
      }
      boolean b=false;
      System.out.println("Products Whose price is Same");
      for(int i=0;i<p.length;i++)
      {
    	for(int j=i+1;j<p.length;j++)
    	{
    	   if( p[i].getPrice() ==p[j].getPrice() &i!=j  )
    	   {
    		   System.out.println(p[i].getId()+" "+p[i].getName()+" "+p[i].getPrice());
    		   System.out.println(p[j].getId()+" "+p[j].getName()+" "+p[j].getPrice());
     		//b=true;
    	   }
    	  
    	}
      	
    	
      }
	}

}
