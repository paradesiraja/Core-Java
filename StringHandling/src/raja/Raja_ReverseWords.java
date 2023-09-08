package raja;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
public class Raja_ReverseWords {
	public static void main(String[]args) {
		
		
		
		/*
     Scanner sc=new Scanner(System.in);
     String s1=sc.nextLine();
     String[] sa=s1.split(" ");
     
     for( int i=sa.length-1;i>=0;i--) {
    	 System.out.print(sa[i]+" ");
    	 
     }
     
     
		Scanner sc=new Scanner(System.in);
		System.out.println("Write a String");
	     String s1=sc.nextLine();
	    
	     String s2=reverseWords(s1);
	   System.out.println(s2);
}

 static String reverseWords(String s) {
		// TODO Auto-generated method stub
		
		//String s1 = "";
		String str=" ";
		String[] sa=s.split(" ");
		for(int i=sa.length-1;i>=0;--i) {
		str=str.concat(sa[i]+" ");
			//System.out.print(sa[i]+" ");
	}
		
		return s;
	
	
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Write a String");
     String s1=sc.nextLine();
    
     String s2=reverseWords(s1);
        System.out.println(s2);
}

	 static String reverseWords(String s3) {
		
		StringBuilder sb=new StringBuilder();
		String[]sa=s3.split(" ");
		for(int i=sa.length-1;i>=0;i--) {
			sb.append(sa[i]+" ");
			//sb.append(" ");
		
			//System.out.print(sa[i]+" ");
		}
		
		return sb.toString();   
		
		   
		
		//StringTokenizer sat=new StringTokenizer("hi hello raja");
		
		String s31="abc";
		
		char[] ch=s31.toCharArray();
		byte[] b=s31.getBytes();
		
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(b));   */
		
		//develop a program to find length of the string 
		//without using predefined method ?
		
		String s1="raja";
		char[] ch=s1.toCharArray();
		System.out.println(ch.length);
		
		
		byte[] b=s1.getBytes();
		System.out.println(b.length);
		
		
		System.out.println(s1.length()); //predefind method
		
		//int count=0;
		//for(int i=0;true;i++) {
			//s1.charAt(i);
		//}
		
	String[] sa=s1.split("");
	System.out.println(sa.length);
	
	
	//Another method also here that is Reflection API
		}
		
	}




    
