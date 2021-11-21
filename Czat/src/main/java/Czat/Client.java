package Czat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 8189);
        InputStream inStream = s.getInputStream();
        OutputStream outStream = s.getOutputStream();

        Scanner in = new Scanner(inStream);
        PrintWriter out = new PrintWriter(outStream, true /*autoFlush */);
       
        System.out.println(in.nextLine());
        System.out.println(in.nextLine());
        
        Threed recive =new Threed(new Runnable()){
            public void run(){
                
            }
        }
        
        Scanner sc=new Scanner(System.in);
        while (true) {
            String line=sc.nextLine();
            out.println(line);
            if (line == "bye") {
                s.close();
                break;
            }
        }
    }
}
