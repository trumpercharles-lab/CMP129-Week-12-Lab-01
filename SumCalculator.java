import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SumCalculator extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create two TextFields for input
        TextField num1Field = new TextField();
        num1Field.setPromptText("Enter first number");
        TextField num2Field = new TextField();
        num2Field.setPromptText("Enter second number");
        // Create a TextField to display the result
        TextField resultField = new TextField();
        resultField.setEditable(false); // Make the result field read-only
        // Create a Button to calculate the sum
        Button calculateButton = new Button("Calculate Sum");
        // Add an event handler for the button
        calculateButton.setOnAction(event -> {
        try {
            // Parse numbers from the text fields
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            // Calculate the sum and display it in the result field
            resultField.setText(String.valueOf(num1 + num2));
        } catch (NumberFormatException e) {
            // Handle invalid input
            resultField.setText("Invalid input!");
        }
            });
            // Create a VBox layout and add controls
            VBox vbox = new VBox(10, num1Field, num2Field, calculateButton, resultField);
            // Set up the Scene and Stage
            Scene scene = new Scene(vbox, 300, 200);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Sum Calculator");
            primaryStage.show();
        }
        public static void main(String[] args) {
        launch(args);
    }
}