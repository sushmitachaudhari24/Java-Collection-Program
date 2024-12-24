package collectin;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Object obj[]= new Object[5];
		obj[0]=100;
		obj[1]=false;
		obj[2]=3.14f;
		obj[3]=new java.util.Date();
		obj[4]="Good";
		
		for(Object val:obj)
		{
			System.out.println(val);
		}
	}

}
