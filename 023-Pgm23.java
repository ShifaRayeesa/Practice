public class Pgm23 {
    public static void main(String[] args)
    {
        int x=1;
        x = x++ * 2 + 3 * --x;
        System.out.println(x);
    }
}
