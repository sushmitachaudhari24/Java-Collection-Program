package collectin;
import java.util.*;
public class BooksApp {
  public static void main(String []args)
  {
	//  Book b=new Book();
	  ArrayList al=new ArrayList();
	
	
	  Scanner sc=new Scanner(System.in);
	  do {
	  System.out.println("Choose from below");
	  System.out.println("1.Add new Book");
	  System.out.println("2.View All Books");
	  System.out.println("3.Search Book by author or by name of book");
	  System.out.println("4.Count Author Wise Book");
	  System.out.println("5.Count the total number of book");
	  System.out.println("6.Display the authorwise books");
	  System.out.println("Enter Your choice..");
	  int ch=sc.nextInt();
	  switch(ch)
	  {
	  case 1:sc.nextLine();
	  boolean flag=true;
		  System.out.println("Enter Book Id Name Author");
	         int id=sc.nextInt();
	         String name=sc.next();
	         String auth=sc.next();
	         Book bk=new Book();
	         bk.setId(id);
	         bk.setName(name);
	         bk.setAuth(auth);
	          flag=al.add(bk);
	         if(flag)
	         {
	         System.out.println("Book Added SuccesFully");
	         }
	         else
	         {
	        	 System.out.println("Books not Added");
	         }
	        break;
	  case 2:
		      System.out.println("Book Details are...");
		      for(Object obj:al)
		      {
		    	  Book book=(Book)obj;
		    	  System.out.println(book.getId()+"  "+book.getName()+"  "+book.getAuth());
		      }
		     break;
	  case 3:System.out.println("Choose \n1.Search by Author\n2.Search by Book");
	         int chc=sc.nextInt();
	         switch(chc)
	         {
	         case 1:System.out.println(" Author name");
	                String sauthor=sc.next();
	                for(Object obj:al)
	  		      {
	  		    	  Book book=(Book)obj;
	  		    	  if(book.getAuth().equalsIgnoreCase(sauthor))
	  		    	  {
	  		    	  System.out.println(book.getId()+"  "+book.getName()+"  "+book.getAuth());
	  		    	   break;
	  		    	 }
	  		    	  	  		    	  
	  		      }break;
	         case 2:System.out.println(" Book name");
             String sname=sc.next();
             for(Object obj:al)
		      {
		    	  Book book=(Book)obj;
		    	  if(book.getName().equalsIgnoreCase(sname))
		    	  {
		    	  System.out.println(book.getId()+"  "+book.getName()+"  "+book.getAuth());
		    	   break;
		    	 }
		    	  	  		    	  
		      }break;    
	              
	         }
		  break;
	  case 4: System.out.println("Count of book by Authors are");
	          
		  break;
	  case 5: int count=0;
	          for(Object obj:al)
	          {
	        	  count++;
	          }
		  System.out.println("Total Books present are "+count);
		  break;
	  case 6:break;
	  default:System.out.println("You have Entered Wrong Choice");
	  }
	  }while(true);
	  
  }
}
