package com.codeclan.example.babyapp.controllers;

import com.codeclan.example.babyapp.models.Baby;
import com.codeclan.example.babyapp.repositories.BabyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BabyController {

    @Autowired
    BabyRepository babyRepo;

    @GetMapping(value="/babies")
    public ResponseEntity<List<Baby>> getAllBabies(){
        return new ResponseEntity<>(babyRepo.findAll(), HttpStatus.OK);
    }
}
