package com.gaynor.testapp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "users"
//        uniqueConstraints = {
//                @UniqueConstraint(columnNames = "trn"),
//                @UniqueConstraint(columnNames = "email")
//        }
//        uniqueConstraints = {@UniqueConstraint(columnNames = {"trn", "email", "mobile_number", "pin"})}
)

public class User {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "mobile_number", unique = true)
    private String mobile_number;

    @Column(name = "trn", unique = true)
    private int trn;

    @Column(name = "id_type")
    private String id_type;

    @Column(name = "dob")
    private String dob;

    @Column(name = "gender")
    private char gender;

    @Column(name = "pin")
    private int pin;

    @Column(name = "pin_type")
    private String pin_type;

    @Column(name = "expires")
    private LocalDateTime expiration_date;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    @Column(name = "account_balance")
    private float accountBalance;

    public User() {
    }

    public User(String first_name, String last_name, String email, String mobile_number, int trn, String id_type, String dob, char gender, int pin, String pin_type, LocalDateTime expiration_date, LocalDateTime created_at, LocalDateTime updated_at) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.mobile_number = mobile_number;
        this.trn = trn;
        this.id_type = id_type;
        this.dob = dob;
        this.gender = gender;
        this.pin = pin;
        this.pin_type = pin_type;
        this.expiration_date = expiration_date;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public int getTrn() {
        return trn;
    }

    public void setTrn(int trn) {
        this.trn = trn;
    }

    public String getId_type() {
        return id_type;
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getPin_type() {
        return pin_type;
    }

    public void setPin_type(String pin_type) {
        this.pin_type = pin_type;
    }

    public LocalDateTime getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(LocalDateTime expiration_date) {
        this.expiration_date = expiration_date;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", trn=" + trn +
                ", id_type='" + id_type + '\'' +
                ", dob='" + dob + '\'' +
                ", gender=" + gender +
                ", pin=" + pin +
                ", pin_type='" + pin_type + '\'' +
                ", expiration_date=" + expiration_date +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
