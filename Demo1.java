import java.util.Scanner;
public class Demo1
{
   public static void main(String[] args)
   {
      int num;
      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your number");
      num=sc.nextInt();
      if(num%5==0)
      {
       System.out.println("The given number is a multiple of 5");

      }
             else
      {
      System.out.println("The given number is not a multiple of 5");
      }
      sc.close();
   }
}