import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;


public class Main2 extends Application {


    @Override
    public void start(Stage stage){
        Label label= new Label("Enter your name");
        label.setStyle("-fx-text-fill: blue; -fx-background-color: pink;");

        TextField textField = new TextField();
        textField.setStyle("-fx-background-color:green; -fx-text-fill: white;");

        Button btn= new Button("Submit");
        btn.setStyle("-fx-background-color: purple; -fx-text-fill: green;");

        btn.setOnAction(e->{
            String name=textField.getText();
            label.setText("Hello! "+name+" ");
        });

        VBox root = new VBox(10, label, textField, btn);
        root.setStyle("-fx-background-color: white;");

        Scene scene= new Scene(root,300,200);
        stage.setTitle("Hello Welcome");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
