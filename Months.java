/**
 * Author: Jude Kallista-Fitzpatrick
 * @author jsk2319@email.vccs.edu
 *Purpose: The application will respond to whichever season the user chooses.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.ArrayList;
import javafx.scene.control.ChoiceDialog;

public class Months extends Application {

    public enum String {
        January, February, March, April, May, June, July, August, September, October, November, December
    }

    @Override
    public void start(Stage primaryStage) {

        while (true) {
            //Establish Array
            ArrayList<String> mChoices = new ArrayList<>();
            mChoices.add(String.January);
            mChoices.add(String.February);
            mChoices.add(String.March);
            mChoices.add(String.April);
            mChoices.add(String.May);
            mChoices.add(String.June);
            mChoices.add(String.July);
            mChoices.add(String.August);
            mChoices.add(String.September);
            mChoices.add(String.October);
            mChoices.add(String.November);
            mChoices.add(String.December);

            //Design text for choice box
            String defaultChoice = mChoices.get(11);
            @SuppressWarnings("unchecked")
            ChoiceDialog choiceDialog = new ChoiceDialog(defaultChoice, mChoices);
            choiceDialog.setTitle("Month");
            choiceDialog.setHeaderText("Select a month.");
            @SuppressWarnings("unchecked")
            Optional<String> result = choiceDialog.showAndWait();
            String choice = result.get();

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText("Season");
            //Possible outcomes
            switch (choice) {
                //If the user chooses a season
                case January:
                    alert.setContentText("Do you want to build a snow man?");
                    break;
                case February:
                    alert.setContentText("Do you want to build a snow man?");
                    break;
                case March:
                    alert.setContentText("Happy Spring days!");
                    break;
                case April:
                    alert.setContentText("Happy Spring days!");
                    break;
                case May:
                    alert.setContentText("Happy Spring days!");
                    break;
                case June:
                    alert.setContentText("Its summer time.");
                    break;
                case July:
                    alert.setContentText("Its summer time.");
                    break;
                case August:
                    alert.setContentText("Its summer time.");
                    break;
                case September:
                    alert.setContentText("Welcome to the foliage season!");
                    break;
                case October:
                    alert.setContentText("Welcome to the foliage season!");
                    break;
                case November:
                    alert.setContentText("Welcome to the foliage season!");
                    break;
                case December:
                    alert.setContentText("Do you want to build a snow man?");
                    break;
                //If no choice is made
                default:
                    alert.setContentText("You have to select a season!");
            }
            alert.showAndWait();
        }
    }
}
