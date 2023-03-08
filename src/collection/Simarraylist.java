package collection;
import java.util.ArrayList;

public class Simarraylist
{
public static void main(String args[])
	{
		ArrayList<String>word=new ArrayList<String>();
		System.out.println("The elements");
		word.add("was");
		word.add("is");
		word.add("for");
		word.add("who");
		word.add("where");
		word.add(1,"will");
		System.out.println(word);
		word.remove(4);
		System.out.println(word);
		for(String gram:word)
		{
			System.out.println(gram);
		}
	}
}
