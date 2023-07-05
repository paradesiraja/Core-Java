package raja;
import java.util.*;

public class Student {
	private int stdno;
	private String sname;
	private String smedium;
	private long smobile;
	

	public int getStdno() {
		return stdno;
	}


	public void setStdno(int stdno) {
		this.stdno = stdno;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getSmedium() {
		return smedium;
	}


	public void setSmedium(String smedium) {
		this.smedium = smedium;
	}


	public long getSmobile() {
		return smobile;
	}


	public void setSmobile(long smobile) {
		this.smobile = smobile;
	}

}
class Details{
	public static void main(String []args) {
		Student std=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stdno:");
		std.setStdno(sc.nextInt());
		
		System.out.println("Enter setSname:");
		std.setSname(sc.next());
		
		System.out.println("Enter setSmedium:");
		std.setSmedium(sc.next());
		
		System.out.println("Enter setSmobile:");
		std.setSmobile(sc.nextLong());
		
	}
	
}
