package com.albiscom.w4usolutions.service;

import com.albiscom.w4usolutions.domain.Manchester;

import java.util.List;

public interface ManchesterService {

    List<Manchester> getAllManchester();

    Manchester getSingleManchester (Long id);

    void deleteSingleManchester (Long id);

    Manchester updateSingleManchester ( Manchester manchester);

    Manchester saveSingleManchester ( Manchester manchester);
}
