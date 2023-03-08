package kgf;

public class Savings extends Account_class implements Maincharge
{
	  public Savings(String accountname, String accountno, double balance) {
		super(accountname, accountno, balance);
	}

	  public float calcmaincharge(float noy)
	  {
	float x;
	  x=(100*noy)+200;
	  return x;
	}

}
