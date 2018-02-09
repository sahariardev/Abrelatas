package com.sahariar.abrelatas;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Driver extends Application {

	private Stage primaryStage;
	private BorderPane borderpane;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage=primaryStage;
		this.primaryStage.setTitle("Abrelatas");
		showMainView();
	}
	public void showMainView()
	{
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation(Driver.class.getResource("view/main.fxml"));
		try {
			borderpane=loader.load();
			Scene scene=new Scene(borderpane);
			borderpane.setBackground(Background.EMPTY);
			scene.setFill(Color.TRANSPARENT);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.setAlwaysOnTop(true);
			Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
			primaryStage.setX(primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() - 500);
			primaryStage.setY(primaryScreenBounds.getMinY() + primaryScreenBounds.getHeight()-80);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
