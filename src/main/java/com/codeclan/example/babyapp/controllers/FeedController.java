package com.codeclan.example.babyapp.controllers;

import com.codeclan.example.babyapp.models.Baby;
import com.codeclan.example.babyapp.models.Feed;
import com.codeclan.example.babyapp.repositories.BabyRepository;
import com.codeclan.example.babyapp.repositories.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeedController {

    @Autowired
    FeedRepository feedRepo;

    @GetMapping(value="/feeds")
    public ResponseEntity<List<Feed>> getAllFeeds(){
        return new ResponseEntity<>(feedRepo.findAll(), HttpStatus.OK);
    }
}
