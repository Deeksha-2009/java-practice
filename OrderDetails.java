public class OrderDetails
{
    public static void main(String[] args)
    {
        int OrderID=789;
        String ProductName="Wireless Headphones";
        int Quantity=2;
        double TotalAmount=1000.50;
        boolean DeliveryStatus=true;

        System.out.println("Order ID="+OrderID);
        System.out.println("Product Name="+ProductName);
        System.out.println("Quantity="+Quantity);
        System.out.println("Total Amount="+TotalAmount);
        System.out.println("Delivery Status="+(DeliveryStatus?"Delivered":"Not Delivered"));



    }
}