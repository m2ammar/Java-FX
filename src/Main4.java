import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main4 extends Application{

    @Override
    public void start(Stage stage){
        //create a simple button
        Button btn = new Button("Click Me");
        btn.setOnAction(e ->btn.setText("Hello JavaFx 21"));//work assign

        //layout container
        StackPane root = new StackPane(btn);

        //create a scene
        Scene scene =new Scene(root,400, 250);


        //setup stage
        stage.setTitle("JavaFx 21 - HelloFx Wxample");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();//essential
    }
}
