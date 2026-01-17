//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//public class Main1 extends Application {
//
//    @Override
//    public void start(Stage stage) {
//        Label prompt = new Label("Enter your name");
//        TextField input = new TextField();
//        Label output = new Label();
//        Button btn = new Button("Submit");
//
//        btn.setOnAction(e -> {
//            String name = input.getText().trim();
//            if (name.isEmpty()) {
//                output.setText("please enter your name");
//            } else {
//                output.setText("Hello " + name + " Welcome to fx");
//            }
//        });
//
//    }
//    public static void main(String[] args){
//        launch();
//    }
//}
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main1 extends Application {
    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(new Label("Hello JavaFX"), 200, 100));
        stage.show();
    }
    public static void main(String[] args){ launch(); }
}
