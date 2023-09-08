import java.util.*;
public class Test9_ForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       ArrayList<Object>al=new ArrayList<>();
		
		al.add("a");
		al.add(5);
		al.add('b');
		al.add(10);
		al.add("c");
		System.out.println(al);
		
		
		
		Iterator<Object>itr=al.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
		     System.out.println(obj);	
		     
		}
		System.out.println();
		for(Object obj:al) {
			System.out.println(obj);
		}
		System.out.println();
		for(Object obj:al) {
			if(obj instanceof String s) 
				System.out.println(s.toUpperCase());
			}
		}
	}


