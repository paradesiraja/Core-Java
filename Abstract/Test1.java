abstract class  Example
{
	abstract void m1();
	abstract void m2();
	void m3(){
		System.out.println("bye");
	}
}
 class Sample extends Example{
	void m1(){
		System.out.println("Hi");
     	}
		void m2(){
System.out.println("hello");
}

}
abstract class Abc extends Sample{
	 void m2(){
		System.out.println("Hello");
	}
}
/*class Xyz extends Sample{
	void m2(){
		System.out.println("Bye");
	}
}*/
class Test1
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	   Example e1=new Sample();
	   e1.m1();
	   e1.m2();
       e1.m3();
	}
}
