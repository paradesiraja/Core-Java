package raja;

public class StringHandling {
	
	
	
	
	
	public static void main (String[]args) {
		//StringHandling s=new StringHandling ();
		//System.out.println(s.s1);
		
		String s1="raja";
		s1="hi";
		final String raja="raja";
	s1.concat("brahma");
		System.out.println(s1);
	 StringBuffer sb1=new StringBuffer("raja");
		System.out.println(sb1.append(" "+"shekhar"));
		System.out.println(raja.toUpperCase());
		
		
		CharSequence s="hari";
		CharSequence s3=new StringBuffer("reddy");
		CharSequence s4=new StringBuilder("reddy");
		
		System.out.println(s);
		System.out.println(s3);
		System.out.println(s);
		
		StringBuffer a=new StringBuffer("raja");
		//a="reddy";
		a.append(new StringBuffer("Hi"));
		System.out.println(a);
	}

}
