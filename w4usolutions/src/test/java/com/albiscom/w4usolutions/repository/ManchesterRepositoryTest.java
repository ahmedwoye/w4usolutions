package com.albiscom.w4usolutions.repository;

import com.albiscom.w4usolutions.domain.Manchester;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ManchesterRepositoryTest {

    @Autowired
    private ManchesterRepository manchesterRepository;

    @Test
    public void saveManchester() {

        Manchester manchester = Manchester.builder()
                .surname("Ilufoye")
                .firstname("Taofeeq")
                .brpno("BC990345TQ")
                .build();

        manchesterRepository.save(manchester);

    }

    @Test
    public void saveManchester2() {

        Manchester manchester1 = Manchester.builder()
                .surname("Woye")
                .firstname("Tajudden")
                .brpno("BC990345MP")
                .build();

        manchesterRepository.save(manchester1);

    }
}