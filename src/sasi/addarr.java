package sasi;

import java.util.Arrays;

public class addarr {
	public static void main(String args[])
	{
	int l;
	int ar[]= {5,3,8,1,7,2};
	 l=ar.length;
	 int count=0;
	 for(int i=0;i<l;i++)
	 {		 
		 if(ar[i]>count)
		 {
			 count=ar[i];	
		 }
	 } System.out.println(count);
	  System.out.println(Arrays.toString(ar));
	}
}
