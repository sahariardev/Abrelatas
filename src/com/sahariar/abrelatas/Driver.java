package com.sahariar.abrelatas;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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
			
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
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
