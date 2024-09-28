package Day3;
public class DataConvertion {
    public static void main(String args[]) {
        
 
        int a = 12; // 4 bytes
        byte b = 1; // 1 byte

        // this will throw an error
        // think about it as trying to put a big box in a small one
        byte c = a; 

        // this will work fine
        // think about it as putting a small box in a bigger one
        int d = b;

        // to make the first one work we need to implicitly covert the data type
        // this is called casting

        byte e = (byte) a;

        // Now let's say the int value was 257 which exceeds the range for the byte datatype
        // In this case a modulo operator will be applied when converting types
        // As the maximum value for byte is 255 so an module of 256 will be applied

        int k = 257;
        byte z = (byte) k;

        System.out.println(z); // The output value is 1

    }  
}
