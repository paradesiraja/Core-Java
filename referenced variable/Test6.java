class Example 
{
	int x=4;
	int y=6;
	static{
		System.out.println("hi");
	}
	String s="reddy";
}
class Sample
{
	static Example e1=new Example();
	Example e2=new Example();
	
	void m3(Example e3){
		Example e4=e3;
		System.out.println(e4.x);
        System.out.println(e4.y);
	}

}
class Test6
{

	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.m3(new Example());
		s.e1.s="raju";
	    System.out.println(s.e1.s);
		  System.out.println(s.e2.s);
		  



		//System.out.println("Hello World!");
	}
}
