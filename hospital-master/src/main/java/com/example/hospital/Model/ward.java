package com.example.hospital.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ward")
@SuppressWarnings("ALL")
public class ward {
    @Id
    @Column(name="ward_id")
    private Long ward_id;
    @Column(name="ward_name")
    private String ward_name;
    @Column(name="ward_capacity")
    private Long ward_capacity;
    @Column(name="ward_age")
    private Long ward_age;
    @Column(name="gender_category")
    private String gender_category;

    @ManyToMany
    @JoinColumn(name = "doctor_Id")
    private List<Doctor> doctor;

    public ward(Long ward_id, String ward_name, Long ward_capacity, Long ward_age, String gender_category) {
        this.ward_id = ward_id;
        this.ward_name = ward_name;
        this.ward_capacity = ward_capacity;
        this.ward_age = ward_age;
        this.gender_category = gender_category;
    }

    public Long getWard_id() {
        return ward_id;
    }

    public void setWard_id(Long ward_id) {
        this.ward_id = ward_id;
    }

    public String getWard_name() {
        return ward_name;
    }

    public void setWard_name(String ward_name) {
        this.ward_name = ward_name;
    }

    public Long getWard_capacity() {
        return ward_capacity;
    }

    public void setWard_capacity(Long ward_capacity) {
        this.ward_capacity = ward_capacity;
    }

    public Long getWard_age() {
        return ward_age;
    }

    public void setWard_age(Long ward_age) {
        this.ward_age = ward_age;
    }

    public String getGender_category() {
        return gender_category;
    }

    public void setGender_category(String gender_category) {
        this.gender_category = gender_category;
    }

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "ward{" +
                "ward_id=" + ward_id +
                ", ward_name='" + ward_name + '\'' +
                ", ward_capacity='" + ward_capacity + '\'' +
                ", ward_age=" + ward_age +
                ", gender_category='" + gender_category + '\'' +
                ", doctor=" + doctor +
                '}';
    }
}
