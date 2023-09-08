import java.util.*;

public class Test10_ForEach_lambda_Exprewssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Object>al=new ArrayList<>();
		
		al.add("a");
		al.add(5);
		al.add('b');
		al.add(10);
		al.add("c");
		System.out.println(al);
		
		al.forEach(obj->System.out.println(obj));
		al.forEach(obj->System.out.println(obj));
		
		System.out.println();
		
		al.forEach(obj->{
			if(obj instanceof String s) {
				System.out.println(s.toUpperCase());
			}
				
		});
		System.out.println();
		
		al.forEach(obj->{
			if(obj instanceof String s) {
				System.out.println(s.hashCode());
			}
		});
	}
	

}
