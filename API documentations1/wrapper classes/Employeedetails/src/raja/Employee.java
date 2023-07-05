package raja;
import java.io.*;
public class Employee {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter empno :");
		int empno=Integer.parseInt(br.readLine());
		
		System.out.println("Enter empnname :");
		String empname=br.readLine();
		
		System.out.println("Enter empmobile :");
		long empmobile=Long.parseLong(br.readLine());
		
		System.out.println("Enter empsalary :");
		double empsalary=Double.parseDouble(br.readLine());
		
		System.out.println("Enter emptype :");
		String emptype=br.readLine();
		
		
		System.out.println("enter\t empno:\t" +empno);
		System.out.println("enter\t name:\t"+empname);
		System.out.println("enter\t mobile:\t"+empmobile);
		System.out.println("enter\t salary:\t"+empsalary);
		System.out.println("entertype\t :\t"+emptype);
          
	}

}
