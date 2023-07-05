 class Sample extends Example
{


	static int b=30;
	int y=40;

	static 
	{
		System.out.println("Sample SB");
	}
     {
		System.out.println("Sample NSB");
	}
	Sample()
		{
		System.out.println("sample Constructer");
	}
	static void m4()
		{
		System.out.println("Sample SM");
	}
	void m5()
		{
		System.out.println("Sample NSM");
	}
	void m1()
	{ 
		System.out.println("m1 in sample");
	}




	public static void main(String[] args) 
	{
		System.out.println("\nSample main");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		m2();
		//m4();

		Example e=new Sample();
		//e.m1();
		//e.m3();
		//e.m5();
e.m4();
	}
}
