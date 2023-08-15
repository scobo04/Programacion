package org.example;

import java.util.concurrent.TimeUnit;

public class ejercicio8 {

    public static void main(String[] args) throws InterruptedException {

        int h,m,s;
        String borrarAnterior = "\b\b\b\b\b\b\b\b";

        for (h = 0; h < 24; h++) {

            for (m = 0; m < 60; m++) {

                for (s = 0; s < 60; s++) {

                    System.out.printf("%02d:%02d:%02d", h,m,s);
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print(borrarAnterior);

                }

            }

        }

    }

}
