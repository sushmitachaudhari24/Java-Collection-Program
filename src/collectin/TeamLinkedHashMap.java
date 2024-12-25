package collectin;
import java.util.*;
public class TeamLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    LinkedHashMap<String ,ArrayList<String>> lm=new LinkedHashMap<String ,ArrayList<String>>();
    ArrayList <String> al=new ArrayList<String>();
    al.add("Rohit");
    al.add("Virat");
    al.add("Hardik");
    lm.put("India", al);
    ArrayList <String> al1=new ArrayList<String>();
    al1.add("Steve");
    al1.add("finch");
    al1.add("Warner");
    lm.put("Australia", al1);
    
    Set<Map.Entry<String, ArrayList<String>>>map=lm.entrySet();
    for(Map.Entry<String, ArrayList<String>> m:map)
    {
    	//m.getKey();
    	System.out.println(m.getKey());
    	ArrayList a=m.getValue();
    	System.out.println("==========================================");
    	for(Object o:a)
    	{
    		System.out.println(o);
    	}
    	
    	System.out.println("==========================================\n");
    }
    
	}

}
