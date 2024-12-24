package collectin;

import java.util.*;

public class PalindromeUsingGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	ArrayList <String>al=new ArrayList<String>();
     al.add("abc");
     al.add("sdf");
     al.add("aabbaa");
     al.add("Bilal");
     al.add("zxccxz");
     al.add("qweewq");
     al.add("gfg");
     System.out.println("ArrayList Elements are...\n");
     for(String s:al)
     {
       System.out.println(s);
     }
     System.out.println("=========================\nPalindrome Elements are...\n");
     for(String str:al)
     { boolean b=false;
    	 char ch[]=str.toCharArray();
    	 for(int i=0,j=ch.length-1;i<=ch.length/2;i++,j--)
    	 {
    		 if(ch[i]==ch[j])
    		 {
    			 b=true;
    		 }
    		 else
    		 {
    			 b=false;
    			 break;
    		 }
    	 }
    	 if(b) {
    	 System.out.println(String.valueOf(ch));}
     }
	}

}
