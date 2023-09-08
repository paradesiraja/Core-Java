package raja12;
import java.util.LinkedList;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<Object> v1=new LinkedList<>();
        LinkedList<Object> v2=new LinkedList<>();
        LinkedList<Object> v3=new LinkedList<>();
        
        System.out.println(v1.size()+" "+v1);
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        
        v1.remove(4);
       
        System.out.println(v1.size()+" "+v1);
        
        
	}

}
