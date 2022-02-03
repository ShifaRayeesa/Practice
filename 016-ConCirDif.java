import java.util.Scanner;

public class ConcCirDif {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of Outer Circle :");
        double rad1= sc.nextDouble();
        System.out.println("Enter the radius of Inner Circle :");
        double rad2= sc.nextDouble();
        double area=3.14*(rad1*rad1-rad2*rad2);
        System.out.println(area);
    }
}
