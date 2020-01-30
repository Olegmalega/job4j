package converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
   public static int rubleToDollar(int value) {
       return value / 60;
    }
    public static int DollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {

        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");

        int dollar = rubleToDollar (120);
        System.out.println("120 rubles are " + dollar + " dollar");

        int ruble = euroToRuble(140);
        System.out.println("140 euro are " + ruble + " rubles");

        int rubleDollar = DollarToRuble (180);
        System.out.println("180 dollars are " + rubleDollar + " rubles");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

       int inE = 140;
       int expectedE = 9800;
       int outE = euroToRuble(inE);
       boolean passedE = expectedE == outE;
       System.out.println("140 euro are 9800 rubles. Test result : " + passedE);


        int inD = 120;
        int expectedD = 2;
        int outD = rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("120 rubles are 2 dollars. Test result : " + passedD);

        int inRd = 5;
        int expecteRd = 300;
        int outRd = DollarToRuble(inRd);
        boolean passedRd = expecteRd == outRd;
        System.out.println("3 dollars are 300 rubles. Test result : " + passedRd);
    }
}
