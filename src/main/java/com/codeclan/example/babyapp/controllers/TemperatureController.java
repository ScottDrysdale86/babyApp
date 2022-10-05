package com.codeclan.example.babyapp.controllers;
import com.codeclan.example.babyapp.models.Temperature;
import com.codeclan.example.babyapp.repositories.TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TemperatureController {
    @Autowired
    TemperatureRepository tempRepo;

    //    get all feeds
    @GetMapping(value="/temperatures")
    public ResponseEntity<List<Temperature>> getAllTemps(){
        return new ResponseEntity<>(tempRepo.findAll(), HttpStatus.OK);
    }

    //    get a feed by id
    @GetMapping(value="/temperatures/{id}")
    public ResponseEntity getTemp(@PathVariable Long id){
        return new ResponseEntity(tempRepo.findById(id),HttpStatus.OK);
    }

    //    add a feed
    @PostMapping(value = "/temperatures")
    public ResponseEntity<Temperature> postTemp(@RequestBody Temperature temp){
        tempRepo.save(temp);
        return new ResponseEntity<>(temp, HttpStatus.CREATED);
    }

    //   update feed
    @PutMapping(value = "/temperatures/{id}")
    public ResponseEntity updateTemp(@RequestBody Temperature temp, @PathVariable Long id){
        tempRepo.save(temp);
        return new ResponseEntity<>(temp,HttpStatus.OK);
    }


    @DeleteMapping(value = "/temperatures/{id}")
    public ResponseEntity deleteTemp(@PathVariable Long id) {
        tempRepo.deleteById(id);
        return new ResponseEntity<>(id,HttpStatus.OK);
    }
}
