package com.albiscom.w4usolutions.repository;

import com.albiscom.w4usolutions.domain.Sapphire;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SapphireRepositoryTest {

    @Autowired
    private SapphireRepository sapphireRepository;

    @Test
    public void saveSapphire(){

        Sapphire sapphire = Sapphire.builder()
                .surname("Ayantoye")
                .firstname("Rukayat")
                .training("Devops")
                .build();

        sapphireRepository.save(sapphire);
    }

}