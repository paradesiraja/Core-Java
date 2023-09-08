package raja;
import java.lang.*;
import java.util.Scanner;

public class String_Operations  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /* String s1="";
      String s2=" ";
      String s3="a";
      String s4=null;
      
      
      System.out.println(s1.isEmpty());   //1.6
      System.out.println(s3.isEmpty());   //1.6
      System.out.println(s2.isEmpty());   //1.6
    //  System.out.println(s4.isEmpty());   //1.6
      System.out.println(s1.isBlank());    
      System.out.println(s2.isBlank());
      System.out.println(s3.isBlank());
     // System.out.println(s4.isBlank());
      
      String s5=new String("");
      String s6=new String(" ");
      String s7=new String("a");
      
      System.out.println(s5.isEmpty());
      System.out.println(s6.isEmpty());
      System.out.println(s7.isEmpty());
      
      System.out.println();
      
      System.out.println(s5.isBlank());
      System.out.println(s6.isBlank());
      System.out.println(s7.isBlank());
      
      System.out.println(s1.trim().isEmpty());//up to 10th version
      System.out.println(s2.isBlank());//from 11 th version
      
      //public in length
      
      
      System.out.println(s1.length());
      System.out.println(s2.length());
      System.out.println(s3.length());
    //  System.out.println(s4.length());
      
      String[]s8= {"a","b","c"};
      System.out.println(s8.length);
    //  System.out.println(s8.length());
      
      String s9="abc";
      System.out.println(s9.length());
      //System.out.println(s9.length);
      
      Example e=new Example(5);
      System.out.println(e);
      
      System.out.println(s9.toString());
      System.out.println(e.toString());
      
      String s10;
      //System.out.println(s10.isEmpty());
      //System.out.println(s10.isBlank());
      //System.out.println(s10.length());
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Text");
      String s11=sc.nextLine();
      
      System.out.println(s11.isEmpty());
      System.out.println(s11.isBlank());
      System.out.println(s11.length());
      System.out.println();
      
      
      String s12="hari";
      System.out.println(s12=="Hari");
      System.out.println(s12!="Hari");
      System.out.println();
      System.out.println(s12.equals("hari"));
      System.out.println(s12.equals("Hari"));
      
      System.out.println();
      
      
      String s13=new String("hari");
      System.out.println(s13=="hari");
      System.out.println(s13!=s12);
      System.out.println(s12=="Hari");
      System.out.println(s12.equals("hari"));
      System.out.println(s12.equals("Hari"));
      System.out.println(s12.equalsIgnoreCase("Hari"));
      
      
      System.out.println();
      
      
      
      
      String s14="a";
      String s15="a";
      System.out.println("s14==s15"+s14==s15);
      
      StringBuffer s16=new StringBuffer("a");
      StringBuilder s17=new StringBuilder("A");
      System.out.println(s16.equals(s17));
      System.out.println(s16.equals(s17));
      
      System.out.println(s14.equals(s17.toString()));
      System.out.println(s14.equalsIgnoreCase(s17.toString()));
      
      String s18="abc";
      String s19="bbc";
      System.out.println(s18.equals(s19));
      
      System.out.println();
      
      
      String s20=new String("abc");
      String s21=new String("abc");
      
      //here its camparing Reference number only,not String Object
      System.out.println(s20==s21);
     
      //here comparing String Object,not reference number~
      System.out.println(s20.equals(s21));
      
      //Comparing string Laxicographigally.
                          //means its checks the ASCI numbers only
      
      String s22="abc";
      String s23="bbc";
      String s24="bBc";
      String s25="bbcdd";
      
      
      System.out.println(s22.compareTo(s23));
      System.out.println(s23.compareTo(s24));
      System.out.println(s22.compareTo(s24));
      System.out.println(s22.compareTo(s25));
      System.out.println();
      
      
      String s26="Java Object-oriented Program ming Lanaguage";
      
      System.out.println(s26.equals("Java Object-oriented Program ming Lanaguage"));
      System.out.println(s26.equals("Java"));
      System.out.println(s26.compareTo("Java"));
      System.out.println(s26.contains("Program"));
      System.out.println(s26.contains("JAVA"));
   //   System.out.println(s26.containsIgnoreCase("java"));
        System.out.println(s26.toLowerCase().contains("java"));
        System.out.println(s26.indexOf("J"));
        System.out.println(s26.indexOf("a",5));
        System.out.println(s26.indexOf("v",-5));
        System.out.println(s26.lastIndexOf("a"));
        System.out.println(s26.lastIndexOf("A"));
        System.out.println(s26.lastIndexOf("e",43));
        System.out.println(s26.lastIndexOf("a",1));
        
        
        
        System.out.println();
        
        
        if(s26.contains("Java")) {
        	System.out.println("Available");
        }else {
        		System.out.println("Not available");
        	}*/
        
    /*    String s28="hari krishna";
        System.out.println(s28.length());
        System.out.println(s28.charAt(0));
        System.out.println(s28.charAt(11));
      //  System.out.println(s28.charAt(-5));
       // System.out.println(s28.charAt(12));
        System.out.println();
        
        
       // for(int i=0;i<s28.length();i++) {
        	//for(int i=0;i<s28.length()-1;i++) {
        		//for(int i=0;i<=s28.length();i++) {
        			for(int i=0;i<=s28.length()-1;i++) {
        	System.out.print(s28.charAt(i));
        }
        			
        			
        			
        			System.out.println();
        			
        			
        			
        			//for(char ch:s28) {
        				//System.out.println(ch);
        			
        			
        			System.out.println(s28.substring(5));
        			System.out.println(s28.substring(0,12));
        			System.out.println(s28.substring(0,0));
        			//System.out.println(s28.substring(-5,0));
        			//System.out.println(s28.substring(1,-10));
        			System.out.println(s28.substring(5,5).equals(""));
        			System.out.println(s28.substring(5,5).isEmpty());
        			System.out.println(s28.substring(5,5).isBlank());
        Scanner sc=new Scanner(System.in);
           System.out.println("Enter a String"); 
           String s1=sc.nextLine();
           String s2=s1.toLowerCase();
           
           if(s1.contains("hari")) {
        	   int start=s1.indexOf("hari");
        	   int end=start+4;
        	   String hari=s1.substring(start, end);
        	   System.out.println(hari + "is available");
        	   
           }  
           
           String s31="hari;balayya;pavankalyan";
           String[] sa1=s31.split(";");
           
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           System.out.println();
           
           sa1=s31.split("h");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           
           sa1=s31.split("a");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("y");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           
           s31="abc abc abc";
           sa1=s31.split("a");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("c");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split(" ");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("b");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           System.out.println();
           
           s31="aaaaaaa";
           sa1=s31.split("a");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("b");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));  
           
           System.out.println();
           
           s31="aaaaaaaab";
           sa1=s31.split("a");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           sa1=s31.split("b");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           System.out.println();
           
           s31="abc.txt";
           sa1=s31.split("a");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("b");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split(".");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           sa1=s31.split("");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split(" ");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("t");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           System.out.println();
           
           s31="a1d2c3e4";
           sa1=s31.split("a");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("[1-9]");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("[a-z]");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("[123]");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
           
           sa1=s31.split("[abc]");
           System.out.println(sa1.length);
           System.out.println(java.util.Arrays.toString(sa1));
		
		String a1="How Are You?";
		String[] sa1=a1.split(" ");
		System.out.println(java.util.Arrays.toString(sa1));
		int i;
         for(i=sa1.length-1; ;--i) {
        	 
        	 System.out.print(sa1[i]);
        	 } */
		
		//concat Method
		
		
		
		
		
		
	}
}
        		 
        	 
         
         
  

		
		
		
	
        
        
        
        	
        
        
      
            
      
	


