import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main3 extends Application {

    @Override
    public void start(Stage stage){

        Label label= new Label("Enter Numbers");
        label.setStyle("-fx-text-fill: yellow;");

        TextField text=new TextField();
        text.setStyle("-fx-text-fill: black;");

        TextField text1 = new TextField();
        text1.setStyle("-fx-text-fill: black;");

        Button btn= new Button("Add");
        btn.setStyle("-fx-background-color:black; -fx-text-fill: White; -fx-border-radius:2; -fx-text-align: center;");

        btn.setOnAction(e->{
            String s=text.getText();
            String s1=text1.getText();
            if(s.isEmpty() || s1.isEmpty()){
                label.setText("Please Enter both numbers");
                return;
            }else {
                double num = Double.parseDouble(text.getText());
                double num2 = Double.parseDouble(text1.getText());
                double result = num + num2;
                label.setText("Result:" + result);
            }
        });

        VBox root = new VBox(15,label,text,text1,btn);
        root.setStyle("-fx-background-color:pink;");
        root.setAlignment(Pos.CENTER);

        Scene scene =new Scene(root, 200,300);
        stage.setTitle("Hello! Welcome to Ammar's FX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
