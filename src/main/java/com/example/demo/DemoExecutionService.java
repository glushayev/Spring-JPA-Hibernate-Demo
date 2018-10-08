package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 10/1/2018.
 */
@Component
public class DemoExecutionService {

   @Autowired
   public UserRepository userRepository;

   public void run() {
      User user = new User("name", "+3800000000",
            "email@email.com", Salary.of(1000L), new ArrayList<Skill>(0));

      User savedUser = userRepository.save(user);

      List<User> byPhone = userRepository.findByPhoneNumber("+3800000000");
   }
}
