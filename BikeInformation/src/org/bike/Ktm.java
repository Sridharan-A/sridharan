package org.bike;

public class Ktm implements Bike{
    @Override
    public void cost() {
        System.out.println("cost:2,00,000 rs");
    }

    @Override
    public void speed() {
        System.out.println("speed:150 Km/h");
    }

    public static void main(String[] args) {

        Ktm k=new Ktm();
        k.cost();
        k.speed();
    }
}
