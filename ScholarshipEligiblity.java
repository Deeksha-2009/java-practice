import java.util.Scanner;
public class ScholarshipEligiblity {
    public static void main (String[] args) {
        int sub1;
        int sub2;
        int sub3;
        float attendence;
        double familyincome;
        int totalmarks;
        float average;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter sub1 marks :");
        sub1 = sc.nextInt();
        System.out.print("enter sub2 marks :");
        sub2 = sc.nextInt();
        System.out.print("enter sub3 marks :");
        sub3 = sc.nextInt();
        System.out.print("enter attendence percentage :");
        attendence = sc.nextFloat();
        System.out.print("enter family income :");
        familyincome = sc.nextDouble();

        totalmarks = sub1 + sub2 + sub3;
        average = totalmarks / 3.0f;
        boolean eligible = (average >=75 && attendence >= 75 && familyincome <= 300000);
        System.out.println("total marks : "+totalmarks);
        System.out.println("average marks : "+average);
        System.out.println("scholarship status :" + (eligible ? "scholarship granted" : "scholarship not granted"));
        sc.close();

        

    }
}