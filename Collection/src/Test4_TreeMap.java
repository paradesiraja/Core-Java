import java.util.TreeMap;
public class Test4_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeMap<Object,Object>tm1=new TreeMap<>();
      TreeMap<Object,Object>tm=new TreeMap<>();
      
      tm.put("a", 1);
      tm.put("c", 2);
      tm.put("b", 3);
      System.out.println(tm);
      tm1.put("a", 1);
      tm1.put("c", 2);
      tm1.put("b", 3);
      System.out.println(tm1);
      
      tm.remove("b");
      System.out.println(tm);
      
      tm.remove("a");
      System.out.println(tm);
      
      //System.out.println(tm.replace("c",));
      System.out.println(tm);
      System.out.println(tm1.comparator());
	}

}
