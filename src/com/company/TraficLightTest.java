package com.company;

public class TraficLightTest {

    public static void main(String[] args) {
        System.out.println(TraficLight.GREEN.getDurationOfTheLight());
        System.out.println(TraficLight.YELLOW.getDurationOfTheLight());
        System.out.println(TraficLight.RED.getDurationOfTheLight());

        for (TraficLight i: TraficLight.values()) {
            System.out.printf("%7s %2d%n",i, TraficLight.RED.getDurationOfTheLight());
        }
    }
}
