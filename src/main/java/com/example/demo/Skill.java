package com.example.demo;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by User on 10/4/2018.
 */
@Embeddable
public class Skill implements Serializable {

   private String name;

   private Double experience;

   private Skill(){

   }

   private Skill(String name, Double experience){
      this.name = name;
      this.experience = experience;
   }

   public Skill of(String name, Double experience){
      return new Skill(name, experience);
   }

   public Double getExperience() {
      return experience;
   }

   public String getName(){
      return name;
   }
}
