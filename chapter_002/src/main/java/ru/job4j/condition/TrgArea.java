package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c)/2;
        double d = p - a;
        double e = p - b;
        double f = p - c;
        double j = p * d * e * f;
        return  Math.sqrt(j);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}