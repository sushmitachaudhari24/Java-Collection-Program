package collectin;

import java.util.Vector;

public class VectorWithUserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vector v=new Vector();
     Employee e1=new Employee();
     e1.setId(1);
     e1.setName("ABC");
     e1.setSal(1000);
     
     Employee e2=new Employee();
     e2.setId(2);
     e2.setName("MNO");
     e2.setSal(2000);
     
     Employee e3=new Employee();
     e3.setId(3);
     e3.setName("XYZ");
     e3.setSal(3000);
     v.add(e1);
     v.add(e2);
     v.add(e3);
     for(Object obj:v)
     {Employee emp=(Employee)obj;
    	 System.out.println(emp.getId()+"  "+emp.getName()+"  "+emp.getSal());
     }
	}

}
