package Czat;

import java.io.*;
import java.net.*;

public class KlientEcho {

    public static void main(String[] args) {
        System.out.println("::KLIENT: ROZPOCZ�CIE PRACY::");
        System.out.println("Wprowadzenie pustego wiersza ko�czy po��czenie");
        Socket gniazdoKlientaEcho = null;
        PrintWriter wyj�cie = null;
        BufferedReader wej�cie = null;
        String serwer = "127.0.0.1";
        int port = 77;
        try {
            gniazdoKlientaEcho = new Socket(serwer, port);
            BufferedReader stdWej�cie = null;
            try {
                wyj�cie = new PrintWriter(gniazdoKlientaEcho.getOutputStream(), true);
                wej�cie = new BufferedReader(new InputStreamReader(
                        gniazdoKlientaEcho.getInputStream()));
                stdWej�cie = new BufferedReader(
                        new InputStreamReader(System.in));
                String wiersz;
                while ((wiersz = stdWej�cie.readLine()).length() > 0) {
                    wyj�cie.println(wiersz);
                    System.out.println("echo: " + wej�cie.readLine());
                }
            } catch (IOException e) {
                System.err.println("B��d po��czenia");
            } finally {
                try {
                    if (stdWej�cie != null) {
                        stdWej�cie.close();
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
            System.err.println("Nie mo�na nawi�za� po��czenia z "
                    + serwer + ":" + port);
        }
        System.out.println("::KLIENT: ZAKO�CZENIE PRACY::");
    }
}
