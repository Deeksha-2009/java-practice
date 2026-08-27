import java.util.Scanner;

class MultipleOf5
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        int rem=a%5;
        if (rem==0 && a>1000)
        {
            System.out.println(a+"is multiple of 5");
            System.out.println(a+"is greater than 1000");
        }
        else
        {
            System.out.println(a+"may not be multiple of 5");
            System.out.println(a+"may not be greater than 1000");
        }
        sc.close();

     }
}