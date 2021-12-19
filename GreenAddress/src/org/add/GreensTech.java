package org.add;

public class GreensTech {
    public void greensOmr(){
        System.out.println("empty address");
    }
    public void greensOmr(int i){
        System.out.println("Plot no:"+i);
    }
    public void greensOmr(String s){
        System.out.println(s);
    }
    public void greensOmr(int i,String a,String b){
        System.out.println("Plot no:"+i+","+a+","+b);
    }
    public void greensOmr(String a,String b,int i){
        System.out.println(a+","+b+",Pin code:"+i);
    }

    public static void main(String[] args) {
        GreensTech g=new GreensTech();
        g.greensOmr();
        g.greensOmr(19);
        g.greensOmr("near omr food street");
        g.greensOmr(19,"near omr food street","perumbakkam");
        g.greensOmr("near omr food street","perumbakkam",600100);
    }
}
