package com.codeclan.example.babyapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
@Entity
@Table(name="temperatures")
public class Temperature {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private LocalDateTime time;
    @Column
    private double temperature;

    @ManyToOne
    @JoinColumn(name="baby_id")
    @JsonIgnoreProperties({"feeds", "sleeps", "temperatures"})
    private Baby baby;

    private double decimals (double input){
        BigDecimal bd = new BigDecimal(input).setScale(2, RoundingMode.HALF_UP);
       double newTemp = bd.doubleValue();
       return newTemp;
    }


    public Temperature() {
    }

    public Temperature( LocalDateTime time, double temperature, Baby baby) {
        this.time = time;
        this.temperature = decimals(temperature);
        this.baby = baby;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }
}
