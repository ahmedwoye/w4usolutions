package com.albiscom.w4usolutions.controller;

import com.albiscom.w4usolutions.domain.Sapphire;
import com.albiscom.w4usolutions.service.SapphireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SapphireController {

    @Autowired
    private SapphireService sapphireService;

    @GetMapping("/sapphire")
    public ResponseEntity<List<Sapphire>> getAllSapphire() {
        return new ResponseEntity<List<Sapphire>>(sapphireService.getAllList(), HttpStatus.OK);

    }

    @GetMapping("/sapphire/{id}")
    public ResponseEntity<Sapphire>  getSingleSapphire(@PathVariable Long id){
        return new ResponseEntity<Sapphire>(sapphireService.getSingleSapphire(id),  HttpStatus.OK);
        }

        @PostMapping("/sapphire")
        public ResponseEntity<Sapphire> saveSingleSapphire (@RequestBody Sapphire sapphire){
        return new ResponseEntity<Sapphire>(sapphireService.saveSingleSapphire(sapphire), HttpStatus.CREATED);
        }

        @DeleteMapping("/sapphire")
        public void  deleteSingleSapphire(@RequestParam Long id){
            sapphireService.deleteSingleSapphire(id);

        }

        @PutMapping("/sapphire/{id}")
        public Sapphire updateSingleSapphire(@PathVariable Long id, @RequestBody  Sapphire sapphire ){
             sapphire.setId(id);
            return sapphireService.updateSingleSapphire(sapphire);

        }
    }

