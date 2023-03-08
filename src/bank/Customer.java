package bank;

public class Customer {
	int custId;
	public Customer(int custId, String custname, String emailId) {
		super();
		this.custId = custId;
		this.custname = custname;
		this.emailId = emailId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	String custname,emailId;
}
