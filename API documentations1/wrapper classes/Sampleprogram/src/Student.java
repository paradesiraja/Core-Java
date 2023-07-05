//import java.io.BufferedReader;
import java.io.InputStream;
import BufferReader.BufferReader;

public class Student {
	public int sno;
	public String sname;
	public String course;
	public long fee;
	public String email;
	public long mobile;
	public String gender;
	public String stding;
	

	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public long getFee() {
		return fee;
	}


	public void setFee(long fee) {
		this.fee = fee;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getStding() {
		return stding;
	}


	public void setStding(String stding) {
		this.stding = stding;
	}


	public static void main(String[] args)throws Exception 
	{
		// TODO Auto-generated method stub
		BufferReader br=new BufferReader(InputStream(Buffer(System.in)));
	}

}.
