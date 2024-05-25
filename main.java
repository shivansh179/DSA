import java.util.*;
public class main
{
	public static void main (String[] args) {
        
	   TreeSet<Integer> s = new TreeSet<>();
	   
	   s.add(999);
	   for(int element:s){
	       System.out.println(element);
	   }

       s.add(3434);

       s.remove(999);

       System.err.println(s);

       s.add(8989);
       s.add(22);
       s.add(11);
       s.add(45);

       System.err.println(s.higher(11));
       System.err.println(s.lower(11));
	}
}