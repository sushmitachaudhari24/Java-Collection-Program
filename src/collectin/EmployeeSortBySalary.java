package collectin;

import java.util.Comparator;

public class EmployeeSortBySalary implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employeerec e1=(Employeerec)o1;
		Employeerec e2=(Employeerec)o2;
		if(e1.getSal()>e2.getSal())
		{
			return 1;
		}
		else if(e1.getSal()<e2.getSal())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
  
}
