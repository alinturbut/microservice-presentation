package com.alinturbut.controller;

import com.alinturbut.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alin Turbut on 5/9/2017.
 */
@RestController
public class TeacherController {
  @Autowired
  private TeacherService teacherService;

  @RequestMapping(value = "/api/sendHello", method = RequestMethod.GET)
  public ResponseEntity<Void> sendHello(@RequestParam("message") String message) {
    teacherService.sendHelloMessageToQueue(message);
    return ResponseEntity.ok().build();
  }
}
