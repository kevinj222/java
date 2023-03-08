package sasi;

public class Negpos 
{
	public static void main(String args[])
	{
		int a[]= {4,-4,6,8,-9,0,4,-7,56};
		int l=a.length;
		int odd=0,even=0;
		for(int i=0;i<l;i++)
		{
			if(a[i]>0)
			{
				++odd;
			}
		else
			if(a[i]<0)
			{
					++even;
					
			}
		}
		System.out.println(odd);
		System.out.println(even);
	
			}
		}

