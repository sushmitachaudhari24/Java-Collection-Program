package collectin;
import java.util.*;
import java.lang.*;
public class OccurenceLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedHashMap <Integer,Integer> lm=new LinkedHashMap<Integer,Integer>();
    int a[]=new int[] {101,102,103,102,165,987,101,102,165,165};
    
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=i+1;j<a.length;j++)
    	  {
    		  if(a[i]>a[j])
    		  {
    			  int temp=a[i];
    			  a[i]=a[j];
    			  a[j]=temp;
    		  }
    	  }
      }
      int count=1;
      
      for(int i=0;i<a.length-1;i++)
      {
    	  if(i<a.length-1 && a[i]==a[i+1])
    	  {
    		  count++;
    	  }
    	  else
    	  {
    		  lm.put(a[i],count);
    		  count=1;
    	  }
      }
    System.out.println("Here is the List with Occurences and Element");
    Set<Map.Entry<Integer, Integer>> map=lm.entrySet();
    for(Map.Entry<Integer, Integer> m:map)
    {
    	System.out.println(m.getKey()+"\t"+m.getValue());
    }
      
	}

}
