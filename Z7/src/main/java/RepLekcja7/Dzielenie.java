package RepLekcja7;

public class Dzielenie {

    double d(double x, double y) {
        double z = 0;
        try {
            z = x / y;
        } catch (ArithmeticException ex) {
            System.out.println("Nie dziel przez 0");
        }
        return z;
    }
}
