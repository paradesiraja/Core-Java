import java.util.*;

public class Test8_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object>lhs=new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add('b');
		lhs.add(10);
		lhs.add("c");
		System.out.println(lhs);
	       
		Iterator<Object>itr=lhs.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			System.out.println(obj);
			
			System.out.println();
		
			Iterator<Object> litr=lhs.iterator();
			while(litr.hasNext()) {
				Object obj1=litr.next();
				System.out.println(obj1);
			}
			System.out.println();
		
			while(litr.hasNext()) {
				Object obj2=litr.next();
				System.out.println(obj2);
				}
		}
		
	}

	
}
