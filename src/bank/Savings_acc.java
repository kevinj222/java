package bank;

public  class Savings_acc extends Account

{
	double minbalance=750;

	public Savings_acc(int accno, double balance, Customer custobj, double minbalance) 
	{
		super(accno, balance, custobj);
		this.minbalance = minbalance;
			}
	public boolean withdraw(double amount)
	{
	  if((balance-amount)>minbalance)
	  {
		  balance=balance-amount;
		  return true;
	  }
	  else
	  { 
		  return false;
	  }
		
	}
	
}