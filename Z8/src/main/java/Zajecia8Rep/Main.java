package Zajecia8Rep;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import static java.lang.Character.isDigit;

public class Main {

    public static void copy(String sin, String sout) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(sin);
            out = new FileOutputStream(sout);
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();

        } catch (IOException ex) {
            System.out.println("BRAK SCIEZKI");
        }
    }

    public static void copy2(String sin, String sout) {
        FileReader in = null;
        FileWriter out = null;
        File read = new File(sin);
        File write = new File(sout);
        try {
            in = new FileReader(read);
            out = new FileWriter(write);
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();

        } catch (IOException ex) {
            System.out.println("BRAK SCIEZKI");
        }
    }

    public static void copy3(String sin, String sout) {
        FileReader in = null;
        FileWriter out = null;
        File read = new File(sin);
        File write = new File(sout);

        try {
            in = new FileReader(read);
            out = new FileWriter(write);
            BufferedReader br = new BufferedReader(in);
            BufferedWriter bw = new BufferedWriter(out);
            String line;
            while (null != (line = br.readLine())) {
                bw.write(line);
                bw.newLine();
            }
            in.close();
            bw.close();
            out.close();

        } catch (IOException ex) {
            System.out.println("BRAK SCIEZKI");
        }
    }

    public static void zadanie(String sin, String sout) throws FileNotFoundException, IOException {
        File read = new File(sin);
        File write = new File(sout);
        DataOutputStream os = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(write)));
        os.writeBoolean(true);
        os.writeInt(1234567890);
        os.writeDouble(Math.PI);
        os.writeUTF("Test strumieni.\n¹æê³ñóœŸ¿\n");
        os.close();// wykonuje flush()

        DataInputStream is = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(read)));
        Boolean b = is.readBoolean();
        Integer i = is.readInt();
        Double d = is.readDouble();
        String str = is.readUTF();
        is.close();

        System.out.printf("Odczytano: b=%s, i=%s, d=%s, str=%s", b, i, d, str);
    }
        public static void zadanie2(String sin, String sout) throws FileNotFoundException, IOException {
        File read = new File(sin);
        File write = new File(sout);
        DataOutputStream os = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(write)));
        os.writeBoolean(true);
        os.writeInt(1234567890);
        os.writeDouble(Math.PI);
        os.writeUTF("Test strumieni.\n¹æê³ñóœŸ¿\n");
        os.close();// wykonuje flush()

        DataInputStream is = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(read)));
         int b;
        while ((b = is.read()) != -1) {
                os.write(b);
            }
        is.close();

      
    }
    
    public static void zad2(String sciezka){
        File file=new File(sciezka);
        boolean b=file.isDirectory();
        if(b){//jest katalogiem
            System.out.println(file.listFiles());
        }
        else{//jest plikiem
            System.out.println("Wielkosc:"+file.length()+"\n");
            System.out.println("Nazwa:"+file.getName()+"\n");
            System.out.println("Ostatnia modyfikacja:"+file.lastModified()+"\n");
            
           
        }
    }
    public static void zad3(String sciezka){
        FileReader in = null;
        File read = new File(sciezka);
      

        try {
            in = new FileReader(read);
            BufferedReader br = new BufferedReader(in);
            int znaki=0;
            int linie=0;
            int i;
            String s;
            while (-1 != (i = br.read())) {
               znaki++;
            }
            br.close();
            BufferedReader br2 = new BufferedReader(in);
            while (null != (s = br2.readLine())) {
                linie++;
            }
            br2.close();
            in.close();
            System.out.println("Znaki:"+znaki+"\n"+"Linie:"+linie);


        } catch (IOException ex) {
            System.out.println("BRAK SCIEZKI");
        }
    }
    

    public static void main(String[] args) throws IOException {
        //copy("talesofsecret", "OUT.txt");
        //copy2("talesofsecret", "OUT2.txt");
        //copy3("talesofsecret", "OUT3.txt");
        //zadanie("talesofsecret", "OUT4.txt");
       // //zadanie2("talesofsecret", "OUT5.txt");
        zad2("talesofsecret");
        zad2("src");
        zad3("talesofsecret");
    }

}
