package raja12;
import java.util.Hashtable;

public class Test7_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hashtable<Object,Object>ht=new Hashtable<>();
        Hashtable<Object,Object>ht1=new Hashtable<>();
        Hashtable<Object,Object>ht2=new Hashtable<>();
        
        System.out.println(ht.size()+" "+ht);
        ht.put("no",1);
        ht.put("name","Raja");
        ht.put("institute","NIT");
       // ht.put(null,1);
        //ht.put(1,null);
        System.out.println(ht.size()+" "+ht);
        
	}

}
