package hashmap;

import java.util.HashMap;

public class Hashempclass
{ 
	int age;
	String name,dept;
	public Hashempclass(int age,String name,String dept) {
		this.age=age;
		this.dept=dept;
		this.name=name;
	}
	public static void main(String args[])
	{
		Hashempclass e1= new Hashempclass(22,"abu","dev");
		Hashempclass e2= new Hashempclass(22,"Sasi","dev");
		Hashempclass e5= new Hashempclass(22,"Saji","dev");
		HashMap<Integer,Hashempclass>mapx= new HashMap<Integer,Hashempclass>();
		mapx.put(245,e1);
		mapx.put(248, e5);
		mapx.put(250, e2);
		System.out.println(mapx);
		
		
		
	}
	

}
