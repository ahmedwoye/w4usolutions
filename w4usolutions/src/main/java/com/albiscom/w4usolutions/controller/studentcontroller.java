package com.albiscom.w4usolutions.controller;


import com.albiscom.w4usolutions.domain.Student;
import com.albiscom.w4usolutions.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentcontroller {


    @Autowired
private studentservice StudentService;

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudent(){
        return new ResponseEntity<List<Student>>(StudentService.getAllStudent(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getSingleStudent(@PathVariable Long id){
        return new ResponseEntity<Student>(StudentService.getSingleStudent(id), HttpStatus.OK);

    }

    @PostMapping("/student")
    public ResponseEntity<Student> saveSingleStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(StudentService.savesingleStudent(student), HttpStatus.CREATED );
    }
}
