package ru.job4j.loop;

public class ChecckPrimeNumber {
    public static boolean check(int number) {
            boolean prime = true;
            if (number == 1)
                prime = false;
            for (int x = 2; x <= number / 2; x++) {
                if (number % x == 0) {
                    prime = false;
                    break;
                }
            }
            return prime;
        }
    }