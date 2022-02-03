public class Pgm21 {
    public static void main(String[] args)
    {
        int a=5,b=7,x;
        System.out.println(a*=b+5);   //add then *=
        x=++a - b--;
        System.out.println(x);
        System.out.println(a+" "+b);
        a=7;b=5;
        System.out.println(a%b++);
        x=69>>>2;//1000101 => 10001=17
        System.out.println(x);
    }
}
