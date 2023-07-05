 class Nsic
{
    static int a=10;
	int x=20;
	private int y=30;

	class A
    {
		static void m1(){
			System.out.println(a);
			System.out.println(x);
			System.out.println(y);
		}
   public static void main(String[]args){
	   Nsic.A b=new Nsic().new A();
	   b.m1();

System.out.println("hi");
		}
    }
	public static void main(String[]args)
	{
		Nsic.A a1=new Nsic().new A();
   System.out.println();
   a1.m1();
   a1.main(new String[3]);

	}
}
