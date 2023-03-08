package hashmap;

import java.util.HashMap;

public class Hash1
{
	public static void main(String args[])
	{
		HashMap<String,Integer>mapx= new HashMap<String,Integer>();
		mapx.put("raj", 40);
		mapx.put("abu", 9);
		mapx.put("sasi",9);
		mapx.put("doc",25) ;
		System.out.println(mapx);
		boolean x=mapx.containsKey("raj");
		System.out.println(x);
		mapx.remove("sasi");
		System.out.println(mapx);
	}
}
