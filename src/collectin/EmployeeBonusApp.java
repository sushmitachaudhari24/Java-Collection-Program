package Test.Io;
import java.util.*;
class EmployeeBonus
{
	private int id;
	private String name;
	private String designation;
	private int bsal;
	private float sal;
	EmployeeBonus(int id,String name,String des,int bsal)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.bsal=bsal;
	}
	public void displayDetails()
	{
		System.out.println("ID.."+id+"\nName.."+name+"\nDesignation.."+designation+"\nBasic Salary.."+bsal);
	}
	public void applyBonus(String str)
	{String s=str;
		switch(s)
		{
		case "Excellent":
		case "excellent": sal=(float)(bsal*0.2);
		      System.out.println("Bonus is.."+sal);break;
		case "Good":
		case "good": sal=(float)(bsal*0.1);
              System.out.println("Bonus is.."+sal);break; 
		case "Average":
		case "average":sal=(float)(bsal*0.05);
              System.out.println("Bonus is.."+sal);break;     
        default:System.out.println("Sorry!!! You have Entered Wrong Performance rating");      
		}
	}
}
public class EmployeeBonusApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Emp_Id,Emp_Name,Emp_designation,Emp_BasicSalary,Performance Rating");
         int id=sc.nextInt();
         String name=sc.next();
         String des=sc.next();
         int bsal=sc.nextInt();
         String pr=sc.next();
         EmployeeBonus eb=new EmployeeBonus(id,name,des,bsal);
         eb.displayDetails();
         eb.applyBonus(pr);
	}
}
