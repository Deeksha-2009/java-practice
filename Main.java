import java.util.Scanner;

public class Main
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        System.out.print("Are you a student (true/false): ");
        boolean student = sc.nextBoolean();

        System.out.println("\n----- ID SUMMARY -----");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Height : " + height + " m");
        System.out.println("Student: " + student);
        sc.close();
    }
}  