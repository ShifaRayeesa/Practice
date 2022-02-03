public class Pgm22 {
    public static void main(String[] args)
    {
        int a=28;
        a += a++ + ++a + -a + a--;//lhs value of a remains unaffected on inc/dec unlike rhs side
      //28+=(28  + 30  +(-30)+30)  => 28+(28+30) => 28+58=86
        System.out.println(a);
    }
}
