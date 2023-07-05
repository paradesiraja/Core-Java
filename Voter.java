class VoterApplication 
{
	private double Votercard;

	public void setVotercard(double Votercard){
		if(Votercard>=18 & Votercard<=120){
			System.out.println("collect voter card is from eseva after 30 years");
}
		else{
			this.Votercard=Votercard;
}
}	
	public static void main(String[] args) 
	{
	       VoterApplication vp1=new VoterApplication();
		vp1.setVotercard(15);
		//System.out.println("voter card"+vp1.getVotercard());
	}
}
