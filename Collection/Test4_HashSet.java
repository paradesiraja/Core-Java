package raja12;
import java.util.HashSet;

public class Test4_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashSet<Object> hs=new HashSet<>();
         HashSet<Object> hs2=new HashSet<>();
         HashSet<Object> hs3=new HashSet<>(10,2);
         System.out.println(hs.size()+" "+hs);
         
         hs.add("a");
         hs.add("b");
         hs.add(1);
         hs.add('b');
         hs.add(6.7);
         hs.add(null);
         hs.add('p');
         
         
         System.out.println(hs.size()+" "+hs);
	}

}
