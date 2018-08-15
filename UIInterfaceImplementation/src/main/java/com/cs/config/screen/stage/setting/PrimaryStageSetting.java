package com.cs.config.screen.stage.setting;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import com.cs.config.constants.UIConstants;

import javafx.stage.Stage;

public class PrimaryStageSetting {
  
  public static void setPrimaryStageSetting(Stage primary)
  {
    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    primary.setWidth(gd.getDisplayMode().getWidth());
    primary.setWidth(gd.getDisplayMode().getHeight());
    primary.setFullScreen(true);
    primary.setTitle(UIConstants.PROJECT_NAME);
  }
}
