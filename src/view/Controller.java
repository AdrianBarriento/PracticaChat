package view;

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


    public void login(MouseEvent mouseEvent){
        new Login().login(paneLogin, paneChat, txtUsername);
    }
}
