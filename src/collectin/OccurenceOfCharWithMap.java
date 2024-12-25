package collectin;
import java.util.*;
public class OccurenceOfCharWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        LinkedHashMap <Character ,Integer> lm=new LinkedHashMap<Character ,Integer>(); 
        for(int i=0;i<ch.length;i++)
        {
        	for(int j=i+1;j<ch.length;j++)
        	{
        		if(ch[i]>ch[j])
        		{
        			char c=ch[i];
        			ch[i]=ch[j];
        			ch[j]=c;
        		}
        	}
        }
        int count=1;
        for(int i=0;i<ch.length;i++)
        {
        	if(i<ch.length-1 && ch[i]==ch[i+1])
        	{
        		count++;
        	}
        	else
        	{
        		lm.put(ch[i],count);
        	}
        }
        Set<Map.Entry<Character , Integer>> map=lm.entrySet();
        for(Map.Entry<Character , Integer>m:map)
        {
        	System.out.println(m.getKey()+"......."+m.getValue());
        }
	}

}
