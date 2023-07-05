package runtimevalues;
import java.io.DataInputStream;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
   DataInputStream dis=new DataInputStream(System.in);
   System.out.println("Enter Fno :");
   int a=Integer.parseInt(dis.readLine());
   System.out.println("Enter Fno :");
   int b=Integer.parseInt(dis.readLine());
   int c=a+b;
   System.out.println(c);
	}

}
