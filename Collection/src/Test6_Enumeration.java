import java.util.Enumeration;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;


public class Test6_Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object>al=new ArrayList<>();
		
		al.add("a");
		al.add(5);
		al.add('b');
		al.add(10);
		al.add("c");
		System.out.println(al);
		retreive(al);
		
		
		LinkedHashSet<Object>lhs=new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add('b');
		lhs.add(10);
		lhs.add("c");
		System.out.println(lhs);
	       retreive(lhs);
	}
static void retreive(Collection<Object> e) {
	Enumeration<Object> e1=Collections.enumeration(e);
	while( e1.hasMoreElements()) {
		System.out.println(e1.nextElement());
	}
}
	

	
		
	

          
	}


