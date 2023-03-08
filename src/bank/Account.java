package bank;

public abstract class Account {
	protected int accno;
	public Account(int accno, double balance, Customer custobj) {
		super();
		this.accno = accno;
		this.balance = balance;
		this.custobj = custobj;
	}
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustobj() {
		return custobj;
	}

	public void setCustobj(Customer custobj) {
		this.custobj = custobj;
	}
	protected double balance;
	protected Customer custobj;
	
	public abstract boolean withdraw(double amount);
}
