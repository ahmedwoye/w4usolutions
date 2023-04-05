package com.albiscom.w4usolutions.controller;

import com.albiscom.w4usolutions.domain.Manchester;
import com.albiscom.w4usolutions.repository.ManchesterRepository;
import com.albiscom.w4usolutions.service.ManchesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManchesterController {

    @Autowired
    private ManchesterService manchesterService;

    @GetMapping("/manchester")
    public ResponseEntity<List<Manchester>> getAllManchester(){
        return new ResponseEntity<List<Manchester>>(manchesterService.getAllManchester(), HttpStatus.OK);
    }

    @GetMapping("/manchester/{id}")
    public ResponseEntity<Manchester> getSingleManchester(@PathVariable Long id){
        return new ResponseEntity<Manchester>(manchesterService.getSingleManchester(id), HttpStatus.OK);

    }

    @PostMapping("/manchester")
    public ResponseEntity<Manchester> saveSingleManchester(@RequestBody Manchester manchester){
        return new ResponseEntity<Manchester>(manchesterService.saveSingleManchester(manchester), HttpStatus.CREATED);
    }
    @DeleteMapping("/manchester")
    public void deleteSingleManchester(@RequestParam Long id){
        manchesterService.deleteSingleManchester(id);


    }

    @PutMapping("/manchester")
    public Manchester updateSingleManchester(@RequestBody Manchester manchester, @PathVariable Long id){
         manchester.setId(id);
      return   manchesterService.updateSingleManchester(manchester);


    }
}
