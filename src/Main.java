import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

//      @Override
//        public void start(Stage stage){
//        //create a simple button
//        Button btn = new Button("Click Me");
//        btn.setOnAction(e ->btn.setText("Hello JavaFx 21"));//work assign
//
//        //layout container
//        StackPane root = new StackPane(btn);
//
//        //create a scene
//        Scene scene =new Scene(root,400, 250);
//
//
//        //setup stage
//        stage.setTitle("JavaFx 21 - HelloFx Wxample");
//        stage.setScene(scene);
//        stage.show();
//    }

    @Override
    public void start(Stage stage) {
        Label prompt = new Label("Enter your name:");
        TextField input = new TextField();
        Label output = new Label();
        Button btn = new Button("Greet Me");

        // Button action
        btn.setOnAction(e -> {
            String name = input.getText().trim();
            if (name.isEmpty()) {
                output.setText("Please enter your name.");
            } else {
                output.setText("Hello, " + name + "! Welcome to JavaFX.");
            }
        });

        VBox root = new VBox(10, prompt, input, btn, output);
        root.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-background-color: lavender;");

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX - IO Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();//essential
    }
}