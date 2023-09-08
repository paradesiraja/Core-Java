import java.util.ArrayList;
import java.util.Collection;

public class Test1_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Object>al=new ArrayList<>();
         System.out.println(al.size());
         //Adding
         
         al.add("a");
         al.add("b");
         al.add(5 );
         al.add(6.7);
         al.add('p');
         al.add(true);
         al.add(null);
         al.add(2);
         al.add("a");
         al.add(5);
         al.add(6.7);
         al.add(true);
         al.add(null);
         
        //Counting  //printing
         System.out.println(al.size()+" "+al);
         System.out.println();
         //Searching
         
         System.out.println(al.contains("a"));
         System.out.println(al.contains(10));
         System.out.println(al.contains(null));
         
         
         
         System.out.println(al);
         
         
         //Retrieving
         
         System.out.println(al.get(0));
         System.out.println(al.get(10));
         System.out.println(al.get(1));
         Object obj = al;
		if(obj instanceof String s1) {
        	 System.out.println(s1.toUpperCase());
         }
         
         System.out.println(al);
         
        // Removing
         System.out.println(al.remove("a"));
         System.out.println(al.remove("0"));
         System.out.println(al.remove("5"));
        System.out.println(al.remove((Integer)(5)));
        System.out.println(al.remove(6.7));
        System.out.println(al.remove(6.7));
        System.out.println(al.remove(true));
        System.out.println(al.remove(null));
        System.out.println(al.remove((Character)('p')));
         
         System.out.println(al);
         System.out.println();
         
         
         al.removeIf(ele->ele instanceof String);
         System.out.println(al);
         
         ArrayList<Object>al2=new ArrayList<>();
         System.out.println(al.size());
         //Adding
         System.out.println(al);
         
         al.add("a");
         al.add("b");
         al.add(5 );
         al.add(6.7);
         al.add('p');
         al.add(true);
         al.add(null);
         al.add(2);
         al.removeAll(al2);
         
         
         
         //Inserting
         
         
         al.add(2,"raja");
         System.out.println(al);
         
         al.add(3,null);
         System.out.println(al);
         
         
         //9: sorting 
 		//(Rule: for sorting collection must contain homogeneous comparable objects)
 		ArrayList<String> al5 = new ArrayList<>();
 		al5.add("a");
 		al5.add("c");
 		al5.add("b");
 		al5.add("d");
 		al5.add("e");
 		al5.add("f");
 		al5.add(1,"b");
 		
 		System.out.println(al5);

 		//Java 1.2v
 		//Collections.sort(al5);
 		
 		//Java 8v
 		al5.sort(null);
 		System.out.println(al5);
 		
 		
 		
 		//replacing
 		
 		al.set(1,"2");
 		al.set(al.indexOf(2),"10");
 		al.set(1,"2");
 		System.out.println(al);
 		
 	//}
         
         
         
         
	}
	

	

}
