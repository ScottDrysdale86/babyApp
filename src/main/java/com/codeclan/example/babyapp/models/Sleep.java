package com.codeclan.example.babyapp.models;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name="sleeps")
public class Sleep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private LocalTime startTime;

    @Column
    private LocalTime endTime;

    @Column(name="sleepType")
    private SleepType sleepType;

    @ManyToOne
    @JoinColumn(name="baby_id")
    private Baby baby;

    public Sleep() {
    }

    public Sleep(Long id, LocalTime startTime, LocalTime endTime, SleepType sleepType, Baby baby) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.sleepType = sleepType;
        this.baby = baby;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public SleepType getSleepType() {
        return sleepType;
    }

    public void setSleepType(SleepType sleepType) {
        this.sleepType = sleepType;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }
}
