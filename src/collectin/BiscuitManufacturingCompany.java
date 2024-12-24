package collectin;

import java.util.*;

public class BiscuitManufacturingCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap <String,LinkedHashMap<String,Biscuit>> lhm=new LinkedHashMap<String,LinkedHashMap<String,Biscuit>>();
          LinkedHashMap <String,Biscuit> lb=new LinkedHashMap <String,Biscuit>();
          lb.put("PG001",new Biscuit("Parle-g",1,5));
          lb.put("PG002",new Biscuit("Parle-g Gold",2,10));
          lb.put("PG003",new Biscuit("Parle-g Chota Bheem",3,15));
          
          LinkedHashMap <String,Biscuit> lb1=new LinkedHashMap <String,Biscuit>();
          lb1.put("BR001",new Biscuit("Britania 50 50",1,5));
          lb1.put("BR002",new Biscuit("Britania milk Bikis",2,10));
          lb1.put("BR003",new Biscuit("Britania Coco nuts",3,15));
          
          LinkedHashMap <String,Biscuit> lb2=new LinkedHashMap <String,Biscuit>();
          lb2.put("OR001",new Biscuit("Oreo Original Cookies",1,10));
          lb2.put("OR002",new Biscuit("Oreo Golden",2,15));
          lb2.put("OR003",new Biscuit("Oreo chocolate Cream",3,25));
          
          lhm.put("Parle-G", lb);
          lhm.put("Britania", lb1);
          lhm.put("Oreo", lb2);
          Set<Map.Entry<String,LinkedHashMap<String,Biscuit>>> m=lhm.entrySet();
          for(Map.Entry<String, LinkedHashMap<String,Biscuit>>s:m)
          {
        	  String btype=s.getKey();
        	  System.out.println(btype);
        	  System.out.println("============================================================");
        	  LinkedHashMap<String,Biscuit> bdata=s.getValue();
        	  Set<Map.Entry<String,Biscuit>> blist=bdata.entrySet();
        	  for(Map.Entry<String,Biscuit> biskit:blist)
        	  {
        		  String bcode=biskit.getKey();
        		  Biscuit bct=biskit.getValue();
        		  System.out.println(bcode+"\t"+bct.getId()+"\t"+bct.getName()+"\t"+bct.getPrice());
        		 // System.out.println
        	  }
        	  System.out.println("============================================================");
          }
	}

}
