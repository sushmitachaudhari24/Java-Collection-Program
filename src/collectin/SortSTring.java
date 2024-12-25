package Test.Io;

import java.util.*;

public class SortSTring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList <String> al=new ArrayList<String>();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 5 String");
    for(int i=0;i<5;i++)
    {
    	String str=sc.next();
    	al.add(str);
    	
    }
    Collections.sort(al);
    System.out.println("Strings are..");
    for(Object obj:al)
    {
    	String s=(String)obj;
    	System.out.println(s);
    }
	}

}
