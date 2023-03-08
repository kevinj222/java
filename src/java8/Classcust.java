package java8;

public class Classcust 
{
int regid;
String phn,name,email,location;
public Classcust(int regid,  String phn, String name, String email, String location) {
	super();
	this.regid = regid;
	this.phn = phn;
	this.name = name;
	this.email = email;
	this.location = location;
}
public int getRegid() {
	return regid;
}
public void setRegid(int regid) {
	this.regid = regid;
}
public String getPhn() {
	return phn;
}
@Override
public String toString() {
	return "Classcust [regid=" + regid + ", phn=" + phn + ", name=" + name + ", email=" + email + ", location="
			+ location + "]";
}
public void setPhn(String phn) {
	this.phn = phn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
