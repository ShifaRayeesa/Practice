package day1;

import java.util.Scanner;

public class HuffmanDecoder {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for (int i = 0,count=0; i < s.length(); i++) {
            if(s.charAt(i)=='0') {
                System.out.print((char)(65+count));
                count=0;
                continue;
            }
            else if(s.charAt(i)=='1' && count ==3){
                System.out.print((char)(65+count+1));
                count=0;
                continue;
            }
            else count++;
        }
    }
}
