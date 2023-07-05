class BankAccount
{
	public final double MIN_BALANCE=10000;
	private double balance;
	String username;
	private String password;

	public void setBalance(double balance){
		if(balance<=0)
			System.out.println("Do not pass -ve amount");
		else
			this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
}
class Bank
{
	public static void main(String[] args) 
	{
		BankAccount acc1=new BankAccount();
		acc1.setBalance(-100);
		System.out.println("current balance"+acc1.getBalance());
	}
}
