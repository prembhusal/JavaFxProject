package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	 public Main() {
	        //Optional constructor
	    }
	    @Override
	    public void init() {
	         //By default this does nothing, but it
	         //can carry out code to set up your app.
	         //It runs once before the start method,
	         //and after the constructor.
	    }
	    
	    @Override
	    public void start(Stage primaryStage) {
	        // Creating the Java button
	        final Button button = new Button();
	        // Setting text to button
	        button.setText("Hello World");
	        // Registering a handler for button
	        /*button.setOnAction((ActionEvent event) -> {
	            // Printing Hello World! to the console
	            System.out.println("Hello World!");
	        });*/
	        // Initializing the StackPane class
	        final StackPane root = new StackPane();
	        // Adding all the nodes to the StackPane
	        root.getChildren().add(button);
	        // Creating a scene object
	        final Scene scene = new Scene(root, 300, 250);
	        // Adding the title to the window (primaryStage)
	        primaryStage.setTitle("Hello World!");
	        primaryStage.setScene(scene);
	        // Show the window(primaryStage)
	        primaryStage.show();
	    }
	    @Override
	    public void stop() {
	        //By default this does nothing
	        //It runs if the user clicks the go-away button
	        //closing the window or if Platform.exit() is called.
	        //Use Platform.exit() instead of System.exit(0).
	        //This is where you should offer to save any unsaved
	        //stuff that the user may have generated.
	    }
	 
	    /**
	     * Main function that opens the "Hello World!" window
	     * 
	     * @param args the command line arguments
	     */
	    public static void main(final String[] arguments) {
	        launch(arguments);
	    }
}
