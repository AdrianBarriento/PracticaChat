package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public void conectarse(){
        try {
            String eco, cadena="";
            Socket cl = new Socket("10.10.200.208", 1234);

            PrintWriter canalsalida = new PrintWriter(cl.getOutputStream(), true);
            BufferedReader canalentrada = new BufferedReader(new InputStreamReader(cl.getInputStream()));
            BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduzca texto...");

            cadena = lectura.readLine();
            canalsalida.println(cadena);
            eco = canalentrada.readLine();
            System.out.println(eco);

            lectura.close();
            canalentrada.close();
            canalsalida.close();
            cl.close();
            System.out.println("conexion cerrada");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
