package condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double L = h * k;
        return L * h;

    }

    public static void main(String[] args) {
        double result1 = square(8, 2.6);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}

