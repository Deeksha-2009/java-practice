import java.util.Scanner;

public class AttendenceCheck
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter attendence percentage:");
        double Attendence =sc.nextDouble();

        if ( Attendence >= 75)
        {
            System.out.println("Eligible for examination");
        }
        else
        {
            System.out.println("Not Eligible for examination");
        }
        sc.close();
    }
}