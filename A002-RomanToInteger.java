package day1;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i))
            {
                case 'I' -> sum+=1;
                case 'V' -> {   sum+=5;     if(0!= i && s.charAt(i-1)=='I')sum-=2;  }
                case 'X' -> {   sum+=10;    if(0!= i && s.charAt(i-1)=='I')sum-=2;  }
                case 'L' -> {   sum+=50;    if(0!= i && s.charAt(i-1)=='X')sum-=20; }
                case 'C' -> {   sum+=100;   if(0!= i && s.charAt(i-1)=='X')sum-=20; }
                case 'D' -> {   sum+=500;   if(0!= i && s.charAt(i-1)=='C')sum-=200;    }
                case 'M' -> {   sum+=1000;  if(0!= i && s.charAt(i-1)=='C')sum-=200;    }
            }
        }
        System.out.println(sum);
    }
}
