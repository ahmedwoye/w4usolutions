package com.albiscom.w4usolutions.service;

import com.albiscom.w4usolutions.domain.Student;

import java.util.List;

public interface studentservice {


    List<Student> getAllStudent();

    Student getSingleStudent(Long id);

    void deleteSingleStudent(Long id);

    Student updateSingleStudent (Student student);

    Student savesingleStudent (Student student);
}
