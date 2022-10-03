package com.codeclan.example.babyapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name="sleeps")
public class Sleep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private LocalDateTime startTime;

    @Column
    private LocalDateTime endTime;

    @Column(name="sleepType")
    @Enumerated(EnumType.STRING)
    private SleepType sleepType;

    @ManyToOne
    @JoinColumn(name="baby_id")
    @JsonIgnoreProperties({"feeds", "sleeps", "temperatures"})
    private Baby baby;

    public Sleep() {
    }

    public Sleep(LocalDateTime startTime, LocalDateTime endTime, SleepType sleepType, Baby baby) {
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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
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
