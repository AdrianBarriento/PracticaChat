package view;

import client.Client;
import common.Chat;
import common.Login;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;



public class Controller {

    //ids del panel de login (pane, textfield y su boton)
    public Button btnLogin;
    public TextField txtUsername;
    public AnchorPane paneLogin;

    //ids del chat(pane, textfield del mensaje para enviar y su boton)
    public AnchorPane paneChat;
    public TextField txtInput;
    public Button btnSend;
    public TextArea areaChat;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes

    private Client client;
    private Chat chat = new Chat(areaChat);

    public void login(MouseEvent mouseEvent){
        client = new Login().login(paneLogin, paneChat, txtUsername);
<<<<<<< Updated upstream
        chat.start();
    }

    public void sendMessage(){
        String message = client.sendMessage(txtInput, areaChat);
        areaChat.appendText(message + "\n");
=======
        new Chat(areaChat, client.canalentrada).start();
    }

    public void sendMessage(){
        client.sendMessage(txtInput);
>>>>>>> Stashed changes
        System.out.println(client.getUsername());


    }
}
