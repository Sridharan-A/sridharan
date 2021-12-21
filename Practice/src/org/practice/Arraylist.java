package org.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> fruitList=new ArrayList<String>();
        ArrayList<String> cloneList=new ArrayList<String>();
        fruitList.add("mango");
        fruitList.add("orange");
        fruitList.add("banana");
        fruitList.add("apple");
        Collections.sort(fruitList);
        cloneList= (ArrayList<String>) fruitList.clone();
        fruitList.set(0,"pineapple");
        System.out.println("fruitList: "+fruitList);
        System.out.println("cloneList :"+cloneList);
        Iterator iterator;
        System.out.println("Reverse :"+fruitList);
    }
}
