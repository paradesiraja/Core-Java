package raja12;
import java.util.LinkedHashMap;
public class Test8_LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedHashMap<Object,Object>lhm=new LinkedHashMap<>();
        LinkedHashMap<Object,Object>lhm1=new LinkedHashMap<>();
        
        lhm.put("no", 1234);
        lhm.put("name", "Raja");
        lhm.put("Course", "Java");
        lhm.put(null, 1234);
        lhm.put("hi", null);
        
        System.out.println(lhm.size()+" "+lhm);
        
        
        
	}

}
