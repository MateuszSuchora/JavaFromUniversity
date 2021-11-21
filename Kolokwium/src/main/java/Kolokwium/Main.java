package Kolokwium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        ImpPalindromChecker palindrom = new ImpPalindromChecker();
        FileReader in = null;
        FileWriter out = null;
        File read = new File("palindromy");
        File write = new File("out.txt");

        try {
            in = new FileReader(read);
            out = new FileWriter(write);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("palindromy"), "UTF-8"));
            BufferedWriter bw = new BufferedWriter(out);
            String line;
            while (null != (line = br.readLine())) {
                list.add(line);

                //System.out.println(line);

            }
            int len = list.size();
            String a;
            for (int i = 0; i < len; i++) {
                a = list.get(i);
                if (palindrom.check(a)) {
                    bw.write(a + "-- to jest palindrom");
                } else {
                    bw.write(a + "-- to nie jest palindrom");
                }
                bw.newLine();
            }
            in.close();
            bw.close();
            out.close();

        } catch (IOException ex) {
            System.out.println("BRAK SCIEZKI");
        }
    }

}
