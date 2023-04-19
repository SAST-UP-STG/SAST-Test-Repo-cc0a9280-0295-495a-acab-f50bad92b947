package io.mend.analysis.repo.sasttest.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Model1 {

  public String logInfoUserInput(String userInput, int number) {
    log.info("userInput= {}. number={}", userInput, number);

    return userInput + "-" + number;
  }
}
