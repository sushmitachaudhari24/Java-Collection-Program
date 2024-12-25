package collectin;
import java.util.*;
public class HashMapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,String> hm=new HashMap<Integer,String>();
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 5 String Names");
       for(int i=1;i<=5;i++)
       {String s=sc.next();
    	   hm.put(i,s);
       }
       
       
      Set<Map.Entry<Integer, String>> map=hm.entrySet();
      for(Map.Entry<Integer, String>m:map)
      {
    	 System.out.println(m.getKey()+"...."+m.getValue());
    	  
      }
	}

}
