package Test.Io;
import java.util.*;
class Employe
{
	private int id;
	private String name;
	private String position;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
public class EmployeeTreeMAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeMap<Integer,Employe> tm=new TreeMap<Integer,Employe>();
     Employe e=new Employe();
     e.setId(1);
     e.setName("ABC");
     e.setPosition("Manager");
     Employe e1=new Employe();
     e1.setId(5);
     e1.setName("MNO");
     e1.setPosition("FSD");
     Employe e2=new Employe();
     e2.setId(3);
     e2.setName("PQR");
     e2.setPosition("SE");
     tm.put(e.getId(), e);
     tm.put(e1.getId(), e1);
     tm.put(e2.getId(),e2);
    Set<Map.Entry<Integer, Employe>>set=tm.entrySet();
    for(Map.Entry<Integer, Employe>m:set)
    {Employe emp=m.getValue();
    
    	System.out.println(m.getKey()+"\t"+emp.getName()+"\t"+emp.getPosition());
    }
	}

}
