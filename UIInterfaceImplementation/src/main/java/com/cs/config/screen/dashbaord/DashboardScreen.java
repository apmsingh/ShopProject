package com.cs.config.screen.dashbaord;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.cs.config.constants.UIConstants;
import com.cs.config.screen.utility.DashboardUtils;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class DashboardScreen {
  
  private static final int  PADDING                     = 20;
  private static final int  NUMBER_OF_COLUMN_FOR_SCREEN = 2;
  static final List<String> SCREEN_PAGES                = new ArrayList<String>()
                                                        {
                                                          
                                                          {
                                                            add(UIConstants.RETAILER);
                                                            add(UIConstants.WAREHOUSE);
                                                            add(UIConstants.PRODUCTION);
                                                            add(UIConstants.EXPENDITURE);
                                                            add(UIConstants.DONATION);
                                                          }
                                                        };
  
  public static void setDisplayDashboard(GridPane gridPane) throws Exception
  {
    
    List<Node> listOfDashboardContent = new ArrayList<>();
    int rowCount = 0;
    int columnCount = 0;
    for (String screenPage : SCREEN_PAGES) {
      ImageView iconButtonImage = getImageFromFilePath(screenPage);
      setIconImageProperty(iconButtonImage);
      Button screenButton = new Button();
      setButtonProperty(iconButtonImage, screenButton, screenPage);
      listOfDashboardContent.add(screenButton);
      if (columnCount > NUMBER_OF_COLUMN_FOR_SCREEN) {
        columnCount = 0;
        rowCount++;
      }
      gridPane.add(screenButton, columnCount++, rowCount);
    }
    gridPane.setHgap(PADDING);
    gridPane.setVgap(PADDING);
  }

  private static void setButtonProperty(ImageView iconButtonImage, Button screenButton, String screenPage)
  {
    screenButton.setGraphic(iconButtonImage);
    screenButton.setTooltip(new Tooltip(screenPage));
    screenButton.setWrapText(true);
  }

  private static void setIconImageProperty(ImageView iconButton)
  {
    iconButton.setFitWidth(250);
    iconButton.setFitHeight(250);
  }

  private static ImageView getImageFromFilePath(String screenPage) throws FileNotFoundException
  {
    DashboardUtils dashboardUtils = new DashboardUtils();
    String resourceLoaderPath = dashboardUtils.getResourceLoaderPath(UIConstants.IMAGES_ICON_PATH);
    File file = new File(resourceLoaderPath + screenPage + UIConstants.PNG_IMAGE_TYPE);
    FileInputStream fileInputStream = new FileInputStream(file);
    Image image = new Image(fileInputStream);
    ImageView iconButton = new ImageView(image);
    return iconButton;
  }
  
}
