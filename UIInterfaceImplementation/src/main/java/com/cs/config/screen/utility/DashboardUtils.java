package com.cs.config.screen.utility;

import java.net.URL;

public class DashboardUtils {
  
  public String getResourceLoaderPath(String pathInResource)
  {
    URL resourceURL = new DashboardUtils().getClass().getResource(pathInResource);
    String path  = resourceURL.getPath();
    return path;
  }
  
  public String getResourceLoaderPathForCSS(String pathInResource)
  {
    String path = new DashboardUtils().getClass().getResource(pathInResource).toExternalForm();
    return path;
  }
}
