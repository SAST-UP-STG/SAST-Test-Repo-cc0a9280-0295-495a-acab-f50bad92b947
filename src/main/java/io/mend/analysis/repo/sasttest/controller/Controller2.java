package io.mend.analysis.repo.sasttest.controller;

import io.mend.analysis.repo.sasttest.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller2")
public class Controller2 {

  @Autowired private Service1 service1;

  @GetMapping("/logDebugUserInput")
  public String logDebugUserInput(String userInput) {
    return service1.logDebugUserInput(userInput);
  }
}
