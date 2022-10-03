package com.codeclan.example.babyapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="babies")
public class Baby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate birthdate;

    @OneToMany(mappedBy = "baby")
    @JsonIgnoreProperties({"baby"})
    private List<Sleep> sleeps;

    @OneToMany(mappedBy = "baby")
    @JsonIgnoreProperties({"baby"})
    private List<Feed> feeds;
    @OneToMany(mappedBy = "baby")
    @JsonIgnoreProperties({"baby"})
    private List<Temperature> temperatures;


    public Baby() {
    }

    public Baby(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.sleeps = new ArrayList<>();
        this.feeds = new ArrayList<>();
        this.temperatures = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public List<Sleep> getSleeps() {
        return sleeps;
    }

    public void setSleeps(List<Sleep> sleeps) {
        this.sleeps = sleeps;
    }

    public List<Temperature> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(List<Temperature> temperatures) {
        this.temperatures = temperatures;
    }

    public List<Feed> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<Feed> feeds) {
        this.feeds = feeds;
    }
}
