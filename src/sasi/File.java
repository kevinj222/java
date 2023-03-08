package sasi;
import java.io.FileOutputStream;
public class File
{ 
	public static void main(String args[])
	{
		String a="SasiSaji";
		byte[]b=a.getBytes();
		try
		{
			FileOutputStream f=new FileOutputStream("D://abu.txt");
			f.write(b);
			System.out.println("sussess");
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
	
}
