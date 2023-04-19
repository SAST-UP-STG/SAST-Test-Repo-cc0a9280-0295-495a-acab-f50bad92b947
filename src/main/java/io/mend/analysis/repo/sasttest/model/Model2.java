package io.mend.analysis.repo.sasttest.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Model2 {

  public String logDebugUserInput(String userInput) {
    log.debug("userInput= {}", userInput);

    return userInput;
  }
}
