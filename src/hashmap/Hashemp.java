package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Hashemp 
{
public static void main(String args[])
{
	HashMap<Integer,List<String>>mapx=new HashMap<Integer,List<String>>();
	ArrayList<String>am=new ArrayList<String>();
	am.add("Sasi");
	am.add(".9");
	am.add("Vazha");
	mapx.put(245000,am);
	ArrayList<String>am1=new ArrayList<String>();
	am1.add("abu");
	am1.add("9");
	am1.add("Air");
	mapx.put(245111,am1);
	ArrayList<String>am2=new ArrayList<String>();
	am2.add("Saji");
	am2.add("99");
	am2.add("Soman");
	mapx.put(245222,am2);
	 for(Entry<Integer,List<String>> m : mapx.entrySet())
	 {    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	
	System.out.println(mapx.get(245000));
	System.out.println(mapx.remove(245111));
	
	 for(Entry<Integer,List<String>> m : mapx.entrySet())
	 {    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   } 
}
}
