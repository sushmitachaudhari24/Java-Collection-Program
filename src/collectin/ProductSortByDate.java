package collectin;

import java.util.Comparator;
import java.util.*;
import java.text.*;
public class ProductSortByDate implements Comparator {

	@Override
	public int compare(Object o1, Object o2)
	{
		// TODO Auto-generated method stub
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		try {
		
		if ((p1.getDate()).compareTo(p2.getDate())>0) {
			return 1;
		} 
		else if ((p1.getDate()).compareTo(p2.getDate())<0){
			return -1;
		}
		else {
			return 0;
		     }
		}
		catch (Exception e)
		{
			System.out.println("error "+e);
		}
		return 0;
		
	}

}
