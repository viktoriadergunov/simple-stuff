package application;

import java.beans.EventHandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	//Desktopgröße herausnehmen
Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
	@Override
	public void start(Stage primaryStage) {
		try {
			// Root Node -Layout der Scene
			// Alle Elemente werden horizontal angerichtet HBox= Layoutcontainer
			HBox root = new HBox();
			root.setPrefSize(340.0, 70.0);
			root.setSpacing(10.0);
			root.setAlignment(Pos.CENTER);
			// Elemente erstellen
			Button bt1 = new Button();
			Button bt2 = new Button();
			Button bt3 = new Button();
			Button bt4 = new Button();
			Button bt5 = new Button();

			// CSS zum Button hinzufügen
			bt1.getStyleClass().add("bt1");
			bt2.getStyleClass().add("bt2");
			bt3.getStyleClass().add("bt3");
			bt4.getStyleClass().add("bt4");
			bt5.getStyleClass().add("bt5");

			// Größe
			bt1.setPrefSize(64.0, 64.0);
			bt2.setPrefSize(64.0, 64.0);
			bt3.setPrefSize(64.0, 64.0);
			bt4.setPrefSize(64.0, 64.0);
			bt5.setPrefSize(64.0, 64.0);

			// Elemente zum root Node hinzufügen
			root.getChildren().add(bt1);
			root.getChildren().add(bt2);
			root.getChildren().add(bt3);
			root.getChildren().add(bt4);
			root.getChildren().add(bt5);
			// Elemente klickbar machen - Eventhandling
			bt1.setOnAction(new javafx.event.EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					getHostServices().showDocument("https://www.youtube.com/");

				}
			});

			bt2.setOnAction(new javafx.event.EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					getHostServices().showDocument("https://moodle.htw-berlin.de/");

				}
			});
			bt3.setOnAction(new javafx.event.EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					getHostServices().showDocument("https://www.netflix.com/");

				}
			});
			bt4.setOnAction(new javafx.event.EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					getHostServices().showDocument("https://www.amazon.com/");

				}
			});
			bt5.setOnAction(new javafx.event.EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					System.exit(0);
					
				}
			});
			// Scene erstellen
			Scene scene = new Scene(root);
			scene.setFill(Color.TRANSPARENT);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			//Position Desktop
			primaryStage.setX((screenSize.getWidth()/2)-280 ); //X Position
			primaryStage.setY(20.0);
			//Stage transparent
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
