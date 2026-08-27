import java.util.Scanner;

public class FinalBill
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter product price:");
        double price=sc.nextDouble();

        System.out.println("Enter quantity");
        int quantity=sc.nextInt();

        System.out.println("Enter customer age");
        int age=sc.nextInt();

        System.out.println("Enter membership status (member/premium/non-member):");
        String membership=sc.next();

        System.out.println("Enter distance (in KM):");
        double distance=sc.nextDouble();

        double totalprice = price*quantity;

        double discount = 0;

        if (membership.equalsIgnoreCase("member") && totalprice >= 5000)
        {
            discount= totalprice *0.10;
        }
        double finalBill = totalprice;
        finalBill -= discount;

        boolean freeDelivery = totalprice >= 3000 || membership.equalsIgnoreCase("premium");

        boolean ageOffer = age >=18 && age <= 60;

        String deliveryMessage = freeDelivery
                ? "Free Delivery"
                : "Deliverry charges Applicable";

        quantity++;
        quantity--;

        System.out.println("\n---------BILL DETAILS----------");
        System.out.println("Product Price: Rs."+price);
        System.out.println("Quantity:+quantity");
        System.out.println("Total Price:RS."+totalprice);
        System.out.println("Discount:Rs."+discount);
        System.out.println("Final Bill:Rs."+finalBill);
        System.out.println("Delivery:"+deliveryMessage);
        System.out.println("Delivery Distance:"+distance+"KM");
        System.out.println("Age-Based OfferEligible:"+ageOffer);

        sc.close();
    }
}