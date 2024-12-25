package collectin;
import java.util.*;
public class StringRepetativeWordUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String ..");
    String s=sc.nextLine();
    String str[]=s.split(" ");
    TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
    int c=0;
    for(int i=0;i<str.length;i++)
    {c=1;
    	for(int j=i+1;j<str.length;j++)
    	{
    		if(str[i].equalsIgnoreCase(str[j]))
    		{
    			c++;
    		}
    	}
    	if(c>1)
    	{
    		
    		tm.put(str[i],c);
    		
    	}
    }
    System.out.println("Records After Mapping");
    Set<Map.Entry<String, Integer>>map=tm.entrySet();
    for(Map.Entry<String, Integer> m:map)
    {
    	System.out.println(m.getKey()+"\t"+m.getValue());
    }
    
	}

}
