import java.util.Scanner;
public class ShoppingDiscount
{
    public static void main(String[] args)
    {
    int Quantity;
    double amount;

    System.out.println("enter no of quantity :");
    Scanner sc =new Scanner(System.in);
    Quantity=sc.nextInt();
    System.out.println("enter amount :");
    amount=sc.nextDouble();

    if(Quantity>1)
    {
        amount=amount*Quantity;
    }
    

    double discount = amount>= 5000 ? amount * 0.20 : 0;

    double finalAmount= amount - discount;

    System.out.println("Bill Amount = "+amount);
    System.out.println("Discount = "+discount);
    System.out.println("Final Amount = "+finalAmount);

    sc.close();
    }
}