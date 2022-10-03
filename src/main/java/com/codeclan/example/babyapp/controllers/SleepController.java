package com.codeclan.example.babyapp.controllers;

import com.codeclan.example.babyapp.models.Baby;
import com.codeclan.example.babyapp.models.Feed;
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

//    get all sleep data
    @GetMapping(value="/sleeps")
    public ResponseEntity<List<Sleep>> getAllBabies(){
        return new ResponseEntity<>(sleepRepo.findAll(), HttpStatus.OK);
    }

//    get specific sleep entry
    @GetMapping(value="/sleeps/{id}")
    public ResponseEntity getSleep(@PathVariable Long id){
        return new ResponseEntity(sleepRepo.findById(id),HttpStatus.OK);
    }
//    add a new sleep
    @PostMapping(value = "/sleeps")
    public ResponseEntity<Sleep> postSleep(@RequestBody Sleep sleep){
        sleepRepo.save(sleep);
        return new ResponseEntity<>(sleep, HttpStatus.CREATED);
    }

//update Sleep
    @PutMapping(value = "/sleeps/{id}")
    public ResponseEntity updateFeed(@RequestBody Sleep sleep, @PathVariable Long id){
        sleepRepo.save(sleep);
        return new ResponseEntity<>(sleep,HttpStatus.OK);
    }

    @DeleteMapping(value = "/sleeps/{id}")
    public ResponseEntity deleteFeed(@PathVariable Long id) {
        sleepRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
