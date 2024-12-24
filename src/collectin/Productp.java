package collectin;

public class Productp {
 private int id;
 private String pname;
 private int price;
 private int qty;
 private String category;
 public Productp(int id,String name,int price,int qty , String ctgy )
 {
	 this.id=id;
	 this.pname=name;
	 this.price=price;
	 this.qty=qty;
	 this.category=ctgy;
 }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
}
