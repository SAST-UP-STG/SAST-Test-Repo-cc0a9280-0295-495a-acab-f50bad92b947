package io.mend.analysis.repo.sasttest.controller;

import io.mend.analysis.repo.sasttest.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller1")
public class Controller1 {

  @Autowired private Service1 service1 = new Service1();

  @GetMapping("/hello")
  public String hello() {
    return "Hello world";
  }

  @GetMapping("/logInfoUserInput")
  public String logInfoUserInput(
      @RequestParam(value = "userInput", required = true) String userInput) {
    return service1.logInfoUserInput(userInput);
  }
}
