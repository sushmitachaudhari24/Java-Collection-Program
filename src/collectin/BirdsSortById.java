package collectin;

import java.util.Comparator;

public class BirdsSortById implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Birds b1=(Birds)o1;
		Birds b2=(Birds)o2;
		if(b1.getId()>b2.getId())
		{
			return 1;
		}
		else if(b1.getId()<b2.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
