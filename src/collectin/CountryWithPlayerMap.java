package collectin;
import java.util.*;
public class CountryWithPlayerMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           LinkedHashMap <String,LinkedHashMap<Integer,String>> lhm=new LinkedHashMap<String,LinkedHashMap<Integer,String>>();
           Player p=new Player();
           LinkedHashMap<Integer,String> lh1=new LinkedHashMap<Integer,String>();
           lh1.put(1,"Ram");
           lh1.put(2,"Shyam");
           lh1.put(3,"Ganesh");
           lhm.put("India", lh1);
           
           LinkedHashMap<Integer,String> lh2=new LinkedHashMap<Integer,String>();
           lh2.put(1,"Steve");
           lh2.put(2,"finch");
           lh2.put(3,"Warner");
           lhm.put("Austrulia",lh2);
           
           System.out.println("Here is the data of Player....\n======================================================");
           
           Set<Map.Entry<String, LinkedHashMap<Integer,String>>>map=lhm.entrySet();
           for(Map.Entry<String, LinkedHashMap<Integer,String>>m:map)
           {
        	   System.out.println(m.getKey()+" Team Player List....");
        	   System.out.println("======================================================");
        	   LinkedHashMap l=m.getValue();
        	  
        	   Set<Map.Entry<Integer, String>>map1=l.entrySet();
        	   System.out.println("Id\tName");
        	   for(Map.Entry<Integer,String>lm:map1)
        	   {
        		  
        		   System.out.println(lm.getKey()+"\t"+lm.getValue());
        		   
        	   }
        	   System.out.println("======================================================");
           }
           
	}

}
