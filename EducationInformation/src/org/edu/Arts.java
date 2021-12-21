package org.edu;

public class Arts extends Education{
    public void bSc(){
        System.out.println("B.SC");
    }
    public void bEd(){
        System.out.println("B.ED");
    }
    public void bA(){
        System.out.println("B.A");
    }
    public void ug(){
        System.out.println("Arts UG:B.SC,B.ED");
    }
    public void pg(){
        System.out.println("Arts PG:M.A,M.SC");
    }

    public static void main(String[] args) {
        Arts a=new Arts();
        a.bA();
        a.bSc();
        a.bEd();
        a.ug();
        a.pg();
    }
}
