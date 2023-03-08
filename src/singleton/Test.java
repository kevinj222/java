package singleton;

public class Test 
{ 
	public static void main(String args[])
	{
		Singleton instance1=Singleton.getInstance();
		Singleton instance2=Singleton.getInstance();
	if(instance1==instance2)
	{
		System.out.println("both Instance are same");
	}
	else
	{
		System.out.println("Both instance are different");
	}
	}

}
