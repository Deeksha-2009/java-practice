import java.util.Scanner;
public class StudentResult
{
    public static void main(String[] args)
    {
        String StudentName;
        int Rollno;
        float marks;

        System.out.println("enter Student name :");
        Scanner sc =new Scanner(System.in);
        StudentName=sc.next();
        System.out.println("enter roll Number :");
        Rollno=sc.nextInt();
        System.out.println("enter student marks :");
        marks=sc.nextFloat();
        boolean pass = marks>=35;

        System.out.println("name"+StudentName);
        System.out.println("Rollno= "+Rollno);
        System.out.println("Marks= "+marks);
        System.out.println("Pass= "+pass);

        sc.close();
    }
}