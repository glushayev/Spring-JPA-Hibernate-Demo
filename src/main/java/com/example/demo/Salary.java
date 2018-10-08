package com.example.demo;

import java.io.Serializable;

/**
 * Created by User on 10/4/2018.
 */
public class Salary implements Serializable {

   private Long value;

   private Salary(Long value) {
      this.value = value;
   }

   public static Salary of(Long value) {
      if (value == null) throw new NullPointerException();
      if (value < 0) throw new IllegalArgumentException();

      return new Salary(value);
   }

   public Long toLong() {
      return value;
   }
}
