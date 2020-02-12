package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for (int x = 2; x < finish; x++) {
            if ((finish % x) == 0) {
                count +=1;
//for (int x = 2; x < number; x++) {
//            if ((number % x) == 0)
            }
        }
        return count;
    }
}
