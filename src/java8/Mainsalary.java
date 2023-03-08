package java8;

import java.util.ArrayList;
import java.util.Collections;

public class Mainsalary
{
	public static void main(String args[])
	{
		ArrayList<Compsal>ne=new ArrayList<Compsal>();
		ne.add(new Compsal(25000,"Sasi","E1d"));
		ne.add(new Compsal(9000000,"kevin","222"));
		ne.add(new Compsal(55000,"vaathi","E143"));
		ne.add(new Compsal(624117,"kevin","sw322"));
		Collections.sort(ne);
		System.out.println("Salary after sorting:");
		for(Compsal salary:ne)
		{
			System.out.println(salary.getSalary()+" "+salary.getEmpid()+" "+salary.getName());
		}
	}
	
}
