package collectin;
import java.util.*;
interface Employee1
{
	void performTask();
	double calculateSal();
}
class Manager1 implements Employee1
{
  private String name;
  private double baseSalary;
  private int teamsize;
  public Manager1(String name,double bs,int ts)
  {
	  this.name=name;
	  baseSalary=bs;
	  teamsize=ts;
  }
  
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}

public int getTeamsize() {
	return teamsize;
}

public void setTeamsize(int teamsize) {
	this.teamsize = teamsize;
}

	@Override
	public void performTask() {
		// TODO Auto-generated method stub
		System.out.println("Manager is managing team");
	}

	@Override
	public double calculateSal() {
		// TODO Auto-generated method stub
		return baseSalary+(double)(teamsize*1000);
	}
	
	
}
class Developer implements Employee1
{
	 private String name;
	  private double baseSalary;
	  private int task;
	  public Developer(String name,double bs,int task)
	  {
		  this.name=name;
		  baseSalary=bs;
		  this.task=task;
	  }
	  
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getTask() {
		return task;
	}

	public void setTask(int task) {
		this.task = task;
	}

	@Override
	public void performTask() {
		// TODO Auto-generated method stub
		System.out.println("Developer is Coding");
	}

	@Override
	public double calculateSal() {
		// TODO Auto-generated method stub
		return baseSalary+(double)(task*200);
	}
	
}
public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter \n1.Manager\n2.Developer");
       int ch=sc.nextInt();
       switch(ch)
       {
       case 1:System.out.println("Enter name basesal teamsize ");//case 1 for manager
       String name=sc.next();
       double basesal=sc.nextDouble();
       int teamsize=sc.nextInt();
    	    Manager1 m= new  Manager1(name,basesal,teamsize);
    	    m.performTask();
            System.out.println(".."+m.getName()+"\t"+m.getBaseSalary()+"\t"+m.getTeamsize()+"\t"+m.calculateSal());
            break;
       case 2:     
    	   System.out.println("Enter name basesal,completed task");
    	    name=sc.next();
    	   basesal=sc.nextDouble();
    			   int task=sc.nextInt();
    			   Developer d=new Developer(name,basesal,task);
    			   d.performTask();
    			   System.out.println(".."+d.getName()+"\t"+d.getBaseSalary()+"\t"+d.getTask()+"\t"+d.calculateSal());
    	            break;	   
       }
       }
	}


