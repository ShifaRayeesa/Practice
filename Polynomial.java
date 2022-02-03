import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a = sc.nextInt();
        System.out.println("Enter b = ");
        int b = sc.nextInt();
        System.out.println("Enter c = ");
        int c = sc.nextInt();
        double d = b * b - 4 * a * c;
        if(d>0.0)
        {
            double x1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            double x2 = (-b - Math.pow(d, 0.5)) / (2 * a);
            System.out.println("Roots are real and distinct");
            System.out.println("x = " + x1 + "  x = " + x2);
        }
        else if(d==0.0)
        {
            double x1 = -b/(2 * a);
            System.out.println("Roots are real and identical");
            System.out.println("x = " + x1);
        }
        else
        {
            System.out.println("Roots are not real");
        }
    }
}
