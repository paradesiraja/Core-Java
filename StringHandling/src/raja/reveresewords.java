package raja;

import java.util.*;

public class reveresewords {
	public static String ReverseWords(String s) {
		String str = "";
		String[] words = s.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			str=str.concat(words[i]+" ");
			
		}
		str=str.trim();
		return str;
	}

	public static void main(String[] args) {
		System.out.println("Enter a String to reverse");

		Scanner scn = new Scanner(System.in);

		String s1 = scn.nextLine();
		String s2 = reveresewords.ReverseWords(s1);
		System.out.println(s2);

	}

}
