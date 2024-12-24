package collectin;
import java.util.*;
class Emp
{ int eid;
  String name;
  int sal;
	Emp(String name,int id,int sal)
	{
		this.name=name;
		eid=id;
		this.sal=sal;
	}
     void calculateFinalSal()
     {
    	 System.out.println("Final Salary");
     }
	
}
class Manager extends Emp
{ int bonus;
	Manager(String name,int id,int sal,int bonus)
	{
		super(name,id,sal);
		this.bonus=bonus;
	}
	@Override
	void calculateFinalSal() {
		// TODO Auto-generated method stub
		//super.calculateFinalSal();
		System.out.println(eid+"\t"+name+"\t"+sal+"\t"+bonus+"\t"+(sal+bonus));
	}
}
class Intern extends Emp
{ int internshipDuration;
	Intern(String name,int id,int sal,int duration)
	{
		super(name,id,sal);
		internshipDuration=duration;
	}
	@Override
	void calculateFinalSal() {
		// TODO Auto-generated method stub
		//super.calculateFinalSal();
		
		System.out.println(eid+"\t"+name+"\t"+sal+"\t"+internshipDuration+"\t"+(sal/internshipDuration));
	}
}
public class EmployeeDataApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int id,sal,bonus,duration;
        Scanner sc=new Scanner(System.in);
        System.out.println("======Employee======\n1.Manager\n2.Intern\n====================\nEnter your choice");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1:
        	Manager m[]=new Manager[2];
        	for(int i=0;i<m.length;i++)
        	{
        		System.out.println("Enter Name,ID,Sal,Bonus Of Manager");
                name=sc.next();
                id=sc.nextInt();
                sal=sc.nextInt();
                bonus=sc.nextInt();
                m[i]=new Manager(name,id,sal,bonus);
              
        	}
        	System.out.println("E_id\tName\tSal\tBonus\tFinalSal");
        	 for(int k=0;k<m.length;k++)
             {
          	   m[k].calculateFinalSal();
             }
        	break;
        	
        	
        case 2: Intern i[]=new Intern[2];
           for (int k=0;k<i.length;k++)
         	{
        	  System.out.println("Enter Name,ID,Sal,Internship Duration Of Internship (Months)");
        		name=sc.next();
        		id=sc.nextInt();
        		sal=sc.nextInt();
        		duration=sc.nextInt();
        		i[k]=new Intern(name,id,sal,duration);
         	}
           System.out.println("E_id\tName\tSal\tinternshipDuration\tFinalSal");
           for(int k=0;k<i.length;k++)
           {
        	   i[k].calculateFinalSal();
           }
        	break;	
        	default:System.out.println("You have Entered Invalid Choice");
        }
	}  

}
