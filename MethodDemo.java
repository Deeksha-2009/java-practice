import java.util.*;
public class MethodDemo
{
    static float displayNumber(float n,float b , float c)
    {
        float sum=n+b+c;
        return sum;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter x,y,z values");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        float total=displayNumber(x,y,z);
        float avg = total/3;
        System.out.println("avg :"+avg);

        sc.close();
    }
}

















