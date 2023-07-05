class A 
{
	void m1(){
		System.out.println("m1.A");
	}
}
class B extends A
{
	void m1(){
		System.out.println("m1.B");
	}
	void m2(){
		System.out.println("m2.B");
	}
}
class Test10
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.m2();
		System.out.println("Hello World!");
	}
}
