package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Regret
{
    public static void main(String args[])
    {
	Classcust c1= new Classcust(285,"9734332700","Ronaldo","sadgasfd@gmail.com","Portgal");
	Classcust c2= new Classcust(2411,"9734562700","Messi","Messi@gmail.com","Arg");
	Classcust c3= new Classcust(6145,"9734232700","Neymar","Neymar@gmail.com","brazil");
	Classcust c4= new Classcust(235,"9734743700","Modric","Modric@gmail.com","Croatia");
	Classcust c5= new Classcust(245,"974562700","Chetri","Chetri@gmail.com","india");
	List<Classcust>se=Arrays.asList(c1,c2,c3,c4,c5);
	System.out.println("Enter the register njmnber:");
	Scanner sc= new Scanner(System.in);
	int v=sc.nextInt();
	List<Classcust>custid=se.stream().peek(t->{if(v==t.getRegid()) {System.out.println(t);}}).toList();
    
    }
}
