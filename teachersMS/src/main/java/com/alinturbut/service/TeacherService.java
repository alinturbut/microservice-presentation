package com.alinturbut.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alin Turbut on 5/9/2017.
 */
@Service
public class TeacherService {
  private final static String queueName = "university";
  private final static String queueName2 = "login";

  @Autowired
  private RabbitTemplate rabbitTemplate;

  public void sendHelloMessageToQueue(String message) {
    rabbitTemplate.convertAndSend(queueName, message);
    rabbitTemplate.convertAndSend(queueName2, message);
  }
}
