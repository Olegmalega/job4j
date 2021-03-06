package calculator;

/**
 * Класс для вычисления арифметических операций
 * @author Dendyaev Oleg
 * @since 2019 года
 * @version 22
 */

public class Calculator {
    /**
     * сложение
     * @param first первый
     * @param second второй
     * return результат
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }
    /**
     * деление
     * @param first первое
     * @param second второе
     */
    public static void div (double first, double second) {
        double result = first/second;
        System.out.println(first + " / " + second + " = " + result);
    }

    public static void multiply (double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }
    public static void subtrack (double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(4, 2);
        subtrack(10, 5);
    }
    }

