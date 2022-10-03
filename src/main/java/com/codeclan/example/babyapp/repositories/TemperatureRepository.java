package com.codeclan.example.babyapp.repositories;

import com.codeclan.example.babyapp.models.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureRepository extends JpaRepository<Temperature, Long> {
}
