package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {

       // boolean condition = left > right;
      //  int result = condition ? left : right;
        int result = left > right ? left : right;
        return result;
    }

    public static int min(int left, int right) {

        boolean condition = left < right;
        int result = condition ? left : right;
        return result;
    }
    public static int Equally(int left, int right) {

        boolean condition = left == right;
        int result = condition ? left : right;
        return result;
    }
}