package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class interfazGraficaController implements Initializable {
    
    @FXML
    private Label textolucas;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me");
        if(!textolucas.getText().equals("lucas")) {
            textolucas.setText("lucas");
        }
        else {
            textolucas.setText("");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
}
