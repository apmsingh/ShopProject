package com.cs.model.config.dashbaord;

import com.cs.model.config.base.ConfigModel;

public class GetDashboardModel extends ConfigModel implements IGetDashboardModel {
  
  private static final long serialVersionUID = 1L;
  protected String          label;
  
  @Override
  public String getLabel()
  {
    return label;
  }
  
  @Override
  public void setLabel(String label)
  {
    this.label = label;
  }
  
}
