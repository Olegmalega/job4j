package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {

      int result = (first > second ? first : second) > third ? (first > second ? first : second) : third;
       //int result = first > second ? first : second;
       //int res2 = result > third ? result : third;
       return result;
    }
}