package raja12;
import java.util.Stack;

public class Test_Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Object> v1=new Stack<>();
        Stack<Object> v2=new Stack<>();
        //Stack<Object> v1=new Stack<>();
        
        System.out.println(v1.capacity()+" "+v1.size()+" "+v1);
        
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        v1.add(7);
        v1.add(8);
        v1.add(9);
        v1.add(10);
        v1.add(11);
        
        //System.out.println(v1.remove(1));
        
        System.out.println(v1.capacity()+" "+v1.size()+" "+v1);
       System.out.println(v1.get(9));
	}

}
