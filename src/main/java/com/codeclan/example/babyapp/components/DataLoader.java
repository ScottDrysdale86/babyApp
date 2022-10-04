package com.codeclan.example.babyapp.components;

import com.codeclan.example.babyapp.models.*;
import com.codeclan.example.babyapp.repositories.BabyRepository;
import com.codeclan.example.babyapp.repositories.FeedRepository;
import com.codeclan.example.babyapp.repositories.SleepRepository;
import com.codeclan.example.babyapp.repositories.TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

//USed to set up the db for first run. Comment out for all other runs
@Component
public class DataLoader implements ApplicationRunner {
    public DataLoader() {
    }

    @Autowired
    BabyRepository babyRepo;

    @Autowired
    SleepRepository sleepRepo;

    @Autowired
    FeedRepository feedRepo;

    @Autowired
    TemperatureRepository tempRepo;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Baby jacob = new Baby("Jacob", LocalDate.of(2020, Month.JUNE, 13));
        babyRepo.save(jacob);
        Feed feed1 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 07, 23)),5,jacob);
        feedRepo.save(feed1);
        Feed feed2 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 11, 35)),5.5,jacob);
        feedRepo.save(feed2);
        Feed feed3 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 15, 35)),5,jacob);
        feedRepo.save(feed3);
        Feed feed4 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 18, 41)),6,jacob);
        feedRepo.save(feed4);
        Feed feed5 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 7, 15)),7,jacob);
        feedRepo.save(feed5);
        Feed feed6 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 12, 01)),4,jacob);
        feedRepo.save(feed6);
        Feed feed7 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 15, 34)),6.25,jacob);
        feedRepo.save(feed7);
        Feed feed8 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 19, 40)),6,jacob);
        feedRepo.save(feed8);
        Feed feed9 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 7, 00)),6,jacob);
        feedRepo.save(feed9);
        Feed feed10 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 11, 28)),5.5,jacob);
        feedRepo.save(feed10);
        Feed feed11 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 15, 47)),6,jacob);
        feedRepo.save(feed11);
        Feed feed12 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 19, 00)),5.5,jacob);
        feedRepo.save(feed12);

        Sleep sleep1 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 8, 20)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 9, 32)), SleepType.NAP, jacob);
        sleepRepo.save(sleep1);
        Sleep sleep2 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 12, 53)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 14, 06)), SleepType.NAP, jacob);
        sleepRepo.save(sleep2);
        Sleep sleep3 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 17, 05)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 17, 30)), SleepType.NAP, jacob);
        sleepRepo.save(sleep3);
        Sleep sleep4 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 20, 18)),(LocalDateTime.of(2022, Month.OCTOBER, 4, 06, 15)), SleepType.NIGHT, jacob);
        sleepRepo.save(sleep4);

        Sleep sleep5 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 8, 30)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 8, 49)), SleepType.NAP, jacob);
        sleepRepo.save(sleep5);
        Sleep sleep6 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 10, 40)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 11, 13)), SleepType.NAP, jacob);
        sleepRepo.save(sleep6);
        Sleep sleep7 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 13, 05)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 14, 22)), SleepType.NAP, jacob);
        sleepRepo.save(sleep7);
        Sleep sleep8 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 16, 50)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 17, 33)), SleepType.NAP, jacob);
        sleepRepo.save(sleep8);
        Sleep sleep9 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 19, 49)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 05, 56)), SleepType.NIGHT, jacob);
        sleepRepo.save(sleep9);

        Sleep sleep10 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 8, 33)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 9, 38)), SleepType.NAP, jacob);
        sleepRepo.save(sleep10);
        Sleep sleep11 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 12, 02)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 13, 02)), SleepType.NAP, jacob);
        sleepRepo.save(sleep11);
        Sleep sleep12 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 16, 13)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 17, 07)), SleepType.NAP, jacob);
        sleepRepo.save(sleep12);
        Sleep sleep13 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 19, 31)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 06, 55)), SleepType.NIGHT, jacob);
        sleepRepo.save(sleep13);

        Baby georgia = new Baby("Georgia", LocalDate.of(2022, Month.FEBRUARY, 21));
        babyRepo.save(georgia);

        Sleep sleep14 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 8, 20)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 9, 32)), SleepType.NAP, georgia);
        sleepRepo.save(sleep14);
        Sleep sleep15 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 12, 53)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 14, 06)), SleepType.NAP, georgia);
        sleepRepo.save(sleep15);
        Sleep sleep16 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 17, 05)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 17, 30)), SleepType.NAP, georgia);
        sleepRepo.save(sleep16);
        Sleep sleep17 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 20, 18)),(LocalDateTime.of(2022, Month.OCTOBER, 4, 06, 15)), SleepType.NIGHT, georgia);
        sleepRepo.save(sleep17);

        Sleep sleep18 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 8, 30)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 8, 49)), SleepType.NAP, georgia);
        sleepRepo.save(sleep18);
        Sleep sleep19 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 10, 40)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 11, 13)), SleepType.NAP, georgia);
        sleepRepo.save(sleep19);
        Sleep sleep20 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 13, 05)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 14, 22)), SleepType.NAP, georgia);
        sleepRepo.save(sleep20);
        Sleep sleep21 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 16, 50)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 17, 33)), SleepType.NAP, georgia);
        sleepRepo.save(sleep21);
        Sleep sleep22 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 19, 49)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 05, 56)), SleepType.NIGHT, georgia);
        sleepRepo.save(sleep22);

        Sleep sleep23 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 8, 33)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 9, 38)), SleepType.NAP, georgia);
        sleepRepo.save(sleep23);
        Sleep sleep24 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 12, 02)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 13, 02)), SleepType.NAP, georgia);
        sleepRepo.save(sleep24);
        Sleep sleep25 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 16, 13)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 17, 07)), SleepType.NAP, georgia);
        sleepRepo.save(sleep25);
        Sleep sleep26 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 19, 31)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 06, 55)), SleepType.NIGHT, georgia);
        sleepRepo.save(sleep26);


        Temperature temp1 = new Temperature((LocalDateTime.of(2022, Month.OCTOBER, 3, 11, 30)), 34.99, jacob);
        Temperature temp2 = new Temperature((LocalDateTime.of(2022, Month.OCTOBER, 3, 11, 30)), 31.2222, georgia);
        Temperature temp3 = new Temperature((LocalDateTime.of(2022, Month.OCTOBER, 2, 11, 30)), 33.3333, jacob);
        tempRepo.save(temp1);
        tempRepo.save(temp2);
        tempRepo.save(temp3);
    }
}
