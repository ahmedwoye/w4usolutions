package com.albiscom.w4usolutions.repository;

import com.albiscom.w4usolutions.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class studentrepositoryTest {

    @Autowired
    private studentrepository studentrepositorys;

    @Test
    public void saveStudent(){

        Student student = Student.builder()
                .surname("Adebiyi")
                .firstname("Mutiu")
                .department("Monitoring and Evaluation")

                .build();

        studentrepositorys.save(student);
    }

}