import java.util.HashMap;
import java.util.Map;
public class Test2_HashMap {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Object,Object>hmp=new HashMap<>();
        //adding
        hmp.put("a", 1);
        hmp.put("b", 2);
        hmp.put("a", 3);
        hmp.put(98, 4);
        hmp.put(null,null);
        hmp.put(null,1);
        hmp.put(null,null);
        hmp.put(1,null);
        hmp.put('a',1);
       
        
        
        System.out.println(hmp);
        //Removing
        //System.out.println(hmp.remove("a"));
       // System.out.println(hmp.remove(null));
        //System.out.println(hmp.remove('a'));
        //System.out.println(hmp.remove(1));
//get method        
        //System.out.println(hmp.get("a"));
        
        //Remove
      //hmp.remove("a");     
        
       // hmp.clear();
        //hmp.clone();
        
        //replace
        hmp.replace("a",100);
           System.out.println(hmp);
           
           
	}

}
