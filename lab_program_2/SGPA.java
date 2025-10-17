import java.util.Scanner;
class Subject{
    int marks,credits,grade;
}
class Student
{
String usn,name;
double sgpa;
Subject sub[]= new Subject[7];
Scanner sc=new Scanner(System.in);
Student(){for(int i=0;i<7;i++)
sub[i]=new Subject();}
void AcceptDetails()
{

System.out.print("Enter USN:");
usn= sc.next();
System.out.println("Enter the name of student:");
name= sc.next();
System.out.println("Enter details of credits and marks in order for 7 subjects:");
for(int i=0;i<7;i++)
{
System.out.println("Enter credits for subject" + (i+1)+":");
sub[i].credits=sc.nextInt();
System.out.println("Enter marks for "+ (i+1)+ ":");
sub[i].marks=sc.nextInt();
}
}
void Display()
{
System.out.println("STUDENT DETAILS");
System.out.println("USN:"+ usn);
System.out.println("NAME:"+ name);
for (int i=0;i<7;i++)
{
System.out.println("Subject "+ (i+1)+ "- CREDITS:"+ sub[i].credits+ ",MARKS: "+ sub[i].marks);
}
}
double calc()
{
int totalCredits=0;
double totalGradePoints=0;
for(int i=0;i<7;i++)
{
totalCredits+= sub[i].credits;
totalGradePoints+= gradepoints(sub[i].marks)*sub[i].credits;
}
return totalGradePoints/totalCredits;

}
int gradepoints(int marks)
{
if(marks>=100) return 10;
else return marks/10+1;
/*else if(marks>=70) return 8;
else if(marks>=60) return 7;
else if(marks>=50) return 6;
else if(marks>=40) return 5;
else return 0*/
}
}
public class SGPA
{
public static void main(String[] a)
{
System.out.println("Suryansh Singh\n 1BF24CS309");
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of students: ");
int numstudent= sc.nextInt();
Student student[]=new Student[numstudent];
for (int i=0;i< numstudent;i++)
{
student[i]=new Student();
student[i].AcceptDetails();
student[i].Display();
System.out.println("\nSGPA: "+ student[i].calc());
}
}
}