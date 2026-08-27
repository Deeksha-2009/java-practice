import java.util.Scanner;

public class StudentMarks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter marks of Subject 1 :");
        int m1=sc.nextInt();

        System.out.println("Enter marks of Subject 2 :");
        int m2=sc.nextInt();
 
        System.out.println("Enter marks of Subject 3 :");
        int m3=sc.nextInt();
 
        System.out.println("Enter marks of Subject 4 :");
        int m4=sc.nextInt();
 
        System.out.println("Enter marks of Subject 5 :");
        int m5=sc.nextInt();

        int total = m1 +m2 + m3+ m4+ m5;
        double percentage = total / 5;

        System.out.println("Total Marks="+total);
        System.out.println("percentage="+percentage+"%");

        if (percentage >=90 )
        {
              System.out.println("Distinction");
        }
        else if (percentage >= 75 )
        {
              System.out.println("first class");
        }
        else if (percentage >= 60 )
        {
              System.out.println("Second class");
        }
        else if (percentage >= 50)
        {
              System.out.println("Third class");
        }
        else 
        {
              System.out.println("fail");
        }
              sc.close();
   }
}