package collectin;

public class Birds  {
 private int id;
 private String name;
 private String features;
 
 public Birds(int id,String name,String features)
 {
	 this.id=id;
	 this.name=name;
	 this.features=features;
 }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFeatures() {
	return features;
}

public void setFeatures(String features) {
	this.features = features;
}
 

}
