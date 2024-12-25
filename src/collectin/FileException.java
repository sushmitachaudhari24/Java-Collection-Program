package Test.Io;
import java.util.*;
import java.io.*;
public class FileException {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
       FileWriter fw= new FileWriter("C:\\Test\\JavaDemo\\Data.txt",true);
       BufferedWriter f=new BufferedWriter(fw);
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter string to write in file");
       String str=sc.nextLine();
     //  f.newLine();
       f.write(str+"\n");
       f.close();
       FileReader fr=new FileReader("C:\\Test\\JavaDemo\\Data.txt");
       BufferedReader br=new BufferedReader(fr);
       String data;
       String sb=new String();
       while((data=br.readLine())!=null)
       { sb=sb+data;
    	   System.out.println(data);
    	   Thread.sleep(1000);
       }
       String word[]=sb.split(" ");
       System.out.println("Enter a Word to count Occurance of word");
       String ss=sc.next();
       int c=1;
       for(int i=0;i<word.length;i++)
       {
    	   if(ss.equalsIgnoreCase(word[i]))
    	   {
    		   c++;
    	   }
       }
       System.out.println("Total Count of word is "+c);
       fr.close();
	}
}
