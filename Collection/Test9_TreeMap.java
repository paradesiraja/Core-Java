package raja12;
import java.util.TreeMap;
public class Test9_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeMap<Object,Object>tm=new TreeMap<>();
         TreeMap<Object,Object>tm1=new TreeMap<>();
         
        // tm.put("Name", "Raja");
         tm.put(99, 999);
        // tm.put("Course", "Java");
         //tm.put(null, "Raja");
         tm.put(998, null);
         
         System.out.println(tm.size()+" "+tm);
	}

}
