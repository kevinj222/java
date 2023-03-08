package java8;
import java.lang.Math;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square
{
public static void main(String args[]) 
{
	
	List<Integer> ed=Arrays.asList(2,4,6,10,28);
	
 ed.stream().filter(t->t>0).forEach(t->System.out.println(t*t));
			System.out.println(ed);
	}
}
