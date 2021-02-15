package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class  Server {
    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(1234);
            while (true){
                Socket cliente = servidor.accept();
                new ServerThread(servidor, cliente).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
