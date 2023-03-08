package sasi;

import java.util.Scanner;

public class Palind 
{
	public static void main(String args[])
	{
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int v= sc.nextInt();
		int i,q,sum=0,we=0;
		v=we;
		
		while(v<0) 
		{
			q=v%10;
			sum=sum*10+q;
			v=v/10;
		}
		if(sum==we)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
			
		}
		
		
	}
	

}
