public class DataTypeSize
{
    public static void main (String[] args)
    {
        System.out.println("byte= "+Byte.BYTES +" bytes ("+Byte.SIZE+"bits)");
        System.out.println("short= "+Short.BYTES +"bytes ("+Short.SIZE+"bits)");
        System.out.println("int= "+Integer.BYTES +"bytes ("+Integer.SIZE+"bits)");
        System.out.println("long= "+Long.BYTES +"bytes ("+Long.SIZE+"bits)");
        System.out.println("float= "+Float.BYTES+"bytes ("+Long.SIZE+"bits)");
        System.out.println("double= "+Double.BYTES+"bytes ("+Double.SIZE+"bits)");
        System.out.println("char= "+Character.BYTES+"bytes ("+Character.SIZE+"bits)");
        System.out.println("Boolean =JVM dependent");

    }
}