//STARTER CODE
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class CalculatorApp extends Application {
 
    @Override
    public void start(Stage stage) {
 
        // Step 1: Create TextFields for input

        TextField firstNumberBox = new TextField();
        firstNumber.setPromptText("Enter First Number");
        TextField secondNumberBox = new TextField();
        secondNumber.setPromptText("Enter Second Number");

        // Step 2: Create Buttons for operations

        Button addition = new Button("Add +");
        Button subtraction = new Button("Subtract -");
        Button multiplication = new Button("Multiply *");
        Button division = new Button("Divide /");

        // Step 3: Create Label for result

        Label resultBox = new Label("Result");

        // Step 4: HBox for buttons

        HBox buttons = new HBox(15);
        buttons.getChildren().addAll(addition, subtraction, multiplication, division);

        // Step 5: VBox main layout

        VBox main =  new VBox(15);
        main.getChildren().addAll(firstNumberBox, secondNumberBox, buttons, resultBox);
       
        // Step 6: Event handling for buttons

        addition.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(firstNumberBox.getText());
                double num2 = Double.parseDouble(secondNumberBox.getText());
                double result = num1 + num2;
                resultBox.setText("Result: " + result);
            }
            catch (NumberFormatException e) {
                resultBox.setText("Error: That is not a number");
            }
        });
        subtraction.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(firstNumberBox.getText());
                double num2 = Double.parseDouble(secondNumberBox.getText());
                double result = num1 - num2;
                resultBox.setText("Result: " + result);
            }
            catch (NumberFormatException e) {
                resultBox.setText("Error: That is not a number");
            }
        });
        multiplication.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(firstNumberBox.getText());
                double num2 = Double.parseDouble(secondNumberBox.getText());
                double result = num1 * num2;
                resultBox.setText("Result: " + result);
            }
            catch (NumberFormatException e) {
                resultBox.setText("Error: That is not a number");
            }
        });
        division.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(firstNumberBox.getText());
                double num2 = Double.parseDouble(secondNumberBox.getText());
                try {   
                    double result = num1 / num2;
                    resultBox.setText("Result: " + result);
                }
                catch (ArithmeticException e) {
                    resultBox.setText("Error, Arithmatic Exception: " + e.getMessage());
                }
            }
            catch (NumberFormatException e) {
                resultBox.setText("Error: That is not a number");
            }
        });

        // Step 7: Create scene and show stage
       
        Scene scene = new Scene(main, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();

    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
 
//TASKS TO COMPLETE(SUBMIT SCREENSHOTS FOR ALL TASKS)
 
//TODO:Enter numbers in the two TextFields.
 
//TODO:Click any operation button to see the result in the Label.
 
//TODO:Test for division by zero. 
 
//TODO:Try entering invalid input (letters) and observe program behavior (optional: you can handle exceptions for invalid input).
 
/* EXPECTED OUTPUT:
Example 1:
 
Input1: 10
Input2: 5
Click '+'
Result: 15.0
 
 
Example 2:
 
Input1: 8
Input2: 0
Click '/'
Result: Error: Division by zero
 
 
Example 3:
 
Input1: 7
Input2: 3
Click '*'
Result: 21.0 */