package server;

import com.mysql.cj.log.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerThread extends Thread{
    private Socket cliente;
    private ServerSocket servidor;

    public ServerThread(ServerSocket servidor, Socket socket){
        this.cliente=socket;
        this.servidor = servidor;
    }
    @Override
    public void run() {
        try {
            Logger.getLogger(ServerThread.class.getName()).log(Level.INFO, "Se ha conectado uno");
            BufferedReader canalentrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter canalsalida = new PrintWriter(cliente.getOutputStream(), true);

            String cadena = canalentrada.readLine();
            canalsalida.println(cadena.toUpperCase());
            Logger.getLogger(ServerThread.class.getName()).log(Level.INFO, "se ha recibido " + cadena);

            canalsalida.close();
            canalentrada.close();
            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
