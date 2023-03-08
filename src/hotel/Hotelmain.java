package hotel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Hotelmain 
{ 
	public static void main(String[] args)
	{
		Hotelname h1=new Hotelname("Zamzam",2500,"Trivandrum");
		Hotelname h2=new Hotelname("Paata",500,"kazhakuttam");
		Hotelname h3=new Hotelname("Abu stay",1500,"kazhakuttam");
		Hotelname h4=new Hotelname("Sasi Ground",100,"Lakoor");
		Hotelname h5=new Hotelname("Saji stay",25000,"Trivandrum");
		
		List<Hotelname> list=Arrays.asList(h1,h2,h3,h4,h5);
		System.out.println("Enter mininmum range:");
		Scanner sc= new Scanner(System.in);
		int min=sc.nextInt();
		System.out.println("Enter maximium range:");
		int max=sc.nextInt();
		
		List<Hotelname> hotellist=list.stream().filter(k->((k.getCash()>=min)&&(k.getCash()<=max)))
				.sorted(Comparator.comparing(Hotelname::getCash)).toList();
	System.out.println(hotellist);
	
	}

}
