package Test.Io;
import java.util.*;
class Book
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getAuthor()+"\t"+this.getTitle()+"\t"+this.getIsbn();
	}
	private String title;
	private String author;
	private int isbn;
	public Book( String title,String author,int isbn)
	{
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
}
class Library
{ Book b;
	public void addBook(Book book)//initialize book object
	{
		b=book;
	}
	public void SearchByTitle(String title)//search by title
	{
		if((b.getTitle()).equalsIgnoreCase(title))
		{
			System.out.println(".."+b.getAuthor()+"\t"+b.getTitle()+"\t"+b.getIsbn());
		}
	}
	public void SearchByAuthor(String author)//search by author
	{
		if((b.getAuthor()).equalsIgnoreCase(author))
		{
			System.out.println(".."+b.getAuthor()+"\t"+b.getTitle()+"\t"+b.getIsbn());
		}
	}
	public void displayBook()//To display record
	{
		System.out.println(b);
	}
	
}
public  class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     Book b[]=new Book[4];
      b[0]=new Book("Wings","APJKalam",1234);
      b[1]=new Book("Biography","APJKalam",9834);
      b[2]=new Book("weather","ram",9934);
     Library l=new Library();
     do {
     System.out.println("1.ADD Book\n2.Search Book by title\n3.Search book by author\n 4.Display\nEnter your choice");
     int ch=sc.nextInt();
     switch(ch)
     {
     case 1: System.out.println("Enter Book name ,Author ,ISBN(int)");
             String bname=sc.next();
             String aname=sc.next();
             int isbn=sc.nextInt();
             b[3]=new Book(bname,aname,isbn);
             System.out.println("SuccessFully Added\n Records are...\n");
             for(int i=0;i<b.length;i++)
             {
            	 l.addBook(b[i]);
            	 l.displayBook();
             }
    	 break;
     case 2:System.out.println("Enter book title");
            String btitle=sc.next();
            for(int i=0;i<b.length-1;i++)
            {
           	 l.addBook(b[i]);
           	 l.SearchByTitle(btitle);   
            }
            break;
     case 3:System.out.println("Enter book author");
     String bauthor=sc.next();
     for(int i=0;i<b.length-1;i++)
     {
    	 l.addBook(b[i]);
    	 l.SearchByAuthor(bauthor);   
     }
     break;
     case 4:if(b.length!=0)
            {
    	 System.out.println("Records are....\n");
    	 for(int i=0;i<b.length-1;i++)
         {
        	 l.addBook(b[i]);
        	 l.displayBook();
         }
            }
     else
     {
    	 System.out.println("Data not Present...");
     }
     break;
     default:System.out.println("Wrong choice");
     }
       
     }while(true);
   
	}

}
