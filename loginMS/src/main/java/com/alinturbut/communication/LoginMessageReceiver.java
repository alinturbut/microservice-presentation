package com.alinturbut.communication;

import java.util.concurrent.CountDownLatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Alin Turbut on 5/10/2017.
 */
@Component
public class LoginMessageReceiver {
  private static final Logger LOG = LoggerFactory.getLogger(LoginMessageReceiver.class);
  private CountDownLatch latch = new CountDownLatch(1);

  public void receiveMessage(String message) {
    LOG.info("Received message {}", message);
    latch.countDown();
  }

  public CountDownLatch getLatch() {
    return latch;
  }
}
