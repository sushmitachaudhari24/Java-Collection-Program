package collectin;

import java.util.Comparator;

public class EmpSortBySal implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
			Employee e1=(Employee)o1;
			Employee e2=(Employee)o2;
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
