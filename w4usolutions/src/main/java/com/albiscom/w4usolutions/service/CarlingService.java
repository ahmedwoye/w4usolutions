package com.albiscom.w4usolutions.service;

import com.albiscom.w4usolutions.domain.Carling;

import java.util.List;

public interface CarlingService {

    List<Carling> getAllCarling();

    Carling getSingCarling (Long id);

    void deleteSingleCarling (Long id);

    Carling updateSingleCarling (Carling carling) ;

    Carling saveSingleCarling (Carling carling);
}
