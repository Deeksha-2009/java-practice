import java.util.Scanner;

public class Scholarship
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter CGPA:");
        double CGPA=sc.nextDouble();

        System.out.println("Enter Attendence:");
        double Attendence=sc.nextDouble();

        if (CGPA >= 8.5)
        {
            if (Attendence >= 75)
            {
                System.out.println("Eligible for scholarship");
            }
            else
            {
                System.out.println("Attendence requirement not satisfied");
            }
        }
        else
        {
            System.out.println("CGPA requirement not satisfied");
        }
        sc.close();
        
    }
}