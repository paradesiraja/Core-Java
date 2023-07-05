class VoterApplication 
{
	private double Votercard;

	public void setVotercard(double Votercard){
		if(Votercard>=18 & Votercard<=120){
			System.out.println("collect voter card is from eseva after 30 years");
}
		else{
			System.out.println("not aligible votercard");
}
          
}
public double getVotercard(){
                    return Votercard;
}	
	public static void main(String[] args) 
	{
	       VoterApplication vp1=new VoterApplication();
		vp1.setVotercard(19);
		System.out.println("voter card"+vp1.getVotercard());
	}
}
