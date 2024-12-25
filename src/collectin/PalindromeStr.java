package Test.Io;
import java.util.*;
public class PalindromeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String:");//getInput from user
       String str=sc.nextLine();
       String word[]=str.split(" ");
       ArrayList al=new ArrayList();
       for(int i=0;i<word.length;i++)
       {
    	   if(word[i].length()>=2)// contains atleast 2 char
    	   {String s=word[i];
    		  char ch[]=word[i].toCharArray();
    		  for(int j=0,k=ch.length-1;j<ch.length/2;j++,k--)
    		  {    if((ch[j]>='a' && ch[j]<='z') || (ch[j]>='A' && ch[j]<='A') ||(ch[k]>='a' && ch[k]<='z')||(ch[k]>='a' && ch[k]<='z') )
    		      {
    			  char c=ch[j];
    			  ch[j]=ch[k];
    			  ch[k]=c;
    		      }
    		  else {
    			  break;
    		       }
    		  }
    		  String s1=String.valueOf(ch);
    		
    		  if(s1.equalsIgnoreCase(s))//compare string
    		  {
    			  al.add(s1);
    		  }
    	   }
       }
       
       for(Object obj:al)
       {
    	  
    	   System.out.println(obj);
       }
       
	}

}
