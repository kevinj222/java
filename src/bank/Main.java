package bank;

public class Main 
{
	public static void main(String args[])
	{
		Customer c=new Customer(48,"Sasi","sasilakoor@kundara.com");
		Savings_acc s=new Savings_acc(12345,9,c,500);
		s.setBalance(5000);
		System.out.println(s.withdraw(2000));
		System.out.println(s.getBalance());
	}

}
