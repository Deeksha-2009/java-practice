import java.util.Scanner;

public class CourseManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i<3; i++)
        {
            System.out.println("Enter details of course"+i);

            System.out.println("Enter course ID:");
            String courseID = sc.nextLine();

            System.out.println("Enter course name:");
            String coursename = sc.nextLine();

            System.out.println("Enter Department ID");
            String DepartmentID = sc.nextLine();

            System.out.println("credits");
            int credits = sc.nextInt();
            sc.nextLine();

            System.out.println("course Description:");
            String Description = sc.nextLine();

            System.out.println("----------COURSE DETAILS----------");
            System.out.println("course ID:"+courseID);
            System.out.println("course Name:"+coursename);
            System.out.println("Department ID:"+DepartmentID);
            System.out.println("credits:"+credits);
            System.out.println("Course Description:"+Description);
            System.out.println("-----------------");
        }
        sc.close();
    }

}
