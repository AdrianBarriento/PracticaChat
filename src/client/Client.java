package client;


import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static final String IP_JUANXXIII = "10.10.200.208";

    private Socket cl;
    private String message ="";
    private String eco;
    private PrintWriter canalsalida;
    public BufferedReader canalentrada;
    private String username;

    public Client(){};

    public Client(String username){
        try {
            cl = new Socket("localhost", 1234);
            canalsalida = new PrintWriter(cl.getOutputStream(), true);
            canalentrada = new BufferedReader(new InputStreamReader(cl.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.username = username;


    }

<<<<<<< Updated upstream
    public String sendMessage(TextField txtMessage, TextArea textArea){
=======
    public String sendMessage(TextField txtMessage){
>>>>>>> Stashed changes
        try {
            message = txtMessage.getText();
            System.out.println("mensaje aun sin enviar:  "+message);
            canalsalida.println(message);
            eco = canalentrada.readLine();
            textArea.appendText(eco + "\n");
            System.out.println("eco: "+ eco);
            txtMessage.clear();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return eco;
    }

    public String getUsername() {
        return username;
    }
}
