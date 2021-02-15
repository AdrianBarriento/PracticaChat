package client;


import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private Socket cl;
    private String message ="";
    private String eco;
    public static final String IP_JUANXXIII = "10.10.200.208";


    private String username;

    public Client(){};

    public Client(String username){
        try {
            cl = new Socket("localhost", 1234);
            this.username = username;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String sendMessage(TextField txtMessage, Button btnSend){
        try {
            PrintWriter canalsalida = new PrintWriter(cl.getOutputStream(), true);
            BufferedReader canalentrada = new BufferedReader(new InputStreamReader(cl.getInputStream()));

            message = txtMessage.getText();
            canalsalida.println(message);
            eco = canalentrada.readLine();
            System.out.println(eco);
            txtMessage.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }

    public String getUsername() {
        return username;
    }
}
