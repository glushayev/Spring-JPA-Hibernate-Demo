package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 10/2/2018.
 */
@RestController
public class DemoExecutorController {

   @Autowired
   private DemoExecutionService service;

   @GetMapping("/run")
   public void run(){
      service.run();
   }
}
