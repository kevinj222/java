package sasi;

import java.util.Scanner;

public class luckyno {
	public static void main(String args[])
	{
		System.out.println("Enter your number:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		String s= Integer.toString(x);
		char ch[]=s.toCharArray();
		int l=ch.length;
		int count=0;
		for(int i=0;i<4;i++)
		{
			if((ch[i]=='3')&&(ch[i]=='6')&&(ch[i]=='9'))
			{
				++count;
			}
		}
		if(count==4)
		{
			System.out.println("It is a lucky number");
		}
		else
		{
			System.out.println("It is a Not a Lucky number");
		}
	}
}
