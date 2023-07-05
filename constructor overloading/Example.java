class Example
{
	Example(){
		System.out.println("Ex no -arg constructor");
	}
     
	 Example(int a){
		 System.out.println("int -arg constructor");
	 }
	 Example(String str)
	{
       System.out.println("string-arg constructor");
	}

	public static void main(String[] args) 
	{
		Example e1=new Example();

		Example e2=new Example(10);

		Example e3=new Example("abc");
	}
}