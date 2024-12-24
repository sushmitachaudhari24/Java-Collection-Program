package collectin;
import java.util.*;
public class BirdsSortByName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Birds b=(Birds)o1;
		Birds b1=(Birds)o2;
		return b.getName().compareToIgnoreCase(b1.getName());
		
	}
	
	
	

}
