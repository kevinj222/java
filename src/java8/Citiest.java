package java8;

import java.util.Arrays;
import java.util.List;

public class Citiest 
{
	public static void main(String args[])
	{
		List<String>list=Arrays.asList("thiruvalla","Thrissur","Kochi","alpzha");
		List<String>city=list.stream().filter(t->(t.startsWith("t")||t.startsWith("T"))).toList();
		System.out.println(city);
	}


}
