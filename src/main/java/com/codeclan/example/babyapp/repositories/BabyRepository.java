package com.codeclan.example.babyapp.repositories;

import com.codeclan.example.babyapp.models.Baby;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BabyRepository extends JpaRepository<Baby, Long> {

}
