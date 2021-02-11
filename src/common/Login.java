package common;

import client.Client;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;



public class Login {
    public Client login(AnchorPane idLogin, AnchorPane idChat, TextField txtUsername){
        String user = txtUsername.getText();
        Client client = new Client(user);

        idLogin.setVisible(false);
        idChat.setVisible(true);

        return client;
    }
}
