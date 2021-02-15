package common;


import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Chat extends  Thread{
    private Label areaChat;
    private Socket socket;
    private BufferedReader canalentrada;

    public Chat(Label areaChat){
        try {
            socket = new Socket("localhost", 1234);
            this.areaChat = areaChat;
            canalentrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(true){
            String message = null;
            try {
                message = canalentrada.readLine();
                //areaChat.setText(message);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
