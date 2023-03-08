package kgf;

public class Current extends Account_class implements Maincharge
{
  public Current(String accountname, String accountno, double balance)
  {
		super(accountname, accountno, balance);
	}
  public float calcmaincharge(float noy)
  {
float x ;
  x=(100*noy)+200;
  return x;
}
}
