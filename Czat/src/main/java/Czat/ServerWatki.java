package Czat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerWatki {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8189);
        
        while(true){
            final Socket socket =serverSocket.accept();
            Thread th=new Thread(new Runnable(){
                public void run(){
                    try{
                        handleSocket();
                    }catch(IOException e){
                        //handle exception
                    }
                }
            });
            th.start();
        }
        
    }
    private static void handleSocket(final Socket socket) throws IOException{
        InputStream inStream = socket.getInputStream();
        OutputStream outStream = socket.getOutputStream();
        
    }
}
