package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label labelText;
    @FXML
    private Button btnButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void clicouBotao(javafx.event.ActionEvent actionEvent) {
        labelText.setText("Ola Mundo!");
    }
}