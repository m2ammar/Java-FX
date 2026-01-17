import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


    public class  CLASS01 extends Application{
        int count = 0;

        @Override
        public void start(Stage stage) {
            Label label = new Label("Count: 0");
            Button button = new Button("Click Me");

            button.setOnAction(e -> label.setText("Count: " + (++count)));

            VBox root = new VBox(15, label, button);
            root.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-background-color: #FFF8DC;");
            Scene scene = new Scene(root, 300, 200);

            stage.setTitle("JavaFX 21 - Click Counter");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch();

    }
}
