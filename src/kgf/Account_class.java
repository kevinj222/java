package kgf;

public class Account_class {
	String accountname,accountno;
	public Account_class(String accountname, String accountno, double balance) {
		super();
		this.accountname = accountname;
		this.accountno = accountno;
		this.balance = balance;
	}
	double balance;
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
