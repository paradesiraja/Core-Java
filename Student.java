//Develop the program to read student values from keyboard and store in student class object.
//You read sno,sname,course,fee,email,mobile,gender,course completed.

import java.util.*;

class Student{
  
   private int Sno;
   private String sname;
   private String course;
   private double fee;
   private String email;
   private String mobile;
   private String gender;
   private boolean CourseCompleted; 
    
public void setSno(int Sno){

     this.Sno=Sno;}
    public void getSno(){
      return ;
}
public void setsname(String sname){

     this.sname=sname;}
    public void getsname(){
      return ;
}
public void setcourse(String course){

     this.course=course;}
    public void getcourse(){
      return ;
}
public void setfee(double fee){

     this.fee=fee;}
    public void getfee(){
      return ;
}
public void setemail(String email){

     this.email=email;}
    public void getemail(){
      return ;
}
public void setmobile(String mobile){

     this.mobile=mobile;}
    public void getmobile(){
      return ;
}
public void setgender(String gender){

     this.gender=gender;}
    public void getgender(){
      return ;
}
public void setCourseCompleted(boolean courseCompleted){

     this.CourseCompleted=courseCompleted;}
    public void getCourseCompleted(){
      return ;
}

@Override
 public String toString()
{
  return "Sno :"+ Sno +"\n"+
         "sname :"+ sname +"\n"+
	   "course :"+ course +"\n"+
	   "fee :"+ fee +"\n"+
         "email :"+ email +"\n"+
	   "mobile :"+ mobile +"\n"+
 	   "gender :"+ gender +"\n"+
	   "courseCompleted :"+ CourseCompleted;
}
}



      