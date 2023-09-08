import java.util.*;
public class Test11_SreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Object>al=new ArrayList<>();
		
		al.add("a");
		al.add(5);
		al.add('b');
		al.add(10);
		al.add("c");
		System.out.println(al);
		System.out.println();
		
		for(Object obj:al) {      //displaying all elements in al
			System.out.println(obj);
		}
		System.out.println();
		
		for(Object obj:al) {
			if (obj instanceof Integer i) 
				if(i%2==0) 
					System.out.println(obj);
				}
			
		
		System.out.println();
		
		for(Object obj:al) {
			if(obj instanceof String s)
				System.out.println(s.toUpperCase());
			//System.out.println(s.toLowerCase());
		}
		
	System.out.println();
	
	//print all elements in al using Sream method().
	al.stream().forEach(System.out::println);
	
	al.stream()
	.forEach(System.out::println);
	
	System.out.println();
	
	al.stream()       //all ele
	.filter(ele->ele instanceof String)   //only string 
	.forEach(System.out::println);        //display the string
	
	System.out.println();
	
	al.stream()
	.filter(ele->ele instanceof Integer)
	.filter(ele->((int) ele)%2==0)
	.forEach(System.out::print);
	}
}
