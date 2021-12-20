package org.practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
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
            for(int j=0;j<l-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble sort="+ Arrays.toString(a));
    }
}
