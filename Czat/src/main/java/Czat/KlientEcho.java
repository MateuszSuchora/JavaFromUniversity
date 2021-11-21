package Czat;

import java.io.*;
import java.net.*;

public class KlientEcho {

    public static void main(String[] args) {
        System.out.println("::KLIENT: ROZPOCZÊCIE PRACY::");
        System.out.println("Wprowadzenie pustego wiersza koñczy po³¹czenie");
        Socket gniazdoKlientaEcho = null;
        PrintWriter wyjœcie = null;
        BufferedReader wejœcie = null;
        String serwer = "127.0.0.1";
        int port = 77;
        try {
            gniazdoKlientaEcho = new Socket(serwer, port);
            BufferedReader stdWejœcie = null;
            try {
                wyjœcie = new PrintWriter(gniazdoKlientaEcho.getOutputStream(), true);
                wejœcie = new BufferedReader(new InputStreamReader(
                        gniazdoKlientaEcho.getInputStream()));
                stdWejœcie = new BufferedReader(
                        new InputStreamReader(System.in));
                String wiersz;
                while ((wiersz = stdWejœcie.readLine()).length() > 0) {
                    wyjœcie.println(wiersz);
                    System.out.println("echo: " + wejœcie.readLine());
                }
            } catch (IOException e) {
                System.err.println("B³¹d po³¹czenia");
            } finally {
                try {
                    if (stdWejœcie != null) {
                        stdWejœcie.close();
                    }
                } catch (IOException ex) {
                }
                try {
                    gniazdoKlientaEcho.close();
                } catch (IOException ex) {
                }
            }
        } catch (UnknownHostException ex) {
            System.err.println("Nieznany serwer: " + serwer);
        } catch (IOException ex) {
            System.err.println("Nie mo¿na nawi¹zaæ po³¹czenia z "
                    + serwer + ":" + port);
        }
        System.out.println("::KLIENT: ZAKOÑCZENIE PRACY::");
    }
}
