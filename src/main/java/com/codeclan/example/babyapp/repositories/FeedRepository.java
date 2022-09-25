package com.codeclan.example.babyapp.repositories;

import com.codeclan.example.babyapp.models.Baby;
import com.codeclan.example.babyapp.models.Feed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepository extends JpaRepository<Feed, Long> {

}
