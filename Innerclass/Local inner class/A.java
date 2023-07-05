class  A
{
	static int a=10;
	int b=10;

	static void m1(){
		final int c=10;
		int d=10;
		class B {
			void m1(final int e,int f){
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				System.out.println(f);
				
		}
	}
	void m2(){
		class c
		{
			void m2(){
				System.out.println(a);
				System.out.println(b);
			}
		}
	}
		}
	public static void main(String[]args)
	{
        A a1=new A();
		a1.a=5;
		a1.b=6;
		a1.m1();
		a1.m2();

	}
}