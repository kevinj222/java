package java8;

public class Product 
{ 
	String pname;
	int pid,pprice;
	public Product(String pname,int pprice,int pid)
	{
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pid=" + pid + ", pprice=" + pprice + "]";
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

}
