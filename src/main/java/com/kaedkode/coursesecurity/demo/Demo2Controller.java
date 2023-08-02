package com.kaedkode.coursesecurity.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller2")
public class Demo2Controller {

  @GetMapping
  public ResponseEntity<String> hello(){
    return ResponseEntity.ok("Hello from demo endpoint");
  }
}
