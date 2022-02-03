import java.util.Scanner;
    public class Datatype
    {
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            float x = s.nextFloat();
            double y = s.nextDouble();
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
