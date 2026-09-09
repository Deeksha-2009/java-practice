import java.util.Scanner;

public class TwoDArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        System.out.println("Enter array elements");
        for (int i = 0 ; i<3;i++)
        {
            for (int j = 0 ; j<3;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i=0 ; i<3 ; i++)
        {
            for (int j=0 ; j<3 ; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
