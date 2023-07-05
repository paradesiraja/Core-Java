class Example1 
{
	private int x;

     Example1(int x){
	  this.x=x;
    }

	Example1(Integer x){
		this.x=x.intValue();
	}
	Example1(String x){
		this.x=Integer.parseInt(x);
	}
	public int getx(){
		return x;
	}

	public static void main(String[] args) 
	{
		Example1 e1=new Example1(5);

		Example1 e2=new Example1(new Integer(10));

		Example1 e3=new Example1("1");

		System.out.println(e1.getx());
		System.out.println(e2.getx());
		System.out.println(e3.getx());
	}
}
