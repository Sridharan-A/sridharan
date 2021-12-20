package org.practice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int j,key;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the total value to be sorted");
        int l=in.nextInt();
        int a[]=new int[l];
        System.out.println("enter the values");
        for(int x=0;x<l;x++) {
            a[x] = in.nextInt();
        }
        System.out.println("Elements in array="+ Arrays.toString(a));
        for(int i=1;i<l;i++){
            key=a[i];
            j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("Insertion sort="+Arrays.toString(a));
    }
}
