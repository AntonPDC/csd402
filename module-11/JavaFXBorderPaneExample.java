import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXBorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a BorderPane layout
        BorderPane borderPane = new BorderPane();

        // Create UI elements for each region
        Label topLabel = new Label("Top Region: Header");
        Label bottomLabel = new Label("Bottom Region: Footer");
        Button leftButton = new Button("Left Navigation");
        Button rightButton = new Button("Right Sidebar");
        Label centerLabel = new Label("Center Region: Main Content");

        // Set elements in the BorderPane
        borderPane.setTop(new HBox(topLabel));      // Header at Top
        borderPane.setBottom(new HBox(bottomLabel)); // Footer at Bottom
        borderPane.setLeft(leftButton);             // Navigation at Left
        borderPane.setRight(rightButton);           // Sidebar at Right
        borderPane.setCenter(centerLabel);          // Main content at Center

        // Create a Scene
        Scene scene = new Scene(borderPane, 400, 300);

        // Stage setup
        primaryStage.setTitle("JavaFX BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  // Start JavaFX application
    }
}
