import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float rad=sc.nextInt();
        float height=sc.nextInt();
        float area=2.0f*3.14f*rad*(rad+height);
        System.out.println(area);
    }

}
