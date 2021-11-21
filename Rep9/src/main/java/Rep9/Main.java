
package Rep9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    
        public static void odczytaj(String sin, String sout) {
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
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            Pracownik P1=new Pracownik("Jan", "Kowalski",10000);
            Pracownik P2=new Pracownik("Jann", "Kowalski",1000);
            Pracownik P3=new Pracownik("Jannn", "Kowalski",20000);
            Pracownik P4=new Pracownik("Jannnn", "Kowalski",13000);
            Pracownik P5=new Pracownik("Jannnnn", "Kowalski",10400);
            Pracownik P6=new Pracownik("Jannnnnn", "Kowalski",10050);
            ArrayManager arr=new ArrayManager(10);
            arr.insert(P1);
            arr.insert(P2);
            arr.insert(P3);
            arr.insert(P4);
            arr.insert(P5);
            arr.insert(P6);
            ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(
                new FileOutputStream("Pracownicy")));
            out.writeObject("Pracownicy");
            out.writeObject(arr);
            out.close();
            
            ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(
                new FileInputStream("Pracownicy")));
            String nag³ówek = (String) in.readObject();
            arr = (ArrayManager) in.readObject();

            

            
    }
    
}
