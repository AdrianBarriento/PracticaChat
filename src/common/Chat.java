package common;


import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Chat extends  Thread{
    private TextArea areaChat;
    private Socket socket;
    private BufferedReader canalentrada;

    public Chat(TextArea areaChat){
        try {
            socket = new Socket("localhost", 1234);
            this.areaChat = areaChat;
            canalentrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*@Override
    public void run() {
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
}
