package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        double side1 = ab + ac;
        double side2 = ac+ bc;
        double side3 = ab+bc;

        boolean result = side1 > bc && side2 > ab && side3 > ac;

        return result;
    }
}
