package collectin;
import java.util.*;
public class EmployeeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedHashMap<String,ArrayList<Employee>> lhm=new LinkedHashMap<String,ArrayList<Employee>>();
      
      ArrayList al1=new ArrayList();
      ArrayList al2=new ArrayList();
      
       Employee e1=new Employee();
       e1.setId(1);
       e1.setName("Abc");
       e1.setSal(10000);
       Employee e2=new Employee();
       e2.setId(2);
       e2.setName("Mno");
       e2.setSal(20000);
       Employee e3=new Employee();
       e3.setId(3);
       e3.setName("Pqr");
       e3.setSal(30000);
       
       al1.add(e1);
       al1.add(e2);
       al1.add(e3);
       
       Employee e4=new Employee();
       e4.setId(1);
       e4.setName("Ram");
       e4.setSal(10000);
       Employee e5=new Employee();
       e5.setId(2);
       e5.setName("Shyam");
       e5.setSal(20000);
       Employee e6=new Employee();
       e6.setId(3);
       e6.setName("Ganesh");
       e6.setSal(30000);
       al2.add(e4);
       al2.add(e5);
       al2.add(e6);
       lhm.put("Developer", al1);
       lhm.put("Tester",al2);
       Set<Map.Entry<String, ArrayList<Employee>>>map=lhm.entrySet();
       System.out.println("==============================================");
       for(Map.Entry<String, ArrayList<Employee>>m:map)
       {
    	   System.out.println("Employee List From "+m.getKey());
    	   System.out.println("==============================================");
    	   ArrayList al=m.getValue();
    	   System.out.println("ID\tNAME\tSALARY");
    	   for(Object o:al)
    	   {
    		   Employee e=(Employee)o;
    		   System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
    	   }
    	   System.out.println("==============================================");
    	   
       }
      
	}

}
