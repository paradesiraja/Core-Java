import java .util.ArrayList;
public class Test5_RetreivingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> al=new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add('b');
		al.add(10);
		al.add("c");
		System.out.println(al);
		
		System.out.println();

		Object obj=al.get(0);
		Object obj1=al.get(1);
		Object obj3=al.get(3);
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj3);
		
		
		
	}

}
