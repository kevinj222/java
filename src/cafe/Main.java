package cafe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu m1 = new Menu("veg meals",80,1);
		Menu m2 = new Menu("fish curry meals",120,2);
		Menu m3 = new Menu("chapathi veg curry",40,3);
		Menu m4 = new Menu("chapathi chicken curry",120,4);
		Menu m5= new Menu("veg fried rice",60,5);
		Menu m6 = new Menu("chicken fried rice",150,6);
		
		List<Menu> mx = Arrays.asList(m1,m2,m3,m4,m5,m6);
		//ls.forEach(t->System.out.println(t));
		
		Scanner n = new Scanner(System.in);
		//String nme;
		Customer c = new Customer(0,null);
		System.out.println("Enter Details : \n\n");
		System.out.println("Enter name : ");
		c.setName(n.next());
		System.out.println("\nEnter uid : ");
		c.setUID(n.nextInt());
		List<Customer> em = Arrays.asList(c);
		em.forEach(t->System.out.println(t));
		int ans,ch;
		do {
		System.out.println("\nFood Details\n\n");
		ls.forEach(t->System.out.println(t.getId()+" "+t.getFoodname()+" "+t.getPrice()+"\n"));
		System.out.println("Choose your choice : \n");
		ch = n.nextInt();
		System.out.println("\nDo you want to change ? 0 for yes 1 for no (0/1)");
		ans = n.nextInt();
		}while(ans==0);
		int a = ch;
		List<lsst> lss = ls.stream().filter(t->t.getId()==a).toList();
		System.out.println("\nThe Details are : \n");
		em.forEach(t->System.out.println("UID: "+t.getUid()+"\n"+"Name : "+t.getName()));
		lss.forEach(t->System.out.println("Food Name : "+t.getFoodname()+"\n"+"Food Price : "+t.getPrice()));
		n.close();
		}

}
