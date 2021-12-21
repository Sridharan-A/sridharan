package org.company;

public class CompanyInfo {
    public void comName(String s){
        System.out.println("company name:"+s);
    }
    public void comName(String a,String b){
        System.out.println("company name:"+a+"\t"+b);
    }

    public static void main(String[] args) {
        CompanyInfo c=new CompanyInfo();
        c.comName("Green technologies");
        c.comName("Green","Technologies");
    }
}
