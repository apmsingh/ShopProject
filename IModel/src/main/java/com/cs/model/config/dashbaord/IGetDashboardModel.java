package com.cs.model.config.dashbaord;

import com.cs.model.config.base.IConfigModel;

public interface IGetDashboardModel extends IConfigModel {
  
  public static final String LABEL = "label";
  
  public String getLabel();
  public void setLabel(String label);
  
}
