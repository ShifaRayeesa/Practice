import java.util.Scanner;
public class DatatypeLong
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x = s.nextInt();
        long y = s.nextLong();
        if(x==y)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
    }
}
