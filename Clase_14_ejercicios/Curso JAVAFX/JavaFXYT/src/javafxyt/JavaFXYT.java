package javafxyt;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXYT extends Application{

    public JavaFXYT() {
        System.out.println("Primero se crea el javaFX");
    }
    
    @Override
    public void init() {
        System.out.println("Se preparan los paquetes");
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button();
        
        btn.setText("CLICK ME");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });
        
        Label label = new Label("Hola mundo");
        StackPane root = new StackPane();
        root.getChildren().add(label);
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 400,300);
        
        stage.setScene(scene);
        stage.setTitle("ROBUX GENERATOR | DOWNLOAD FREE 2025");
        stage.show();
    }
    
    @Override
    public void stop() {
        System.out.println("[!] CERRANDO PROGRAMA");
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
