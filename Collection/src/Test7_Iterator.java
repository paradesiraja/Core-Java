import java.util.*;
public class Test7_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object>lhs=new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add('b');
		lhs.add(10);
		lhs.add("c");
		System.out.println(lhs);
	       //retreive(lhs);
		retrRemV(lhs);
	}

	/*private static void retreive(Collection<Object> e) {
		// TODO Auto-generated method stub
		Iterator<Object> itr=e.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	 */
	private static void retrRemV(Collection<Object> e2) {
		Iterator<Object>itr1=e2.iterator();
		while(itr1.hasNext()) {
			Object obj=itr1.next();
			System.out.println(obj);
			if(obj instanceof String) {
				itr1.remove();
				//System.out.println();
			}
				
		}
		
	}

}
