class Division_Exaception_Handling 
{
	public static void main(String[] args) 
	{
		try{

		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a/b;
		System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("please enter atleast two integers ");
		}
		catch(NumberFormatException e2){
             System.out.println("int value cannot be converting into a string ");
		}
		catch(ArithmeticException e3){

             System.out.println("zero cannot divisible by int value ");
	}
}
