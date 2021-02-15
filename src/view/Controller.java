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
    public TextArea areaChat = new TextArea();

    private Client client;

    public void login(MouseEvent mouseEvent){
        client = new Login().login(paneLogin, paneChat, txtUsername);
        //new Chat(areaChat).start();
    }

    public void sendMessage(){
        client.sendMessage(txtInput, btnSend);
        System.out.println(client.getUsername());

    }
}
