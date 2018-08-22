package com.cs.config.dashboard.base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configs")
public class DashboardController {
  
  @GetMapping
  @RequestMapping("/getValue")
  public  String getValue()
  {
    return "Hello World! Abhay Here...";
  }
}
