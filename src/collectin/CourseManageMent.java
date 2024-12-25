package Test.Io;
import java.util.*;
class Student
{
	private String name;
	private double grade;
	public Student(String name,double grade)
	{
		this.name=name;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}
public class CourseManageMent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       HashMap<String,HashMap<String,ArrayList>> cm=new  HashMap<String,HashMap<String,ArrayList>>();
       HashMap<String,ArrayList> dp=new HashMap<String,ArrayList>();
       HashMap<String,ArrayList> dp1=new HashMap<String,ArrayList>();
       ArrayList a1=new ArrayList();
       Student s=new Student("Abc",90.20);
       Student s1=new Student("Mno",80.45);
       Student s2=new Student("Pqr",50);
       Student s3=new Student("Stv",70);
       a1.add(s);
       a1.add(s1);
       a1.add(s2);
       a1.add(s3);
       dp.put("Computer", a1);
       dp.put("IT", a1);
       cm.put("Engineering", dp);
       ArrayList a2=new ArrayList();
        do { System.out.println("====================\n--------Menu--------\n====================\n\t1.Add Course \n\t2.Entroll Students"
        	       + "\n\t3.Retrievin Students Grade\n\t4.calculate Average grade for each course within department\n\t5.ALL Records\n===========================\nEnter Your choice..");
        int ch=sc.nextInt();
      
    	   switch(ch)
           {
           case 1:System.out.println("Enter Course to Add");
                  String course=sc.next();
                  System.out.println("Enter How many deparment do you want to add in "+course);
                  int n=sc.nextInt();
                  for(int i=0;i<n;i++)
                  {System.out.println("Enter department name..");
                    String dn=sc.next();
                	  dp1.put(dn, null);
                  }
                  cm.put(course, dp1);
                  break;
           case 2: 
                   System.out.println("Enter course");
                   String sco=sc.next();
                   boolean cb=false,db=false;
                   Set<Map.Entry<String, HashMap<String,ArrayList>>> map=cm.entrySet();  
                   for(Map.Entry<String, HashMap<String,ArrayList>>c:map)
                   {
                	   String st=c.getKey();
                	  if(st.equalsIgnoreCase(sco))
                	  {  cb=true;
                		  System.out.println("Enter department");
                          String sdp=sc.next();
                            HashMap <String,ArrayList> dep=c.getValue();
                          Set<Map.Entry<String, ArrayList>>dlist=dep.entrySet();
                          for(Map.Entry<String, ArrayList> d:dlist)
                          {
                        	  if(sdp.equalsIgnoreCase(d.getKey()))
                        	  {db=true;
                        		  System.out.println("Enter Students count to add");
                        		  int scount=sc.nextInt();
                        		  for(int i=0;i<scount;i++)
                        		  {
                        			  System.out.println("Enter name , grade(float)");
                        			  String nm=sc.next();
                        			  double gd=sc.nextDouble();
                        			  Student stud=new Student(nm,gd);
                        			  a2.add(stud);
                        			  d.setValue(a2);
                        		  }
                        		System.out.println("Student Added SuccessFully");
                        		db=true;
                        		  break;
                        	  }
                        	  else
                        	  {db=false;
                        		 
                        	  }
                        	}
                         
                          cb=true;
                	  }else {
                		  cb=false;
                	  }
                   }
                   if(cb==false)
                   {
                	   System.out.println("Course not found");
                   }
                   if(db==false && cb==true)
                   {
                	   System.out.println("Department not found");
                   }
                  break;
                 
         case 3:      
             System.out.println("Enter course");
             sco=sc.next();
              cb=false;
              db=false;
             Set<Map.Entry<String, HashMap<String,ArrayList>>> map1=cm.entrySet();  
             for(Map.Entry<String, HashMap<String,ArrayList>>c:map1)
             {
          	   String st=c.getKey();
          	  if(st.equalsIgnoreCase(sco))
          	  { 
          		  System.out.println("Enter department");
                    String sdp=sc.next();
                      HashMap <String,ArrayList> dep=c.getValue();
                    Set<Map.Entry<String, ArrayList>>dlist=dep.entrySet();
                    for(Map.Entry<String, ArrayList> d:dlist)
                    {
                  	  if(sdp.equalsIgnoreCase(d.getKey()))
                  	  {  ArrayList a=d.getValue();
                  	   for(Object obj :a)
                  	   {
                  		 Student stud=(Student)obj;
                  		 System.out.println(" "+c.getKey()+"\t"+d.getKey()+"\t"+stud.getName()+"\t"+stud.getGrade());
                  	   }
                  		db=true;
                  		  break;
                  	  }
                  	  else
                  	  {db=false;
                  		 
                  	  }
                  	}
                   
                    cb=true;
          	  }else {
          		  cb=false;
          	  }
             }
             if(cb==false)
             {
          	   System.out.println("Course not found");
             }
             if(db==false && cb==true)
             {
          	   System.out.println("Department not found");
             }
            break;
             
         case 4:	double avg=0,sum=0;
        	 System.out.println("Enter course");
             sco=sc.next();
              cb=false;
              db=false;
             Set<Map.Entry<String, HashMap<String,ArrayList>>> map2=cm.entrySet();  
             for(Map.Entry<String, HashMap<String,ArrayList>>c:map2)
             {
          	   String st=c.getKey();
          	  if(st.equalsIgnoreCase(sco))
          	  { 
          		  System.out.println("Enter department");
                    String sdp=sc.next();
                      HashMap <String,ArrayList> dep=c.getValue();
                    Set<Map.Entry<String, ArrayList>>dlist=dep.entrySet();
                    for(Map.Entry<String, ArrayList> d:dlist)
                    {
                  	  if(sdp.equalsIgnoreCase(d.getKey()))
                  	  {  ArrayList a=d.getValue();
                  	
                  	   for(Object obj :a)
                  	   {
                  		 Student stud=(Student)obj;
                  		 sum=sum+stud.getGrade();
                  		 //System.out.println(" "+c.getKey()+"\t"+d.getKey()+"\t"+stud.getName()+"\t"+stud.getGrade());
                  	   }
                  	   avg=sum/a.size();
                  	   System.out.println("Average Of Grades According to Course department\n"+c.getKey()+"\t"+d.getKey()+"\t"+avg);
                  		db=true;
                  		  break;
                  	  }
                  	  else
                  	  {db=false;
                  		 
                  	  }
                  	}
                   
                    cb=true;
          	  }else {
          		  cb=false;
          	  }
             }
             if(cb==false)
             {
          	   System.out.println("Course not found");
             }
             if(db==false && cb==true)
             {
          	   System.out.println("Department not found");
             }
            break;
            
         case 5:
        	 Set<Map.Entry<String, HashMap<String,ArrayList>>> ma=cm.entrySet();  
             for(Map.Entry<String, HashMap<String,ArrayList>>c:ma)
             {
          	  System.out.println("==============================================\n"+c.getKey()+"------------------------------------");
          	
                      HashMap <String,ArrayList> dep=c.getValue();
                        Set<Map.Entry<String, ArrayList>>dlist=dep.entrySet();
                      for(Map.Entry<String, ArrayList> d:dlist)
                    { System.out.println("-----------------------------------\n"+d.getKey()+"------------------------------------");
                  	  ArrayList a=d.getValue();
                  	   for(Object obj :a)
                  	   {Student stud=(Student)obj;
                  		System.out.println(" "+stud.getName()+"\t"+stud.getGrade());
                  	   }
                  	   System.out.println("-----------------------------------------------");
                  	}                   
                      System.out.println("==============================================\n");
          	  }           
           }
       }while(true);
       
	}

}
