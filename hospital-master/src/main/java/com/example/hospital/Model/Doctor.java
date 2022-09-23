package com.example.hospital.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="doctor")
@SuppressWarnings("ALL")

public class Doctor {
    @Id
    @Column(name="doctor_id")
    private Long doctor_id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private Long age;
    @Column(name="consult")
    private String consult;
    @Column(name="gender")
    private String gender;
    @Column(name="speciality")
    private String speciality;

    @ManyToMany
    @JoinColumn(name="patient_id")
    private List<patient> patient;

    public Doctor(Long doctor_id, String name, Long age, String consult, String gender, String speciality) {
        this.doctor_id = doctor_id;
        this.name = name;
        this.age = age;
        this.consult = consult;
        this.gender = gender;
        this.speciality = speciality;
    }

    public Long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Long doctor_id) {
        this.doctor_id = doctor_id;
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

    public String getConsult() {
        return consult;
    }

    public void setConsult(String consult) {
        this.consult = consult;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<com.example.hospital.Model.patient> getPatient() {
        return patient;
    }

    public void setPatient(List<com.example.hospital.Model.patient> patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctor_id=" + doctor_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", consult='" + consult + '\'' +
                ", gender='" + gender + '\'' +
                ", speciality='" + speciality + '\'' +
                ", patient=" + patient +
                '}';
    }
}
