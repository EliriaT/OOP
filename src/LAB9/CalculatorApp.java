package lab9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CalculatorApp extends Application {
    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Enter 2 numbers");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label firstNumLabel = new Label("First Number:");
        grid.add(firstNumLabel, 0, 1);

        TextField firstNum = new TextField();
        grid.add(firstNum, 1, 1);

        Label secondNumLabel = new Label("Second Number:");
        grid.add(secondNumLabel, 0, 2);

        TextField secondNum = new TextField();
        grid.add(secondNum, 1, 2);

        Label resultLabel = new Label("Result:");
        grid.add(resultLabel, 0, 4);

        TextField resultNum = new TextField();
        grid.add(resultNum, 1, 4);

        Button division = new Button("Division");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(division);
        grid.add(hbBtn, 1, 3);

        Controller.handleExceptions(firstNum,secondNum,resultNum,division);

        Scene scene = new Scene(grid, 300, 275);
        stage.setScene(scene);
        stage.setTitle("Division of 2 numbers");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}