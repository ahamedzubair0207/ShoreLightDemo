package com.shorelight.studentportal.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "gpa")
    private double gpa;

    @Column(name = "ielts")
    private int ielts;

    @Column(name = "sat")
    private int sat;

    @Column(name = "toefl")
    private int toefl;

    @Column(name = "prequalified")
    private String prequalified;

    @Column(name = "passportVisa")
    private String passportVisa;

    @Column(name = "tuitionStatus")
    private String tuitionStatus;

    public Student() {}

    public Student(long id, String name, String status, double gpa, int ielts, int sat, int toefl, String prequalified, String passportVisa, String tuitionStatus) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.gpa = gpa;
        this.ielts = ielts;
        this.sat = sat;
        this.toefl = toefl;
        this.prequalified = prequalified;
        this.passportVisa = passportVisa;
        this.tuitionStatus = tuitionStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getIelts() {
        return ielts;
    }

    public void setIelts(int ielts) {
        this.ielts = ielts;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public int getToefl() {
        return toefl;
    }

    public void setToefl(int toefl) {
        this.toefl = toefl;
    }

    public String getPrequalified() {
        return prequalified;
    }

    public void setPrequalified(String prequalified) {
        this.prequalified = prequalified;
    }

    public String getPassportVisa() {
        return passportVisa;
    }

    public void setPassportVisa(String passportVisa) {
        this.passportVisa = passportVisa;
    }

    public String getTuitionStatus() {
        return tuitionStatus;
    }

    public void setTuitionStatus(String tuitionStatus) {
        this.tuitionStatus = tuitionStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", gpa=" + gpa +
                ", ielts=" + ielts +
                ", sat=" + sat +
                ", toefl=" + toefl +
                ", prequalified='" + prequalified + '\'' +
                ", passportVisa='" + passportVisa + '\'' +
                ", tuitionStatus='" + tuitionStatus + '\'' +
                '}';
    }
}
