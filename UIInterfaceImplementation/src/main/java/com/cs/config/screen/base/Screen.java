package com.cs.config.screen.base;

import com.cs.config.screen.stage.setting.PrimaryStageSetting;
import com.cs.config.screen.stage.setting.SceneSetting;

import javafx.application.Application;
import javafx.stage.Stage;

public class Screen extends Application {
  
  @Override
  public void start(Stage primaryStage) throws Exception
  {
    PrimaryStageSetting.setPrimaryStageSetting(primaryStage);
    SceneSetting.setSceneSetting(primaryStage);
    primaryStage.show();
  }
  
}
