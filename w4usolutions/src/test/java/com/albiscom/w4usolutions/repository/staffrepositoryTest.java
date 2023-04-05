package com.albiscom.w4usolutions.repository;

import com.albiscom.w4usolutions.domain.staff;
import lombok.Builder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class staffrepositoryTest {

    @Autowired
    private staffrepository Staffrepository;


    @Test
    public void saveStaff(){

        staff Staff = staff.builder()

                .surname("Woye")
                .firstname("Ahmed")
                .department("Socialwork")

                .build();
        Staffrepository.save(Staff);
    }

}