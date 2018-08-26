package com.cs.model.config.base;

import com.cs.model.config.dashboard.base.IModel;

public interface IConfigModel extends IModel {
  
  public static final String ID = "id";
  
  public String getId();
  public void setId(String id);
  
}
