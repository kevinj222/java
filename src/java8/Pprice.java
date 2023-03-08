package java8;

import java.util.Arrays;
import java.util.List;

public class Pprice 
{
public static void main(String args[])
{
	Product p1=new Product("Laptop",72000,7);
	Product p2=new Product("modile",20000,3);
	Product p4=new Product("Laptop",7000,5);
	Product p3=new Product("tv",2,19000);
	List<Product>p=Arrays.asList(p1,p2,p3,p4);
	List<Product>ex=p.stream().filter(t->(t.getPprice()>=20000)).toList();
	System.out.println(ex);
}
}
