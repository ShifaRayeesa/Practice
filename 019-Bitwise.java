public class Bitwise {
    public static void main(String[] args)
    {
        int x=10 , y=2;
        System.out.println("Bitwise AND");
        System.out.println(x & y);
        System.out.println("Bitwise OR");
        System.out.println(x | y);
        System.out.println("Bitwise XOR");
        System.out.println(x ^ y);
        System.out.println("Bitwise complement");
        System.out.println(~x);
        System.out.println("Right-Shift");
        System.out.println(x>>2);
        System.out.println(y>>2);
        System.out.println("Left-Shift");
        System.out.println(x<<1);
        System.out.println("Unsigned Right Shift");
        System.out.println(x>>>2);
       // System.out.println("Unsigned Left Shift");
       // System.out.println(x <<< 1); There is no unsigned left shift operator
    }
}
