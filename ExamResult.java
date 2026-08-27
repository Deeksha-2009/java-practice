import java.util.Scanner;

public class ExamResult
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("java Marks:");
        int java= sc.nextInt();

        System.out.println("DS Marks:");
        int ds= sc.nextInt();

        System.out.println("Enter Maths Marks:");
        int maths= sc.nextInt();

        if (java >= 40 && ds >= 40 && maths >= 40)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
        sc.close();
    }
}