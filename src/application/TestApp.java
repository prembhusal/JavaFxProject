package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button btn = new Button("click me");
		Button exit = new Button("Exit");
		exit.setOnAction(e -> System.exit(0));
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("hello everyone");
			}
		});
		
		VBox vb = new VBox();
		//StackPane sp = new StackPane();
		vb.getChildren().addAll(btn,exit);
		
		Scene scene = new Scene(vb,600,500);
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	public static void main(String [] args) {
		launch(args);
	}
}
