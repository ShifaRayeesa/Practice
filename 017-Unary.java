public class Unary {
    public static void main(String[] args)
    {
        int x=10 , y=11, z=12 , c=5 ;
        boolean a = true;
        System.out.println("Pre-inc and Post-inc operators:");
        System.out.println(++x +" "+ x++);
        System.out.println("Post-dec and Pre-dec operators:");
        System.out.println(y-- +" "+ --y);
        System.out.println("Unary minus");
        System.out.println(-z);
        System.out.println("NOT Operator");
        System.out.println(!a);
        System.out.println("Bitwise Complement");
        System.out.println(~c);
    }
}
