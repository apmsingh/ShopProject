package com.cs.model.config.base;

public class ConfigModel implements IConfigModel {
  
  private static final long serialVersionUID = 1L;
  
  protected String          id;
  
  @Override
  public String getId()
  {
    return id;
  }
  
  @Override
  public void setId(String id)
  {
    this.id = id;
  }
  
}
