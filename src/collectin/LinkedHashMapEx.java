package collectin;
import java.util.*;
public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      LinkedHashMap <Integer,String>lm=new LinkedHashMap<Integer,String>();
      System.out.println("Enter 5 String values ");
      for(int i=1;i<=5;i++)
      {
    	  String s=sc.next();
    	  lm.put(i, s);
      }
      
      System.out.println("Record of LinkedHashMap...");
      Set<Map.Entry<Integer, String>>lhm=lm.entrySet();
      for(Map.Entry<Integer, String>m:lhm)
      {
    	  System.out.println(m.getKey()+"..==.."+m.getValue());
      }
      
	}

}
