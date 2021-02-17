package common;


<<<<<<< Updated upstream
=======
import client.Client;
import javafx.scene.control.Label;
>>>>>>> Stashed changes
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Chat extends  Thread{
    private TextArea areaChat;
    private Socket socket;
    private BufferedReader canalentrada;
    private BufferedReader bufferedReader;

<<<<<<< Updated upstream
    public Chat(TextArea areaChat){
=======
    public Chat(TextArea areaChat, BufferedReader bufferedReader){
>>>>>>> Stashed changes
        try {
            socket = new Socket("localhost", 1234);
            this.bufferedReader = bufferedReader;

        } catch (IOException e) {
            e.printStackTrace();
        }

        this.areaChat = areaChat;
    }

    /*@Override
    public void run() {
<<<<<<< Updated upstream
        String message;
        try {
            while((message = canalentrada.readLine()) != null){
                System.out.println("Mensaje chat: " + message);
                areaChat.appendText(message + "\n");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }*/
=======
        areaChat.appendText("inicio" + "\n");

            String message = "";
            try {
                areaChat.appendText("try" + "\n");

                message = bufferedReader.readLine();

                areaChat.appendText(message + " \n");

                System.out.println(message + "esto es de la clase chat");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
>>>>>>> Stashed changes
}
