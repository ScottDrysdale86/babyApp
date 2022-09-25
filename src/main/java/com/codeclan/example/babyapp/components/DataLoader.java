package com.codeclan.example.babyapp.components;

import com.codeclan.example.babyapp.models.Baby;
import com.codeclan.example.babyapp.models.Feed;
import com.codeclan.example.babyapp.models.Sleep;
import com.codeclan.example.babyapp.models.SleepType;
import com.codeclan.example.babyapp.repositories.BabyRepository;
import com.codeclan.example.babyapp.repositories.FeedRepository;
import com.codeclan.example.babyapp.repositories.SleepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

//@Component
public class DataLoader implements ApplicationRunner {
    public DataLoader() {
    }

    @Autowired
    BabyRepository babyRepo;

    @Autowired
    SleepRepository sleepRepo;

    @Autowired
    FeedRepository feedRepo;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Baby jacob = new Baby("Jacob", LocalDate.of(2020, Month.JUNE, 13));
        babyRepo.save(jacob);
        Baby georgia = new Baby("Georgia", LocalDate.of(2022, Month.FEBRUARY, 21));
        babyRepo.save(georgia);
        Feed feed1 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 24, 13, 55)),6.5,jacob);
        feedRepo.save(feed1);
        Feed feed2 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 24, 17, 55)),6.5,jacob);
        feedRepo.save(feed2);
        Feed feed3 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 24, 21, 55)),6.5,jacob);
        feedRepo.save(feed3);
        Feed feed4 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 24, 3, 55)),6.5,jacob);
        feedRepo.save(feed4);


        Sleep sleep1 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 24, 8, 55)),(LocalDateTime.of(2022, Month.SEPTEMBER, 24, 9, 55)), SleepType.NAP, georgia);
        sleepRepo.save(sleep1);
        Sleep sleep2 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 24, 12, 30)),(LocalDateTime.of(2022, Month.SEPTEMBER, 24, 14, 01)), SleepType.NAP, georgia);
        sleepRepo.save(sleep2);
        Sleep sleep3 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 24, 17, 00)),(LocalDateTime.of(2022, Month.SEPTEMBER, 24, 17, 30)), SleepType.NAP, georgia);
        sleepRepo.save(sleep3);
        Sleep sleep4 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 24, 19, 30)),(LocalDateTime.of(2022, Month.SEPTEMBER, 25, 05, 00)), SleepType.NIGHT, georgia);
        sleepRepo.save(sleep4);
    }
}
