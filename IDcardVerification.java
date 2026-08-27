import java.util.Scanner;

public class IDcardVerification
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("ID card verification completed? (true/false): ");
        boolean IDcardverification1=sc.nextBoolean();

        System.out.println("if ID card valid? (true/false)");
        boolean IDcardvalid=sc.nextBoolean();

        if (IDcardverification1)
        {
            if (IDcardvalid)
            {
                System.out.println("Lab access granted");
            }
            else
            {
                System.out.println("Bring vallid id card");
            }
        }
        else
        {
            System.out.println("Access Denied");
        }
        sc.close();

    }
}