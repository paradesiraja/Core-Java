package raja;

public class StringBuffer_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*   StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1);
        
        StringBuffer sb2=new StringBuffer(50);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println(sb2);
        
        StringBuffer sb3=new StringBuffer("abc");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
        System.out.println(sb3);
        
        sb3.append("d");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
        System.out.println(sb3);
        StringBuffer sb4=new StringBuffer(sb3);
        System.out.println(sb4.capacity());
        System.out.println(sb4.length());
        System.out.println(sb4);
        
        //StringBuffer sb5=new StringBuffer(-5);
      //  System.out.println(sb5.capacity());
        //System.out.println(sb5.length());
        //System.out.println(sb5);
        
        StringBuffer sb5=new StringBuffer(0);
        //StringBuffer sb5=new StringBuffer(null);
       // StringBuffer sb5=new StringBuffer("null");
       // StringBuffer sb5=new StringBuffer((String)null);
        System.out.println(sb5.capacity());
        System.out.println(sb5.length());
        System.out.println(sb5);
        StringBuffer sb7=null;
      //  StringBuffer sb8=gh;
        //StringBuffer sb9="null";
        System.out.println(sb7);
        
        //String Growable 
        // Formula 1#
        StringBuffer sb10=new StringBuffer(3);
        System.out.println(sb10.capacity());
        System.out.println(sb10.length());
        System.out.println(sb10);
        
        sb10.append("a");
        sb10.append("b");
        sb10.append("c");
        sb10.append("d");
        sb10.append("efgh");
        sb10.append("efghi");
        System.out.println(sb10.capacity());
        System.out.println(sb10.length());
        System.out.println(sb10);
        
        // formula 2#: new cap=len
        StringBuffer sb11=new StringBuffer(3);
        //sb11.append("abc");
       // sb11.append("abcd");
        sb11.append("abcdefghij");
        
        System.out.println(sb11.capacity());
        System.out.println(sb11.length());
        System.out.println(sb11);
        
        StringBuffer sb12=new StringBuffer();
        sb12.append("a");
        sb12.append(10);
        System.out.println(sb12.capacity());
        System.out.println(sb12.length());
        System.out.println(sb12);
        
        Pqr p1=new Pqr();
        sb12.append(p1);
        System.out.println(sb12.capacity());
        System.out.println(sb12.length());
        System.out.println(sb12);
        
       StringBuffer sb13=new StringBuffer();
       for(int i=0;i<=20;i++) {
    	   sb13.append(i);
    	   
       }
       System.out.println(sb13.capacity());
       System.out.println(sb13.length());
       System.out.println(sb13+" ");   */
       
       
       //Insert Method
       
       StringBuffer sb1=new StringBuffer("acef");
       System.out.println(sb1);
       sb1.insert(1, 'b');
       System.out.println(sb1);
       sb1.insert(3, 'd');
       System.out.println(sb1);
       sb1.insert(sb1.length()-1, 'g');
       System.out.println(sb1);
       sb1.insert(sb1.length(), 'h');
       System.out.println(sb1);
       
      // sb1.insert(sb1.length()+1, 'i');
     //  sb1.insert(5, null);
       sb1.insert(5, (String)null);
      // sb1.insert(5, (char)null);
      // sb1.insert(35, 'b');
      // sb1.insert(-5, 'b');
       sb1.insert(0, 'b');
       System.out.println(sb1);
       System.out.println();
       StringBuffer sb2=new StringBuffer(2);
      // sb2.append(sb2);
       System.out.println(sb2.capacity());
       System.out.println(sb2.length());
       System.out.println(sb2);
      sb2.insert(0,'a');
       //sb2.insert(1,'b');
       sb2.insert(1,"123");
       sb2.insert(1,"123465699708089");
       
       
       System.out.println(sb2.capacity());
       System.out.println(sb2.length());
       System.out.println(sb2);
       System.out.println();
       
       
       StringBuffer sb3=new StringBuffer("abc abc cbc");
       System.out.println(sb3);
       System.out.println(sb3.capacity());
       System.out.println(sb3.length());
       sb3.setCharAt(5, 'B');
       sb3.setCharAt(sb3.length()-1, 'y');
      // sb3.setCharAt(sb3.length(), 'Z');
       sb3.replace(2,5, "XYZ");
       System.out.println(sb3);
       sb3.replace(2,7, "PQR");
       System.out.println(sb3);
       sb3.replace(2, 4, "MNOP");
       System.out.println(sb3);
       
       System.out.println();
       
       //Delete Method
       
       StringBuffer sb4=new StringBuffer("Ameerpet Hari Krishna");
       System.out.println(sb4);
       
       sb4.delete(5, 13);
       System.out.println(sb4);
       sb4.deleteCharAt(5);
       System.out.println(sb4);
       System.out.println();
       
       StringBuffer sb5=new StringBuffer("abcdef");
       sb5.deleteCharAt(1);
       sb5.deleteCharAt(2);
       System.out.println(sb5);
       
       //Reverse Method
       StringBuffer sb6=new StringBuffer("abcdef");
       
       
       sb6.reverse();
       System.out.println(sb6);
       
       
       
       
       
       
       
	}

}
