package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "company")
public class User implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column
   private Long id;

   @Column
   private String userName;

   @Column
   private String phoneNumber;

   @Column
   private String userEmail;

   @Column
   private Salary salary;

   @ElementCollection
   private List<Skill> skills = new ArrayList<>(0);

   User() {
   }

   User(String userName, String phoneNumber, String userEmail,
        Salary salary, List<Skill> skills) {
      this.userName = userName;
      this.phoneNumber = phoneNumber;
      this.userEmail = userEmail;
      this.salary = salary;
      this.skills = skills;
   }

   public List<Skill> getSkills() {
      return Collections.unmodifiableList(skills);
   }

   public void addSkill(Skill skill) {
      if (!skills.contains(skill)) {
         skills.add(skill);
      }
   }

   public Double getTotalSkillLevel() {
      return skills.stream()
            .mapToDouble(Skill::getExperience)
            .sum();
   }

   public int getTotalSkillNumber(){
      return skills.size();
   }
}
