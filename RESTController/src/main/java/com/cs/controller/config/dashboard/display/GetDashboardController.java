package com.cs.controller.config.dashboard.display;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.controller.base.config.standard.BaseController;
import com.cs.model.config.base.ConfigModel;

@RestController
@RequestMapping("/config")
public class GetDashboardController extends BaseController {
  
  @PostMapping
  @RequestMapping("/getdashbaord")
  public String execute(@RequestBody ConfigModel configModel)
  {
    return "Hello, This is the place where you get everything " + configModel.getId();
  }
}
