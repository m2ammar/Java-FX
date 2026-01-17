import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.event.ActionEvent;


public class Calculator extends Application {

    private TextField textfield = new TextField();
    private long num1=0;
    private String op="";
    private boolean start =true;
    @Override
    public void start(Stage primaryStage) throws Exception{
        textfield.setFont(Font.font(20));//input font
        textfield.setPrefHeight(50);
        textfield.setAlignment(Pos.CENTER_RIGHT);

        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10));//input wali jaga
        stackPane.getChildren().add(textfield);


        //for defining button
        TilePane tile= new TilePane();
        tile.setHgap(10);
        tile.setVgap(10);
        tile.setAlignment(Pos.TOP_CENTER);
        tile.getChildren().addAll(
                createButtonForNumbers("7"),
                createButtonForNumbers("8"),
                createButtonForNumbers("9"),
                createButtonForOperations("/"),
                createButtonForNumbers("4"),
                createButtonForNumbers("5"),
                createButtonForNumbers("6"),
                createButtonForOperations("+"),
                createButtonForNumbers("1"),
                createButtonForNumbers("2"),
                createButtonForNumbers("3"),
                createButtonForOperations("*"),
                createButtonForNumbers("0"),
                createButtonForOperations("-"),
                createButtonForClear("C"),
                createButtonForOperations("=")

        );


        //borderpane define the pop window padding on the stage
        BorderPane root = new BorderPane();
        root.setTop(stackPane);//text at the top
        root.setCenter(tile);

        Scene scene = new Scene(root, 250, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();

    }


    private Button createButtonForNumbers(String ch){
        Button button= new Button(ch);
        button.setFont(Font.font(18));
        button.setPrefSize(50, 50);
        button.setOnAction(this::processNumber);
        return button;
    }


    //reset or refresh
    private Button createButtonForClear(String ch){
        Button button = new Button(ch);
        button.setFont(Font.font(18));
        button.setPrefSize(50,50);
        button.setOnAction(e -> {
            textfield.setText("");
            op="";
            start= true;
                });

        return button;
    }

    private Button createButtonForOperations(String ch) {
        Button button = new Button(ch);
        button.setFont(Font.font(18));
        button.setPrefSize(50, 50);
        button.setOnAction(this::processOperator);//:: connecting this(current method) to nextOperation(processOperator)
        return button;
    }
    private void processOperator(ActionEvent e){
        String value=((Button)e.getSource()).getText();//e.getSource() this gets the button that was clicked. and this (Button) tells java it a buttong
        if(!value.equals("=")) {
            if (!op.isEmpty()) return;
            num1 = Long.parseLong(textfield.getText());
            op = value;
            textfield.setText("");
        }else{
            if(op.isEmpty()) return;

            long num2= Long.parseLong(textfield.getText());
            float result= calculate(num1, num2, op);
            textfield.setText((String.valueOf(result)));
            start=true;
            op="";

        }
    }

    private float calculate(long num1, long num2, String operator){
        switch(operator){
            case"+":return num1+num2;
            case "-":return num1-num2;
            case"*":return num1*num2;
            case"/":
                if(num2==0)
                    return 0;
                return num1/num2;
            default : return 0;
        }
    }

    private void processNumber(ActionEvent e){
        if(start){
            textfield.setText("");
            start=false;
        }
        String value= ((Button)e.getSource()).getText();
        textfield.setText(textfield.getText()+value);
    }

    public static void main(String[] args){
        launch(args);
    }
}
