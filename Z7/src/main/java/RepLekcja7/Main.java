package RepLekcja7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static double dziel(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException();
        }
        return x / y;

    }

    public static void wczytajPlik(File file) {
        FileReader fr = null;
        char[] a = new char[50];
        try {
            fr = new FileReader(file);
            try {
                fr.read(a);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (char c : a) {
            System.out.print(c);
        }
        try {
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        double x;
        try {
            x = dziel(1, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Nie dziel przez 0");
        }
        File file=new File("text.txt");
        wczytajPlik(file);
    }

}
