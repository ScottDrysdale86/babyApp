package com.codeclan.example.babyapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="feeds")
public class Feed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private LocalDateTime time;
    @Column
    private double volume;

    @ManyToOne
    @JoinColumn(name="baby_id")
    @JsonIgnoreProperties({"feeds", "sleeps", "temperatures"})
    private Baby baby;

    public Feed() {
    }

    public Feed(LocalDateTime time, double volume, Baby baby) {
        this.time = time;
        this.volume = volume;
        this.baby = baby;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
