package java8;
import java.util.ArrayList.*;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class Evenno
{
public static void main(String args[]) 
{
	
	List<Integer>ed=Arrays.asList(2,4,6,10,28);
	ed.stream().filter(t->t>0).forEach(t->System.out.println(t*t));
	System.out.println();
	}

}

