package com.codeclan.example.babyapp.repositories;

import com.codeclan.example.babyapp.models.Feed;
import com.codeclan.example.babyapp.models.Sleep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SleepRepository extends JpaRepository<Sleep, Long> {

}
