class Test17 
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.add(10,20);
		s.add("abc",20);
		s.add("abc","xyz");
		s.add("10",20.0);
		s.add(10,20.0f);
	}
}
