package org.emp;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.MonetaryConversions;

public class Employee {
    public void empId(int i){
        System.out.println("empid number : "+i);
    }
    public void empId(String s){
        System.out.println("empid string : "+s);
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.empId(101);
        e.empId("s108");
        currencyConversion();
    }

    public static void currencyConversion(){
        System.out.println("********CURRENCY CONVERSION ***********");
        MonetaryAmount oneDollar = Monetary.getDefaultAmountFactory().setCurrency("USD")
                .setNumber(1).create();

        CurrencyConversion conversionEUR = MonetaryConversions.getConversion("EUR");

        MonetaryAmount convertedAmountUSDtoEUR = oneDollar.with(conversionEUR);

        System.out.println("USD 1"+ oneDollar);
        System.out.println(convertedAmountUSDtoEUR);
    }
}
