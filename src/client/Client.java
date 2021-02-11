package client;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private Socket cl;
    private String message ="";
    private String eco;

    public Client(){
        try {
            cl = new Socket("10.10.200.208", 1234);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void conectarse(TextField txtMessage, Button btnSend){
        try {
            PrintWriter canalsalida = new PrintWriter(cl.getOutputStream(), true);
            BufferedReader canalentrada = new BufferedReader(new InputStreamReader(cl.getInputStream()));

            while (true){
                message = txtMessage.getText();
                canalsalida.println(message);

                eco = canalentrada.readLine();
                System.out.println(eco);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
