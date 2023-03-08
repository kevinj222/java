package collection;
import java.util.LinkedList;
import java.util.*;

public class Linkmid
{
public static void main(String args[])
	{
	LinkedList<String>name=new LinkedList<String>();
	System.out.println("Enter the linked list");
	name.add("name");
	name.add("is");
	name.add("sasi");
	name.add("laakoor");
	name.add("Sasi");
	System.out.println(name);
	int a=name.size();
	int x=a/2;
	System.out.println(name.get(x));
	}
}
