class NitCollection 
{
	public static void main(String[]args)
	{

	Object[] obj=new Object[4];


	obj[0]="10";
	obj[1]="20";
	obj[2]="30";
	obj[3]="40";

	Object[] tempObj=new Object[5];

	//int oldArraySize=obj.length;
	//int n=obj.length;
	
	for(int i=0;i<obj.length;i++)
	{
		tempObj[i]=obj[i];
	 }

	 tempObj[4]="90";

	 obj=tempObj;
	 for(int i=0;i<tempObj.length;i++){

System.out.println(tempObj[i]);
	 }
}
}
