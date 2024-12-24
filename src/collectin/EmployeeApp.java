package collectin;

import java.io.*;
import java.util.*;
class Employeerec
{
	private int id;
	private String name;
	private int sal;
	public Employeerec(String name,int id,int sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
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
}
public class EmployeeApp {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
//      Employeerec e=new Employeerec("ABC",1,20000);
//      Employeerec e1=new Employeerec("MNO",2,30000);
         Employeerec e[]=new Employeerec[3];
		Scanner sc=new Scanner(System.in);
		 ArrayList al=new ArrayList();
		System.out.println("Enter 3 Records of employee");
		for(int i=0;i<e.length;i++)
		{
			System.out.println(i+1+". Enter Name,Id,Salary");
			String name=sc.next();
			int id=sc.nextInt();
			int sal=sc.nextInt();
			e[i]=new Employeerec(name,id,sal);
			al.add(e[i]);
		}
		System.out.println("Employee Record Before Sorting");
		for(Object obj:al)
		{
			Employeerec erc=(Employeerec)obj;
			System.out.println(erc.getId()+"\t"+erc.getName()+"\t"+erc.getSal());
		}
//     
//      File f=new File("C:\\Test\\JavaDemo\\Employee.csv");
//      boolean b=f.createNewFile();
//      if(b)
//      { System.out.println("File Created");}
//      else
//      { System.out.println("Some Problem is there");}
//      
//      FileWriter fw=new FileWriter(f);
//      CSVWriter cw=new CSVWriter(fw);
		System.out.println("Choose Here\n1.SortByID\n2.SortBySal\nEnter");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:EmployeeSortByID es=new EmployeeSortByID();
		       Collections.sort(al,es);
			break;
		case 2:EmployeeSortBySalary s=new EmployeeSortBySalary();
	       Collections.sort(al,s);
			break;
		}
		System.out.println("Employee Record After Sorting");
		for(Object obj:al)
		{
			Employeerec erc=(Employeerec)obj;
			System.out.println(erc.getId()+"\t"+erc.getName()+"\t"+erc.getSal());
		}
	}

}
