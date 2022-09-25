package com.codeclan.example.babyapp.controllers;

import com.codeclan.example.babyapp.models.Baby;
import com.codeclan.example.babyapp.models.Sleep;
import com.codeclan.example.babyapp.repositories.BabyRepository;
import com.codeclan.example.babyapp.repositories.SleepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SleepController {
    @Autowired
    SleepRepository sleepRepo;

    @GetMapping(value="/sleeps")
    public ResponseEntity<List<Sleep>> getAllBabies(){
        return new ResponseEntity<>(sleepRepo.findAll(), HttpStatus.OK);
    }
}
