package com.example.hospital.Model;

import javax.persistence.*;

@Entity
@Table (name = "patient")
@SuppressWarnings("ALL")

public class patient {
   @Id
   @Column(name="patient_id")
   private Long patient_id;
   @Column(name="name")
   private String name;
   @Column(name="age")
   private Long age;
   @Column(name="gender")
   private String gender;
   @Column(name="tel")
   private Long tel;
   @Column(name="sicknessdetails")
   private String sicknessdetails;

   @ManyToOne
   private ward ward;
   public patient(Long patient_id, String name, Long age, String gender, Long tel, String sicknessdetails) {
      this.patient_id = patient_id;
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.tel = tel;
      this.sicknessdetails = sicknessdetails;
   }

   public Long getPatient_id() {
      return patient_id;
   }

   public void setPatient_id(Long patient_id) {
      this.patient_id = patient_id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Long getAge() {
      return age;
   }

   public void setAge(Long age) {
      this.age = age;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public Long getTel() {
      return tel;
   }

   public void setTel(Long tel) {
      this.tel = tel;
   }

   public String getSicknessdetails() {
      return sicknessdetails;
   }

   public void setSicknessdetails(String sicknessdetails) {
      this.sicknessdetails = sicknessdetails;
   }

   @Override
   public String toString() {
      return "patient{" +
              "patient_id=" + patient_id +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", gender='" + gender + '\'' +
              ", tel=" + tel +
              ", sicknessdetails='" + sicknessdetails + '\'' +
              '}';
   }
}
