import java.util.Scanner;
public class Addition1
{
    public static void main(String[] args)
    {
        int a;
        int b;

        System.out.println("enter a value:");
        Scanner add= new Scanner(System.in);
        a=add.nextInt();
        System.out.println("enter b value:");
        b=add.nextInt();

        System.out.println("Addition of two numbers is :"+(a+b));
        add.close();


    }
}