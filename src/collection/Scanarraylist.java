package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Scanarraylist 
{
	public static void main(String args[])
	{
		System.out.println("Enter the size of list:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter the elements");
		ArrayList<String>word=new ArrayList<String>();
		for(int i=0;i<a;i++)
		{
			String name=sc.next();
			word.add(name);
		}
		System.out.println(word);
}
}
