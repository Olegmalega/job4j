package ru.job4j.loop;

public interface Income {
    static void main(String[] args) {
        int income = 0;
        while (income < 100) {
            System.out.println(income);
            income += 10;
        }
    }
}
