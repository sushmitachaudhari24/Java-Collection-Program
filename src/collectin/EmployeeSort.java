package collectin;
import java.util.*;
import java.io.*;
public class EmployeeSort {

	 public static void main(String []args)
	 {
		 ArrayList al=new ArrayList();
		 
		 Employee e1=new Employee();
		 e1.setId(1);
		 e1.setName("XYZ");
		 e1.setSal(200);
		 Employee e2=new Employee();
		 e2.setId(2);
		 e2.setName("MNO");
		 e2.setSal(500);
		 Employee e3=new Employee();
		 e3.setId(3);
		 e3.setName("ABC");
		 e3.setSal(800);
		 Employee e4=new Employee();
		 e4.setId(4);
		 e4.setName("PQR");
		 e4.setSal(1200);
		 Employee e5=new Employee();
		 e5.setId(5);
		 e5.setName("LMN");
		 e5.setSal(100);
		 al.add(e1);
		 al.add(e2);
		 al.add(e3);
		 al.add(e4);
		 al.add(e5);
		 System.out.println("Details of All Employee");
		 for(Object obj:al)
		 {
			 Employee e=(Employee)obj;
			 System.out.println(".."+e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		 }
		 Scanner sc=new Scanner(System.in);
		 System.out.println("1.Sort By Name\n2.Sort By Sal\nEnter..");
		 int ch=sc.nextInt();
		 switch(ch)
		 {
		 case 1:EmpSortByName en=new EmpSortByName();
		        Collections.sort(al,en);
		        System.out.println("Employee Record After Sorting by Name");
		 		for(Object obj:al)
		 		{
		 			Employee erc=(Employee)obj;
		 			System.out.println(erc.getId()+"\t"+erc.getName()+"\t"+erc.getSal());
		 		}
			   break;
		 case 2:EmpSortBySal es=new EmpSortBySal();
		         Collections.sort(al,es);
		         System.out.println("Employee Record After Sorting by Salary");
		 		for(Object obj:al)
		 		{
		 			Employee erc=(Employee)obj;
		 			System.out.println(erc.getId()+"\t"+erc.getName()+"\t"+erc.getSal());
		 		}
			   break;
		 }
	 }
}
