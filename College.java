import java.util.Scanner;
class College{
public static void main(String[]args)
{
  Scanner scn=new Scanner(System.in);
  
  Student s1=new Student();
  System.out.println("s1 Details");
  System.out.println(s1);
  
  System.out.println("Enter student ID");
   int sno=scn.nextInt(); scn.nextLine();
  
System.out.println("Enter student name");
   String sname=scn.nextLine();
  
System.out.println("Enter student course");
   String course=scn.nextLine();
 
System.out.println("Enter student fee");
   double fee=scn.nextDouble();  scn.nextLine();

System.out.println("Enter student email");
   String email=scn.nextLine(); 

System.out.println("Enter student mobile");
   String mobile=scn.nextLine(); 

System.out.println("Enter student gender");
   String gender=scn.nextLine(); scn.nextLine();

System.out.println("Enter student CourseCompleted");
   Boolean CourseCompleted=scn.nextBoolean();
}
}
