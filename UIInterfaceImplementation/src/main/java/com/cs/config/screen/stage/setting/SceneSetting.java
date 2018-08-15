package com.cs.config.screen.stage.setting;

import com.cs.config.background.colour.BackrgroundColor;
import com.cs.config.constants.CSSConstants;
import com.cs.config.constants.UIConstants;
import com.cs.config.screen.dashbaord.DashboardScreen;
import com.cs.config.screen.utility.DashboardUtils;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SceneSetting {
  
  public static void setSceneSetting(Stage primaryStage) throws Exception
  {
    Group group = new Group();
    GridPane gridPane = new GridPane();
    group.getChildren().add(gridPane);
    DashboardScreen.setDisplayDashboard(gridPane);
    Scene scene = new Scene(group, BackrgroundColor.getBackgroundColor());
    String resourceLoaderPath = new DashboardUtils().getResourceLoaderPathForCSS(UIConstants.CSS_PATH + CSSConstants.BUTTON_CSS_FILE_PATH);
    scene.getStylesheets().add(resourceLoaderPath);
    primaryStage.setScene(scene);
  }
}
