package com.codeclan.example.babyapp.controllers;

import com.codeclan.example.babyapp.models.Baby;
import com.codeclan.example.babyapp.models.Sleep;
import com.codeclan.example.babyapp.repositories.BabyRepository;
import com.codeclan.example.babyapp.repositories.SleepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SleepController {
    @Autowired
    SleepRepository sleepRepo;

    @GetMapping(value="/sleeps")
    public ResponseEntity<List<Sleep>> getAllBabies(){
        return new ResponseEntity<>(sleepRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/sleeps/{id}")
    public ResponseEntity getSleep(@PathVariable Long id){
        return new ResponseEntity(sleepRepo.findById(id),HttpStatus.OK);
    }
    @PostMapping(value = "/sleeps")
    public ResponseEntity<Sleep> postSleep(@RequestBody Sleep sleep){
        sleepRepo.save(sleep);
        return new ResponseEntity<>(sleep, HttpStatus.CREATED);
    }
}
