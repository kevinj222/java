package collection;
import java.util.*;

public class Setcompare
{
	public static void main(String args[])
	{
		HashSet<String>ar=new HashSet<String>();
		ar.add("String");
		ar.add("is");
		ar.add("add");
		ar.add("St");
		ar.add("are");
		ar.add("good");
		HashSet<String>ar1=new HashSet<String>();
		ar1.add("Sraing");
		ar1.add("Srai");
		ar1.add("add");
		ar1.add("Sasi");
		ar1.add("abu");
		ar.retainAll(ar1);
		System.out.println(ar);
		
	}
}
