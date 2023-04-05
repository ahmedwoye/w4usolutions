package com.albiscom.w4usolutions.controller;


import com.albiscom.w4usolutions.domain.staff;
import com.albiscom.w4usolutions.service.staffservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class staffcontroller {

    @Autowired
    private staffservice StaffService;


    @GetMapping("/staff")
    public ResponseEntity<List<staff>> getAllstaff(){
        return new ResponseEntity<List<staff>> (StaffService.getAllstaff(), HttpStatus.OK);
    }

@PostMapping("/staffsave")
    public ResponseEntity<staff> saveSingleStaff( @RequestBody staff Staff){
        return new ResponseEntity<staff>(StaffService.savesinglestaff( Staff), HttpStatus.CREATED);
    }

    @GetMapping("/staff/{id}")
    public ResponseEntity<staff>  getSingleStaff(@PathVariable Long id){
        return new ResponseEntity <staff>(StaffService.getSinglestaff( id),HttpStatus.OK );

    }
}
