package com.codeclan.example.babyapp.models;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name="feeds")
public class Feed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private LocalTime time;
    @Column
    private double volume;

    @ManyToOne
    @JoinColumn(name="baby_id")
    private Baby baby;

    public Feed() {
    }

    public Feed(LocalTime time, double volume, Baby baby) {
        this.time = time;
        this.volume = volume;
        this.baby = baby;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
