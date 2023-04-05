package com.albiscom.w4usolutions.repository;

import com.albiscom.w4usolutions.domain.Carling;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarlingRepositoryTest {

    @Autowired
    private CarlingRepository carlingRepository;

    @Test
    void saveCarling(){

        Carling carling =  Carling.builder()

                .surname("Olaluwoye")
                .firstname("Olabisi")
                .middlename("olatoke")
                .build();

        carlingRepository.save(carling);

    }

}