package raja12;
import java.util.HashMap;

public class Test7_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<Object,Object>hs=new HashMap<>();
         HashMap<Object,Object>hs1=new HashMap<>();
         HashMap<Object,Object>hs2=new HashMap<>();
         
         hs.put("name", "Raja");
         hs.put("no", 11);
         hs.put("Course", "Java");
         hs.put(null, "Raja");
         hs.put(1,null);
         
         System.out.println(hs.size()+" "+hs);
         
         
	}

}
