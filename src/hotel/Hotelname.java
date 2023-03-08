package hotel;

public class Hotelname 
{
 String hname,city;
 int cash;
 public Hotelname(String hname,int cash,String city)
 {
	 super();
	 this.hname=hname;
	 this.cash=cash;
	 this.city=city;
 }
@Override
public String toString() {
	return "Hotelname [hname=" + hname + ", city=" + city + ", cash=" + cash + "]";
}
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getCash() {
	return cash;
}
public void setCash(int cash) {
	this.cash = cash;
}
 
 
}
