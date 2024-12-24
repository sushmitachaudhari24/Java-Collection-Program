package collectin;
import java.util.*;
class PlayerCase implements Cloneable
{
	private int id;
	   private String name;
	   private int sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public boolean equals(Object obj)
	{
		PlayerCase p=(PlayerCase)obj;
		if(this.id==p.id && this.name.equals(p.name) && this.sal==p.sal)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void calculateSal(int n)
	{
		System.out.println("Total Salary "+(this.sal*n));
	}
	public int hashcode() {
		return sal*1000;
	}
	public PlayerCase getClone() throws CloneNotSupportedException
	{
		Object obj=this.clone();
		PlayerCase c=(PlayerCase)obj;
		return c;
	}
	public String toString() {
		return "["+name+","+id+","+sal+"]";
	}

}
public class PlayerWithCase {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   PlayerCase pc=new PlayerCase();
   pc.setId(1);
   pc.setName("SMC");
   pc.setSal(60000);
   PlayerCase pc1=new PlayerCase();
   pc1.setId(2);
   pc1.setName("PMC");
   pc1.setSal(80000);
   System.out.println("1.Compare to Objects\n2.Convert Player Object in String and Display\n3.Perfom object cloning");
   int num=sc.nextInt();
   switch(num)
   {
   case 1:if(pc.equals(pc1))
   {
	   System.out.println("Objects are Equal");
	   System.out.println("User Defined HashCode of Object 1 "+pc.hashcode());
	   System.out.println("User Defined HashCodeof Object 2"+pc1.hashcode());
   }
   else {
	   System.out.println("Objects are not Equal");
	   System.out.println("User Defined HashCode of Object 1 "+pc.hashcode());
	   System.out.println("User Defined HashCodeof Object 2"+pc1.hashcode());
   }
	     break;
   case 2:String str=pc.toString();
          System.out.println("Player1  Object in String ..."+str);
           str=pc1.toString();
          System.out.println("Player2  Object in String ..."+str);
	    break;
   case 3:
	   PlayerCase p3=new PlayerCase();
	   p3.setSal(20000);
	   PlayerCase plc =p3.getClone();
	   plc.setSal(10000);
	   p3.calculateSal(2);
	  // System.out.println(" Date After Cloning\n "+pc.getId()+"\t"+pc.getName()+"\t"+pc.getSal()+"\t"+t);
	    break;
   }
	}

}
