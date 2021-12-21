package org.practice;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        //shallow copy
        System.out.println("SHALLOW COPY:");
        int a[]={1,2,3};
        int b[] =new int[3];
        b=a;
        System.out.println("A:array="+Arrays.toString(a));
        a[0]=-4;
        System.out.println("a[0]="+a[0]);
        System.out.println("A:array="+Arrays.toString(a));
        System.out.println("B:array="+Arrays.toString(b)+"\n");

        //deep copy
        System.out.println("DEEP COPY:");
        a[0]=1;
        int c[]=new int[3];
        System.out.println("A:array="+Arrays.toString(a));
        c=a.clone();
        a[1]=-8;
        System.out.println("a[1]="+a[1]);
        System.out.println("A:array="+Arrays.toString(a));
        System.out.println("B:array="+Arrays.toString(b));
        System.out.println("C:array="+Arrays.toString(c));
    }
}

