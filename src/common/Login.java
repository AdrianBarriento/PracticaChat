package common;

import client.Client;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;



public class Login {
    public String login(AnchorPane idLogin, AnchorPane idChat, TextField txtUsername){
        String user = txtUsername.getText();
        Client client = new Client();

        client.conectarse();

        idLogin.setVisible(false);
        idChat.setVisible(true);

        return user;
    }
}
