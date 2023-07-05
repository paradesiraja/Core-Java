class Test 
{
	public static void main(String[] args) 
	{
		//Sample.B b=new Sample().new B();
		//b.m1();
		Sample s=new Sample();
		Sample.B b=s.new B();
		b.m1();

		System.out.println("Hello World!");
	}
}
