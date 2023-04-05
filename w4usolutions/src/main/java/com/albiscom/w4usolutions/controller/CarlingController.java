package com.albiscom.w4usolutions.controller;

import com.albiscom.w4usolutions.domain.Carling;
import com.albiscom.w4usolutions.service.CarlingService;
import org.hibernate.annotations.Target;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarlingController {

    @Autowired
    private CarlingService carlingService;

    @GetMapping("/carling")
    public ResponseEntity<List<Carling>> getAllCarling(){
        return new ResponseEntity<List<Carling>>(carlingService.getAllCarling(), HttpStatus.OK);
    }

    @GetMapping("/carling/{id}")
    public ResponseEntity<Carling> getSingleCarling(@PathVariable Long id){
        return new ResponseEntity<Carling>(carlingService.getSingCarling(id), HttpStatus.OK);
    }

    @DeleteMapping("/carling")
    public void deleteSingleCarling(@RequestParam  Long id){
        carlingService.deleteSingleCarling(id);
    }

    @PostMapping("/carling")
    public ResponseEntity<Carling> saveSingleCarling (@RequestBody Carling carling){
    return new ResponseEntity<Carling>(carlingService.saveSingleCarling(carling), HttpStatus.CREATED);
    }

    @PutMapping("/carling/{id}")
    public Carling updateSingleCarling(@PathVariable Long id , @RequestBody Carling carling) {
        carling.setId(id);
       return  carlingService.updateSingleCarling(carling);

    }


}
