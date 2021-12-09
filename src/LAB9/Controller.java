package lab9;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public static void handleExceptions(TextField numOne, TextField numTwo, TextField result, Button division) {

        division.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e) {

                try {
                    calculate(numOne, numTwo, result);
                } catch (UnluckyException unlucky) {
                    result.setText(unlucky.getMessage());
                } catch (ArithmeticException arithmeticException) {
                    result.setText("Please do not divide by 0");
                } catch (NumberFormatException invalidFormat) {
                    result.setText("Please provide correct input");
                }
            }
        });
    }

    private static void calculate(TextField numOne, TextField numTwo, TextField result) throws UnluckyException{
        float firstNum, secondNum, resultFloat;

        firstNum = Float.parseFloat(numOne.getText());
        secondNum = Float.parseFloat(numTwo.getText());

        if (secondNum == 13.0) {
            throw new UnluckyException();
        }

        if(secondNum == 0){
            throw new ArithmeticException();
        }

        resultFloat = firstNum / secondNum;

        result.setText(String.valueOf(resultFloat));
    }
}