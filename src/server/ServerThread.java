package server;

import client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerThread extends Thread{
    private Socket clientSocket;
    private Client client;
    private ServerSocket server;

    public ServerThread(ServerSocket servidor, Socket socket){
        this.clientSocket =socket;
        this.server = servidor;
    }
    @Override
    public void run() {
        try {
            while(true){
                String cadena = "";
                //Logger.getLogger(ServerThread.class.getName()).log(Level.INFO, "Se ha conectado "+ client.getUsername());
                BufferedReader canalentrada = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter canalsalida = new PrintWriter(clientSocket.getOutputStream(), true);

                cadena = canalentrada.readLine();
                canalsalida.println(cadena);
                Logger.getLogger(ServerThread.class.getName()).log(Level.INFO, "se ha recibido " + cadena);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
