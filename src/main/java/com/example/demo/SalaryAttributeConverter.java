package com.example.demo;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by User on 10/4/2018.
 */
@Converter(autoApply = true)
public class SalaryAttributeConverter implements AttributeConverter<Salary, Long> {

   @Override
   public Long convertToDatabaseColumn(Salary attribute) {
      if (attribute == null) {
         return null;
      }
      return attribute.toLong();
   }

   @Override
   public Salary convertToEntityAttribute(Long dbData) {
      if (dbData == null) {
         return null;
      }

      return Salary.of(dbData);
   }
}
