package com.codeclan.example.babyapp.models;

public enum SleepType {
    NAP("Nap"),
    NIGHT("Night");

    private final String sleepType;

    SleepType(String sleepType) {
        this.sleepType = sleepType;
    }

    public String getSleepType() {
        return sleepType;
    }

}
