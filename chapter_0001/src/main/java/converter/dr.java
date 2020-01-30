package converter;

public class dr {
    public static void dollar(double first) {
        double result = first * 60;
        System.out.println("kurs " + first + " dollarov raven " + result + " rubley");
    }
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }
        public static void main (String[]args) {
            dollar(1.3);
            int euro = rubleToEuro(280);
            System.out.println("140 rubles are " + euro + " euro.");

            int dollar = rubleToDollar (180);
            System.out.println("120 rubles are " + dollar + " dollar.");
        }

}