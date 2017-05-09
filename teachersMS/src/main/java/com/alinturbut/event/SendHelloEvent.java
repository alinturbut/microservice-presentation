package com.alinturbut.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Alin Turbut on 5/9/2017.
 */
public class SendHelloEvent extends ApplicationEvent {

  /**
   * Create a new ApplicationEvent.
   *
   * @param source the object on which the event initially occurred (never {@code null})
   */
  public SendHelloEvent(Object source) {
    super(source);
  }
}
