import java.util.Scanner;

public class SmartLockerSystem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter stored PIN:");
        int storedPIN=sc.nextInt();

        System.out.println("Enter entered PIN:");
        int enteredPIN=sc.nextInt();

        System.out.println("Enter BatteryLevel:");
        int BatteryLevel=sc.nextInt();

        System.out.println("enter LockerID:");
        int LockerID=sc.nextInt();

        System.out.println("PIN Correct:"+(enteredPIN== storedPIN));
        System.out.println("Battery Level>20:"+(BatteryLevel>20));
        System.out.println("LockerID<=100:"+(LockerID<=100));

        sc.close();
    }
}