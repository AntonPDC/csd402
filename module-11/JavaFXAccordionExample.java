import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXAccordionExample extends Application {  // Extend Application

    @Override
    public void start(Stage primaryStage) {  //  Properly override start()
        // Create an Accordion
        Accordion accordion = new Accordion();

        // Create three TitledPanes (collapsible sections)
        TitledPane section1 = new TitledPane("Section 1", new Label("This is content for Section 1"));
        TitledPane section2 = new TitledPane("Section 2", new Label("This is content for Section 2"));
        TitledPane section3 = new TitledPane("Section 3", new Label("This is content for Section 3"));

        // Add sections to the Accordion
        accordion.getPanes().addAll(section1, section2, section3);

        // Label to show selected section
        Label selectionLabel = new Label("Select a section");

        // Update the label when a section is selected
        accordion.expandedPaneProperty().addListener((obs, oldPane, newPane) -> {
            if (newPane != null) {
                selectionLabel.setText("You selected: " + newPane.getText());
            } else {
                selectionLabel.setText("Select a section");
            }
        });

        // Layout
        VBox vbox = new VBox(10, accordion, selectionLabel);
        Scene scene = new Scene(vbox, 400, 300);

        // Stage setup
        primaryStage.setTitle("JavaFX Accordion Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  //  Use launch() properly
    }
}
