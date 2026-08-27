public class SmartLockerSystem1
{
    public static void main(String[] args)
    {
        int AvailableLockers=5;

        System.out.println("Initial Available Lockers:"+AvailableLockers);

        AvailableLockers--;
        System.out.println("After Locker Reservation:"+AvailableLockers);

        AvailableLockers--;
        System.out.println("After Second Reservation:"+AvailableLockers);

        AvailableLockers++;
        System.out.println("After Locker Return:"+AvailableLockers);

        AvailableLockers++;
        System.out.println("After Second Locker Return:"+AvailableLockers);


    }
}