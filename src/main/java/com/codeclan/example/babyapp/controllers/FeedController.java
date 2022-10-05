package com.codeclan.example.babyapp.controllers;

import com.codeclan.example.babyapp.models.Baby;
import com.codeclan.example.babyapp.models.Feed;
import com.codeclan.example.babyapp.repositories.BabyRepository;
import com.codeclan.example.babyapp.repositories.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeedController {

    @Autowired
    FeedRepository feedRepo;

//    get all feeds
    @GetMapping(value="/feeds")
    public ResponseEntity<List<Feed>> getAllFeeds(){
        return new ResponseEntity<>(feedRepo.findAll(), HttpStatus.OK);
    }

//    get a feed by id
    @GetMapping(value="/feeds/{id}")
    public ResponseEntity getFeed(@PathVariable Long id){
        return new ResponseEntity(feedRepo.findById(id),HttpStatus.OK);
    }

//    add a feed
    @PostMapping(value = "/feeds")
    public ResponseEntity<Feed> postFeed(@RequestBody Feed feed){
        feedRepo.save(feed);
        return new ResponseEntity<>(feed, HttpStatus.CREATED);
    }

//   update feed
    @PutMapping(value = "/feeds/{id}")
    public ResponseEntity updateFeed(@RequestBody Feed feed, @PathVariable Long id){
        feedRepo.save(feed);
        return new ResponseEntity<>(feed,HttpStatus.OK);
    }


    @DeleteMapping(value = "/feeds/{id}")
    public ResponseEntity deleteFeed(@PathVariable Long id) {
        feedRepo.deleteById(id);
        return new ResponseEntity<>(id,HttpStatus.OK);
    }
}
