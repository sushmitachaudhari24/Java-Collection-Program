package collectin;
import java.util.*;
public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector v=new Vector();
       Book b[]=new Book[5];
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<b.length;i++)
       {
    	   b[i]=new Book();
    	   System.out.println("Enter Book Details ID,Name,Author");
    	   int id=sc.nextInt();
    	   String name=sc.next();
    	   String auth=sc.next();
    	   b[i].setId(id);
    	   b[i].setName(name);
    	   b[i].setAuth(auth);
       }
       for(Object obj:b)
       {
    	   v.add(obj);
       }
       System.out.println("Book Details are...");
     
    	for(Object obj:v)
    	{
    		Book bk=(Book)obj;
    		System.out.println(bk.getId()+"\t"+bk.getName()+"\t"+bk.getAuth());
    	}
    	System.out.println("\nAuthors Whose name ends with 'sh'\n");
    	boolean bl=true;
    	for(Object obj:v)
    	{
    		Book bk=(Book)obj;
    		
    		char ch[]=bk.getAuth().toCharArray();
    		int l=ch.length;
    		
    		if(ch[l-2]=='s' && ch[l-1]=='h')
    		{
    			System.out.println(bk.getId()+"\t"+bk.getName()+"\t"+bk.getAuth());
    			//bl=true;
    		}
    		
    		
    	}
    	
	}

}
