package raja;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1=new StringBuilder();
		s1.append("abh");
		StringBuilder s2=new StringBuilder(s1);
		//s2=s1.reverse();
		//System.out.println(s1.equals(s2));
		if(s1.equals(s2)){
			System.out.println("Is palindrome");
		}
		else
			System.out.println("Is not Palindrome");
	}

}
