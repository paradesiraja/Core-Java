package raja12;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Object> v1=new ArrayList<>();
       ArrayList<Object> v2=new ArrayList<>(5);
       ArrayList<Object> v3=new ArrayList<>(10);
       
       System.out.println(v1.size()+" "+v1);
       v1.add(1);
       v1.add("");
       v1.add(2);
       v1.add(2);
       v1.add(2);
       v1.remove(2);
       v1.lastIndexOf(0);
      
       System.out.println(v1.size()+" "+v1);

	}

}
