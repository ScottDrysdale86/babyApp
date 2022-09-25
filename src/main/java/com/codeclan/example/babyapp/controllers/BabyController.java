package com.codeclan.example.babyapp.controllers;

import com.codeclan.example.babyapp.models.Baby;
import com.codeclan.example.babyapp.repositories.BabyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BabyController {

    @Autowired
    BabyRepository babyRepo;

    @GetMapping(value="/babies")
    public ResponseEntity<List<Baby>> getAllBabies(){
        return new ResponseEntity<>(babyRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/babies/{id}")
    public ResponseEntity getBabies(@PathVariable Long id){
        return new ResponseEntity(babyRepo.findById(id),HttpStatus.OK);
    }

    @PostMapping(value = "/babies")
    public ResponseEntity<Baby> postBaby(@RequestBody Baby baby){
        babyRepo.save(baby);
        return new ResponseEntity<>(baby, HttpStatus.CREATED);
    }
}
