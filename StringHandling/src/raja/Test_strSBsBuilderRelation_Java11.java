package raja;

import java.util.TreeSet;

public class Test_strSBsBuilderRelation_Java11 {

	public static void main(String[] args) {
		TreeSet<String> ts1=new TreeSet<>();
		ts1.add("a");
		ts1.add("b");
		ts1.add("c");
		System.out.println(ts1);
		System.out.println();
		
		TreeSet<StringBuffer> ts2=new TreeSet<>();
		ts2.add(new StringBuffer("a"));
		ts2.add(new StringBuffer("b"));
		ts2.add(new StringBuffer("c"));
		System.out.println(ts2);
		System.out.println();
		
		TreeSet<StringBuilder> ts3=new TreeSet<>();
		ts3.add(new StringBuilder("a"));
		ts3.add(new StringBuilder("b"));
		ts3.add(new StringBuilder("c"));
		System.out.println(ts3);
		System.out.println();
		
	
		String a=ts2.toString();
		String b=ts3.toString();
	a.compareTo(b);
		System.out.println(a);
		System.out.println();
	
		
		
		
 		
		
		
		
		
		
		
		
		
		
		
		

}
}