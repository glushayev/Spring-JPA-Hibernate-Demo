package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

   User findFirstByIdInAndPhoneNumberAndSalaryNotIn(List<Long> ids,
                                                    String phoneNumber,
                                                    List<Long> salary);

   @Query("select d from User d where phoneNumber like ?1")
   List<User> findByPhoneNumber(String phoneNumber);
}
