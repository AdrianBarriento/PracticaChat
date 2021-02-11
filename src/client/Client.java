package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            String eco, cadena="";
            Socket cl = new Socket("192.168.237.65", 8080);

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
