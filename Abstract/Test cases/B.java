abstract class A 
{
	abstract void m1();
}
class B extends A{
	void m1()
	{
		System.out.println("Hi");
	}
}
class C
{

	public static void main(String[] args) 
	{
		B b=new B();
		b.m1();
	}
}
