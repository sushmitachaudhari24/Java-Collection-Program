package collectin;
import java.util.*;
public class PlayerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        Player p[]=new Player[5];
        for(int i=0;i<p.length;i++)
        {
        	p[i]=new Player();
        	System.out.println("Enter Players ID name run");
        	int id=sc.nextInt();
        	String name=sc.next();
        	int run=sc.nextInt();
        	p[i].setId(id);
        	p[i].setName(name);
        	p[i].setRun(run);
        	v.add(p[i]);
        }	
        	System.out.println("Player Details");
        	for(Object obj:v)
        	{
        		Player py=(Player)obj;
        		System.out.println(py.getId()+"  "+py.getName()+"  "+py.getRun());
        	}
        //	System.out.println("Player List in descending Order by its run");
        	 for(int i=0;i<v.size();i++)
        	 {
        		 for(int j=i+1;j<v.size();j++)
        		 {
        			 Object prv=v.get(i);
        			 Object nxt=v.get(j);
        			 Player pr=(Player)prv;
        			 Player nx=(Player)nxt;
        			 if(nx.getRun()>pr.getRun())
        			 {
        				  v.set(i, nx);
           		       v.set(j, pr);
        			 }
        		 }
        	 }
        
        	 System.out.println("After Descending sort Player Details");
         	for(Object obj:v)
         	{
         		Player py=(Player)obj;
         		System.out.println(py.getId()+"  "+py.getName()+"  "+py.getRun());
         	}
        
	}

}
