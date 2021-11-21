package Czat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket( 8189);
        Socket incoming= s.accept();
        
        

        InputStream inStream = incoming.getInputStream();
        OutputStream outStream = incoming.getOutputStream();

        Scanner in = new Scanner(inStream);
        PrintWriter out = new PrintWriter(outStream, true /*autoFlush */);
        out.println("You connected with " + incoming.getLocalSocketAddress());
        out.println("Enter bye to exit");
        boolean bye = false;
        while (in.hasNextLine()&&!bye) {
            String line = in.nextLine();
            System.out.println(line);
            
//            if (line.trim().equals("bye")) {
//                bye = true;
//            }
        }

    }

}
