package com.cs.controller.config.dashboard.base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.controller.base.config.standard.BaseController;

@RestController
@RequestMapping("/configs")
public class DashboardController extends BaseController {
  
  @GetMapping
  @RequestMapping("/getValue")
  public  String execute()
  {
    return "Hello World! Abhay Here...";
  }
}
