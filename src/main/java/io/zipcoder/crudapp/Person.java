package io.zipcoder.crudapp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;

   private String firstName;
   private String lastName;

   public Person() {
   }

   public Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }

   public Integer getId() {
      return id;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
}