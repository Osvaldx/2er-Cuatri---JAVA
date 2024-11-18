package jdkproyect;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JDKProyect extends Application{

    public static void main(String[] args) {
        JDKProyect.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Agregar codigo para Stage, Scene y Scene graph
        
        Text texto = new Text("Hola JAVAFX");
        
        GridPane panel = new GridPane();
        
        panel.setAlignment(Pos.CENTER);
        
        panel.setStyle("-fx-background-color: BEIGE");
        
        panel.add(texto, 0, 0);
        
        // Crear un grupo
//        Group group = new Group();
        
        // Crear una escena pasando el grupo, alto y ancho
        Scene scene = new Scene(panel, 600,300);
        
        // Establecezco el titulo de la scene
        stage.setTitle("Titulo de la ventana");
        
        // Agregar la scene al escenario
        stage.setScene(scene);
        
        // Mostrar el contenido del escenario
        stage.show();
    }
    
}
