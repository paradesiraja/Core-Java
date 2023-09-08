package raja;
import java.util.*;

public class reveresewords1 {

	public static String ReverseWords(String s) {
		StringBuilder b=new StringBuilder();
		
		
		String rev=" ";
		String[] words=s.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			b.append(words[i]);
			
		}
		return rev;
	}
	

	public static void main(String[] args) {
		System.out.println("Enter a string");
       Scanner scn=new Scanner(System.in);
       String s1=scn.nextLine();
       String s2=reveresewords1.ReverseWords(s1);
	}


}
