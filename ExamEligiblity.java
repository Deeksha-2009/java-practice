import java.util.Scanner;

public class ExamEligiblity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter attendence percentage:");
        int attendence=sc.nextInt();

        System.out.println("Are fees paid? (true/false):");
        boolean feespaid=sc.nextBoolean();

        System.out.println("Does the student has special permission? (true/false):");
        boolean SpecialPermission=sc.nextBoolean();

        System.out.println("Is the student debarded? (true/false):");
        boolean debarded=sc.nextBoolean();

        boolean eligible= !debarded &&((attendence>=75 && feespaid) || SpecialPermission);

        System.out.println("Exam Eligible: "+ eligible);

        sc.close();
     }
}