package org.phone;

public class Phone {
    public void phoneInfo(String name,int num){
        System.out.println("Name:"+name+"\t"+"Number:"+num);
    }
    public void phoneInfo(int num,String name){
        System.out.println("Name:"+name+"\t"+"Number:"+num);
    }

    public static void main(String[] args) {
        Phone p=new Phone();
        p.phoneInfo("nokia",123456789);
        p.phoneInfo(987654321,"samsung");
    }
}
