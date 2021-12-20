package org.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int min_Index,temp;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the total value to be sorted");
        int l=in.nextInt();
        int a[]=new int[l];
        System.out.println("enter the values");
        for(int x=0;x<l;x++) {
            a[x] = in.nextInt();
        }
        System.out.println("Elements in array="+Arrays.toString(a));

        for(int i=0;i<l-1;i++)
        {
            min_Index=i;
            for(int j=i+1;j<l;j++)
            {
                if(a[j]<a[min_Index])
                {
                min_Index=j;
                }
            }
            temp=a[min_Index];
            a[min_Index]=a[i];
            a[i]=temp;
        }
        System.out.println("Selection sort="+Arrays.toString(a));
    }

}
