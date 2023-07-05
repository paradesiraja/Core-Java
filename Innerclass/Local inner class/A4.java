class A4 
{
	int x=1;
	void m1(){
		final int x=10;
		class B{
			int x=3;
		        void  m2(){
				
					System.out.println("In b m2 x:"+x);

					final int x=4;
					System.out.println(x);
					System.out.println(B.this.x);
					//System.out.println(A.this.x);
					}
		}
		B b=new B();
		b.m2();

		System.out.println(x);
		System.out.println(b.x);
		System.out.println(this.x);
	}
	public static void main(String[] args) 
	{
		A4 e=new A4();
        e.m1();
		//System.out.println(e.m1());
	}
}

