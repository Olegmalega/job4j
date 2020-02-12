package ru.job4j.loop;

import java.util.spi.AbstractResourceBundleProvider;

public class ChecckPrimeNumber {
    public static boolean check(int number) {
        for (int x = 2; x < number; x++) {
            if ((number % x) == 0) {
                break;}
            {
               return true;
            }
        }
        return false;

    }

}