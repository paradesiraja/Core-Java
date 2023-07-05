class BikeGear 
{
	private int Gear;

	public void setGear(int Gear){
		if(Gear<=1 && Gear>=5)
			System.out.println("Bike is running a gear num :" +Gear);
		else
			System.out.println("Choose right gear to ride a bike");

	}
	

	public static void main(String[] args) 
	{
		BikeGear bg=new BikeGear();
		bg.setGear(2);
		//System.out.println("bike is running" +bg.getGear());
	}
}
