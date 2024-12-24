package collectin;
import java.util.*;
public class BirdsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
       LinkedList <Birds>ll=new LinkedList<Birds>();
       ll.add(new Birds(13,"parrot","Green"));
       ll.add(new Birds(12,"Peagon","Gray"));
       ll.add(new Birds(14,"peacock","greenblue"));
       ll.add(new Birds(11,"crow","black"));
       System.out.println("Birds Details....");
       for(Birds b:ll)
       {
    	   System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getFeatures());
       }
       
     //  do {
    	   System.out.println("===============================\n1.Sort By Id\n2.Sort By Name\n====================================\nEnter here");
            ch=sc.nextInt();
            switch(ch)
            {
            case 1:BirdsSortById bi=new BirdsSortById();
                   Collections.sort(ll,bi);
                   break;
            case 2:BirdsSortByName b=new BirdsSortByName();
                   Collections.sort(ll,b);
                   break;
            default:System.out.println("Wrong Choice");       
            }
     //  }while(ch==1 || ch==2);
       System.out.println("Birds Details After Sorting....");
       for(Birds b:ll)
       {
    	   System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getFeatures());
       }
	}

}
