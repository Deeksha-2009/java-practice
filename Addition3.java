import java.util.Scanner;
public class Addition3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter numa:");
        int numa=sc.nextInt();

        System.out.println("Enter numb:");
        int numb=sc.nextInt();

        System.out.println("Sum of two numbers :"+(numa+numb));

        sc.close();


    }
    
}
