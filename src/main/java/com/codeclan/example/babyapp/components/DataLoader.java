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


        Feed feed1 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 28, 7, 15)),6,jacob);
        feedRepo.save(feed1);
        Feed feed2 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 28, 11, 21)),5.5,jacob);
        feedRepo.save(feed2);
        Feed feed3 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 28, 15, 30)),6,jacob);
        feedRepo.save(feed3);
        Feed feed4 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 28, 19, 10)),5.5,jacob);
        feedRepo.save(feed4);

        Feed feed5 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 29, 7, 11)),7,jacob);
        feedRepo.save(feed5);
        Feed feed6 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 29, 12, 05)),4,jacob);
        feedRepo.save(feed6);
        Feed feed7 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 29, 15, 25)),6.25,jacob);
        feedRepo.save(feed7);
        Feed feed8 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 29, 19, 15)),6,jacob);
        feedRepo.save(feed8);

        Feed feed9 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 30, 07, 23)),5,jacob);
        feedRepo.save(feed9);
        Feed feed10 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 30, 11, 45)),5.5,jacob);
        feedRepo.save(feed10);
        Feed feed11 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 30, 15, 45)),5,jacob);
        feedRepo.save(feed11);
        Feed feed12 = new Feed((LocalDateTime.of(2022, Month.SEPTEMBER, 30, 18, 41)),6,jacob);
        feedRepo.save(feed12);

        Feed feed13 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 7, 00)),6,jacob);
        feedRepo.save(feed13);
        Feed feed14 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 11, 28)),5.5,jacob);
        feedRepo.save(feed14);
        Feed feed15 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 15, 47)),6,jacob);
        feedRepo.save(feed15);
        Feed feed16 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 19, 00)),5.5,jacob);
        feedRepo.save(feed16);

        Feed feed17 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 7, 15)),7,jacob);
        feedRepo.save(feed17);
        Feed feed18 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 11, 45)),4,jacob);
        feedRepo.save(feed18);
        Feed feed19 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 15, 34)),6.25,jacob);
        feedRepo.save(feed19);
        Feed feed20 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 19, 00)),6,jacob);
        feedRepo.save(feed20);

        Feed feed21 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 07, 23)),5,jacob);
        feedRepo.save(feed21);
        Feed feed22 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 11, 35)),5.5,jacob);
        feedRepo.save(feed22);
        Feed feed23 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 15, 35)),5,jacob);
        feedRepo.save(feed23);
        Feed feed24 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 18, 41)),6,jacob);
        feedRepo.save(feed24);


        Feed feed25 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 4, 07, 23)),5,jacob);
        feedRepo.save(feed25);
        Feed feed26 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 4, 11, 35)),5.5,jacob);
        feedRepo.save(feed26);
        Feed feed27 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 4, 15, 35)),5,jacob);
        feedRepo.save(feed27);
        Feed feed28 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 4, 18, 41)),6,jacob);
        feedRepo.save(feed28);

        Sleep sleep0 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 28, 8, 13)),(LocalDateTime.of(2022, Month.SEPTEMBER, 28, 9, 00)), SleepType.NAP, jacob);
        sleepRepo.save(sleep0);
        Sleep sleep1 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 28, 10, 35)),(LocalDateTime.of(2022, Month.SEPTEMBER, 28, 11, 03)), SleepType.NAP, jacob);
        sleepRepo.save(sleep1);
        Sleep sleep2 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 28, 13, 19)),(LocalDateTime.of(2022, Month.SEPTEMBER, 28, 14, 47)), SleepType.NAP, jacob);
        sleepRepo.save(sleep2);
        Sleep sleep3 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 28, 16, 59)),(LocalDateTime.of(2022, Month.SEPTEMBER, 28, 17, 24)), SleepType.NAP, jacob);
        sleepRepo.save(sleep3);
        Sleep sleep4 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 28, 19, 55)),(LocalDateTime.of(2022, Month.SEPTEMBER, 29, 4, 21)), SleepType.NIGHT, jacob);
        sleepRepo.save(sleep4);

        Sleep sleep5 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 29, 8, 17)),(LocalDateTime.of(2022, Month.SEPTEMBER, 29, 8, 50)), SleepType.NAP, jacob);
        sleepRepo.save(sleep5);
        Sleep sleep6 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 29, 13, 20)),(LocalDateTime.of(2022, Month.SEPTEMBER, 29, 14, 56)), SleepType.NAP, jacob);
        sleepRepo.save(sleep6);
        Sleep sleep7 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 29, 17, 5)),(LocalDateTime.of(2022, Month.SEPTEMBER, 29, 17, 40)), SleepType.NAP, jacob);
        sleepRepo.save(sleep7);
        Sleep sleep8 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 29, 19, 50)),(LocalDateTime.of(2022, Month.SEPTEMBER, 30, 5, 48)), SleepType.NIGHT, jacob);
        sleepRepo.save(sleep8);

        Sleep sleep9 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 30, 8, 30)),(LocalDateTime.of(2022, Month.SEPTEMBER, 30, 9, 42)), SleepType.NAP, jacob);
        sleepRepo.save(sleep9);
        Sleep sleep10 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 30, 12, 48)),(LocalDateTime.of(2022, Month.SEPTEMBER, 30, 14, 11)), SleepType.NAP, jacob);
        sleepRepo.save(sleep10);
        Sleep sleep11 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 30, 16, 35)),(LocalDateTime.of(2022, Month.SEPTEMBER, 30, 17, 8)), SleepType.NAP, jacob);
        sleepRepo.save(sleep11);
        Sleep sleep12 = new Sleep((LocalDateTime.of(2022, Month.SEPTEMBER, 30, 19, 39)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 6, 1)), SleepType.NIGHT, jacob);
        sleepRepo.save(sleep12);


        Sleep sleep13 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 8, 50)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 9, 20)), SleepType.NAP, jacob);
        sleepRepo.save(sleep13);
        Sleep sleep14 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 13, 18)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 15, 02)), SleepType.NAP, jacob);
        sleepRepo.save(sleep14);
        Sleep sleep15 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 17, 01)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 17, 27)), SleepType.NAP, jacob);
        sleepRepo.save(sleep15);
        Sleep sleep16 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 19, 50)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 05, 56)), SleepType.NIGHT, jacob);
        sleepRepo.save(sleep16);

        Sleep sleep17 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 8, 33)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 9, 38)), SleepType.NAP, jacob);
        sleepRepo.save(sleep17);
        Sleep sleep18 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 12, 18)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 13, 20)), SleepType.NAP, jacob);
        sleepRepo.save(sleep18);
        Sleep sleep19 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 16, 13)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 17, 07)), SleepType.NAP, jacob);
        sleepRepo.save(sleep19);
        Sleep sleep20 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 19, 31)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 06, 55)), SleepType.NIGHT, jacob);
        sleepRepo.save(sleep20);

        Sleep sleep21 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 8, 30)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 8, 49)), SleepType.NAP, jacob);
        sleepRepo.save(sleep21);
        Sleep sleep22 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 10, 40)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 11, 13)), SleepType.NAP, jacob);
        sleepRepo.save(sleep22);
        Sleep sleep23 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 13, 5)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 14, 22)), SleepType.NAP, jacob);
        sleepRepo.save(sleep23);
        Sleep sleep24 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 16, 50)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 17, 33)), SleepType.NAP, jacob);
        sleepRepo.save(sleep24);
        Sleep sleep25 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 19, 49)),(LocalDateTime.of(2022, Month.OCTOBER, 4, 5, 56)), SleepType.NIGHT, jacob);
        sleepRepo.save(sleep25);

        Sleep sleep26 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 4, 8, 20)),(LocalDateTime.of(2022, Month.OCTOBER, 4, 9, 32)), SleepType.NAP, jacob);
        sleepRepo.save(sleep26);
        Sleep sleep27 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 4, 12, 53)),(LocalDateTime.of(2022, Month.OCTOBER, 4, 14, 6)), SleepType.NAP, jacob);
        sleepRepo.save(sleep27);
        Sleep sleep28 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 4, 17, 5)),(LocalDateTime.of(2022, Month.OCTOBER, 4, 17, 30)), SleepType.NAP, jacob);
        sleepRepo.save(sleep28);
        Sleep sleep29 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 4, 20, 18)),(LocalDateTime.of(2022, Month.OCTOBER, 5, 6, 15)), SleepType.NIGHT, jacob);
        sleepRepo.save(sleep29);




        Baby georgia = new Baby("Georgia", LocalDate.of(2022, Month.FEBRUARY, 21));
        babyRepo.save(georgia);

        Sleep sleep30 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 8, 20)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 9, 32)), SleepType.NAP, georgia);
        sleepRepo.save(sleep30);
        Sleep sleep31 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 12, 53)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 14, 06)), SleepType.NAP, georgia);
        sleepRepo.save(sleep31);
        Sleep sleep32 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 17, 05)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 17, 30)), SleepType.NAP, georgia);
        sleepRepo.save(sleep32);
        Sleep sleep33 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 3, 20, 18)),(LocalDateTime.of(2022, Month.OCTOBER, 4, 06, 15)), SleepType.NIGHT, georgia);
        sleepRepo.save(sleep33);

        Sleep sleep34 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 8, 30)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 8, 49)), SleepType.NAP, georgia);
        sleepRepo.save(sleep34);
        Sleep sleep35 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 10, 40)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 11, 13)), SleepType.NAP, georgia);
        sleepRepo.save(sleep35);
        Sleep sleep36 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 13, 05)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 14, 22)), SleepType.NAP, georgia);
        sleepRepo.save(sleep36);
        Sleep sleep37 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 16, 50)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 17, 33)), SleepType.NAP, georgia);
        sleepRepo.save(sleep37);
        Sleep sleep38 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 2, 19, 49)),(LocalDateTime.of(2022, Month.OCTOBER, 3, 05, 56)), SleepType.NIGHT, georgia);
        sleepRepo.save(sleep38);

        Sleep sleep39 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 8, 33)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 9, 38)), SleepType.NAP, georgia);
        sleepRepo.save(sleep39);
        Sleep sleep40 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 12, 15)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 13, 19)), SleepType.NAP, georgia);
        sleepRepo.save(sleep40);
        Sleep sleep41 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 16, 13)),(LocalDateTime.of(2022, Month.OCTOBER, 1, 17, 07)), SleepType.NAP, georgia);
        sleepRepo.save(sleep41);
        Sleep sleep42 = new Sleep((LocalDateTime.of(2022, Month.OCTOBER, 1, 19, 31)),(LocalDateTime.of(2022, Month.OCTOBER, 2, 06, 55)), SleepType.NIGHT, georgia);
        sleepRepo.save(sleep42);


        Feed feed29 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 7, 11)),7,georgia);
        feedRepo.save(feed29);
        Feed feed30 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 11, 33)),4,georgia);
        feedRepo.save(feed30);
        Feed feed31= new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 15, 25)),6.25,georgia);
        feedRepo.save(feed31);
        Feed feed32 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 1, 18, 50)),6,georgia);
        feedRepo.save(feed32);

        Feed feed33 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 07, 23)),5,georgia);
        feedRepo.save(feed33);
        Feed feed34 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 11, 45)),5.5,georgia);
        feedRepo.save(feed34);
        Feed feed35 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 15, 45)),5,georgia);
        feedRepo.save(feed35);
        Feed feed36 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 2, 18, 41)),6,georgia);
        feedRepo.save(feed36);

        Feed feed37 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 7, 00)),6,georgia);
        feedRepo.save(feed37);
        Feed feed38 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 11, 28)),5.5,georgia);
        feedRepo.save(feed38);
        Feed feed39 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 15, 47)),6,georgia);
        feedRepo.save(feed39);
        Feed feed40 = new Feed((LocalDateTime.of(2022, Month.OCTOBER, 3, 19, 00)),5.5,georgia);
        feedRepo.save(feed40);




        Temperature temp1 = new Temperature((LocalDateTime.of(2022, Month.OCTOBER, 3, 11, 30)), 34.99, jacob);
        Temperature temp2 = new Temperature((LocalDateTime.of(2022, Month.OCTOBER, 3, 11, 30)), 31.2222, georgia);
        Temperature temp3 = new Temperature((LocalDateTime.of(2022, Month.OCTOBER, 2, 11, 30)), 33.3333, jacob);
        tempRepo.save(temp1);
        tempRepo.save(temp2);
        tempRepo.save(temp3);
    }
}
