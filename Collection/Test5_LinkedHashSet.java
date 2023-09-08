package raja12;
import java.util.LinkedHashSet;

public class Test5_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          LinkedHashSet<Object>lhs=new LinkedHashSet<>();
          LinkedHashSet<Object>lhs2=new LinkedHashSet<>();
          LinkedHashSet<Object>lhs3=new LinkedHashSet<>();
          
          lhs.add(1);
          lhs.add("b");
          lhs.add("c");
          lhs.add(1);
          lhs.add(null);
          lhs.add('a');
          lhs.add(6.7);
          
          
          System.out.println(lhs);
          
	}

}
