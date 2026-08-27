import java.util.Scanner;

public class CourseRegistration1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Prerequisite completed? (true/false):");
        boolean Prerequisite = sc.nextBoolean();

        System.out.println("Enter Attendence:");
        double Attendence = sc.nextDouble();

        if (Prerequisite && Attendence >= 75)
        {
            System.out.println("Course Registration Successful");
        }
        else
        {
            System.out.println("Course Registration Denied");
        }
        sc.close();
    }
}