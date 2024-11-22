package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class botonXApp implements Initializable {
    
    @FXML
    private Button botoncerrar;
    
    @FXML
    private void cerrarApp(ActionEvent action) {
        System.out.println("[!] Adiosss!");
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //ss
    }
    
}
