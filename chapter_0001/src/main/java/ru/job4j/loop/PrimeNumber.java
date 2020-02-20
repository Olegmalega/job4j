package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {

            if (ChecckPrimeNumber.check(number)) {
                   count ++;
                }
            }
            return count;
        }
      }
// count += 1;
//if ((finish % number) == 0) {
//  for (int x = 2; x < number; x++) {
// for (int x = 2; x < number; x++) {
//   if ((number % x) == 0) {