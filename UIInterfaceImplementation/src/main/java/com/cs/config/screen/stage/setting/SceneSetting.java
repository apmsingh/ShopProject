package com.cs.config.screen.stage.setting;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SceneSetting {
	
	public static void setSceneSetting(Stage primaryStage) {
		Parent parent = new Parent() {
		};
		Scene scene = new Scene(parent, Color.BLUE);
		primaryStage.setScene(scene);
	}
}
