import java.util.TreeSet;
public class Test3_Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           TreeSet<Object>ts=new TreeSet<>();
           TreeSet<Object>ts2=new TreeSet<>();
           
          /* ts.add("b");
           ts.add("c");
           ts.add("a");
           System.out.println(ts);*/
           
           ts.add(1);
           ts.add(3);
           ts.add(2);
           //.add(1);
           System.out.println(ts);
           ts2.add(1);
           ts2.add(3);
           ts2.add(2);
           //.add(1);
           System.out.println(ts2);
           System.out.println(ts.descendingIterator());
           System.out.println(ts.hashCode());
           ts.comparator();
           System.out.println(ts);
           
           
           /*ts.add(new B(1));
           ts.add(new B(2));
           ts.add(new B(3));
           System.out.println(ts);*/
           
           
           
	}

}
