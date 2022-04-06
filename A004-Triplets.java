package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Triplets {
    public boolean isDuplicate(ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> array)
    {
        System.out.println(temp);
        System.out.println(array);
        boolean bool=true;
        for(int i=0;i<array.size();i++)
        {
            bool=array.get(i).equals(temp);
            if(bool==true)
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Triplets obj=new Triplets();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array length");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> array=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i = 0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for (int k = j+1; k < n && i!=j && i!=k && j!=k ; k++,temp.clear())
                {
                    if (arr[i] + arr[j] + arr[k] == 0)
                    {
                        temp.add(arr[i]);temp.add(arr[j]);temp.add(arr[k]);
                        if(!obj.isDuplicate(temp,array))
                        array.add(new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k])));
                    }
                }
            }
        }

        System.out.println(array);
    }
}
