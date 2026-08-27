import java.util.Scanner;

public class StudentInformation
{
    static String CollegeName="KLH";
    String StudentName;
    int RollNo;
    final int CourseDuration=4;

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StudentInformation s =new StudentInformation();
        int Semester;

        System.out.println("Enter StudentName:");
        s.StudentName=sc.nextLine();

        System.out.println("Enter RollNo:");
        s.RollNo=sc.nextInt();

        System.out.println("Enter Semester:");
        Semester=sc.nextInt();

        System.out.println("\n-----STUDENT DETAILS-------");
        System.out.println("College Name:"+CollegeName);
        System.out.println("Student Name:"+s.StudentName);
        System.out.println("Roll No:"+s.RollNo);
        System.out.println("Course Duration:"+s.CourseDuration);
        System.out.println("semister"+Semester);
        sc.close();
    }
}