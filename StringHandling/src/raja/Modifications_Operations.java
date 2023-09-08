package raja;

import java.net.MulticastSocket;
import java.util.List;

//import javax.swing.JList;

public class Modifications_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//+ and concat Operation
		/*
		String s1="Hari";
		//s1="krishna";
		String s2=s1.concat("krishn");
		System.out.println(s1+s2);
		
		String s3="a";
		s3.concat("b");
		//System.out.println(s3.concat("b"));
		System.out.println(s3);
		String s4=s3.concat("c");
		System.out.println(s4);
		System.out.println(s3==s4);
		
		s3=s3.concat("d");
		System.out.println(s3);
		
		
		String s5=s3.concat("");
		System.out.println(s3);
		System.out.println(s5);
		System.out.println(s3==s5);
		System.out.println();
		
		String s6="";
		String s7=s6.concat(s3);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s6==s7);
		System.out.println(s3==s7);
		System.out.println();
		
		String s8="p";
		String s9=s8+"q";
		String s10=s8.concat("");
		String s11=""+s8;
        System.out.println(s8);
        System.out.println(s9);
        System.out.println(s10);
        System.out.println(s11);
        System.out.println(s8==s9);
        System.out.println(s8==s10);
        System.out.println(s8==s11);
        System.out.println(s10==(s11));
        
		System.out.println();
		
		String s15="abc";
		String s16="a"+"b"+"c";
		String s17="a".concat("b").concat("c");
		System.out.println(s15==s16);
		System.out.println(s15==s17);
		System.out.println(s17==s16);
		System.out.println();
		
		
		String s18="a";
		String s19=s18.concat("b");
		String s20=s18.concat("b");
		System.out.println(s19.equals(s20));
		System.out.println(s18==s19);
		
		String s21=s18.concat("");
		String s22=s18.concat("");
		System.out.println(s18==s21);
		System.out.println(s18==s22); 
		
		
		
		//String join Method
		
		String s1="a"+"-"+"b"+"-"+"c"+"-"+"d";
		
		String s2="a".concat("-").concat("b").concat("-").concat("c").concat("-").concat("d");
		
		String s3=String.join("-","a","b","c","d");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		String s4=String.join("","a","b","c","d");
		String s5=String.join("-");
		String s6=String.join("-","a");
		String s7=String.join("-","a",new StringBuffer("b"),new StringBuilder("c"));
		String s8=String.join("-","a",null,"c");
		String s9=String.join("null","a",null,"c");
		
		
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		
		String s10=String.join(":::",new String[] {"1","2","3"});
		String s11=String.join(":::",new StringBuffer[] {new StringBuffer("m"),new StringBuffer("n")});
		System.out.println(s10);
		System.out.println(s11);
		
		List<String> al=List.of("p","q","r");
		String s12=String.join("/", al);
		System.out.println(s12);  
		
		//String UpperCase and LowerCase
		
		
		String s1="aBc";
		System.out.println(s1);
		
		s1.toUpperCase();
		System.out.println(s1);
		
		
		String s2=s1.toUpperCase();
		System.out.println(s2);
		String s3=s1.toLowerCase();
		System.out.println(s3);
		s1=s1.toLowerCase();
		System.out.println(s1);
		
		System.out.println(s1==s3);
		System.out.println();
		
		String s5=s1.toUpperCase();
		String s6=s1.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s1==s5);
		System.out.println(s5==s6);
		System.out.println(s1.equals(s5));
		System.out.println(s5.equals(s6));
		
		String s7=s6.toUpperCase();
		String s8=s6.toLowerCase();
		System.out.println(s6==s7);
		System.out.println(s6==s8);
		System.out.println(s6.equals(s8));
		
		
		String s9="12@34";
		String s10 =s9.toLowerCase();
		String s11 =s9.toUpperCase();
		
		System.out.println(s10);
		System.out.println(s11);
		System.out.println(s9==s10);
		System.out.println(s9==s11);
		System.out.println(s10==s11);
		
		String s12="pqR";
		System.out.println(s12.toUpperCase());
		System.out.println(s12=s12.toUpperCase());
		System.out.println(s12);
		
		String s13=null;
		//System.out.println(s13.toUpperCase());
		
		
		String [] sa=new String[5];
		//System.out.println(sa[0].toUpperCase());   
		
		
		//String Replace
		String s1="Hari Krishna Hari NIT hari Ameerpet hAri hyderabad";
		System.out.println(s1);
	System.out.println(s1.replace('H', 'h'));
	System.out.println(s1.replace("H","h"));
		System.out.println(s1.replace("H","@"));
	System.out.println(s1.replace("Hari","@"));
		System.out.println(s1.replaceAll("Hari","@"));
		System.out.println(s1.replaceAll(".","/"));
		System.out.println(s1.contains("hari"));
		System.out.println(s1.replaceAll("[Hari]","/"));
		System.out.println(s1.replace("[Hari]","/"));
		System.out.println(s1.replaceFirst("[Hari]","/"));
		System.out.println(s1.replaceFirst("a",","));
		
		
		
		String s1="abc abc abc";
		System.out.println(s1); 
		System.out.println(s1.replace('a', 'b')); 
		System.out.println(s1.replace("a","b")); 
		String s2=s1.replace('a','b');
		System.out.println(s1);
		System.out.println(s2);
		
		String s3=s1.replaceFirst("a","b");
		System.out.println(s3);
		
		s1=s1.replace('a', 'b');
		System.out.println(s1);
		String s4=s1.replace("a", "e");
		System.out.println(s4);
		System.out.println(s1==s4);
		String s5=s1.replace("d", "e");
		System.out.println(s5);
		
		System.out.println(s1==s5);
		
		
		String s6="abc.text.doc";
		String s7=s6.replace(".", "#");
		String s8=s6.replaceAll("[abc]", "#");
		String s9=s6.replaceAll(".", "#");
		String s10=s6.replaceAll("\\.", "#");
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
		
		String s11="ab$bbc?bc";
		String s12=s11.replace("$", "-");
		System.out.println(s12);
		
		String s13=s11.replaceAll("\\?","8");
		System.out.println(s13);
		
		String s14="abc";
		String s15=s14.replace('a', 'b');
		String s16=s14.replace('a','b');
		String s17=s14.replace('a','b');
		System.out.println(s14==s16);
		System.out.println(s14==s16);
		System.out.println(s14==s17);
		System.out.println(s15==s16);
		System.out.println(s16==s17);
		
		System.out.println(s15.equals(s16));  */
		
		//Difference between Trim() and Replace
		 String s1=" abc abc  ";
		 System.out.println(s1.length());
		 s1.trim();
		 System.out.println(s1.length());
		 
		 
		String s2=s1.trim();
		System.out.println(s2.length());
		String s3=s2.trim();
		System.out.println(s3.length());
		System.out.println(s2==s3);
		
		
		String s4=s1.replace(" ", "");
		System.out.println(s4.length());
		
		String s5=s1.trim();
		String s6=s1.trim();
		System.out.println(s5==s6);
		
		String s7=s6.trim();
		System.out.println(s7==s6);
		
		
		
		
		
		
		
		
		
		
		
	}

}
