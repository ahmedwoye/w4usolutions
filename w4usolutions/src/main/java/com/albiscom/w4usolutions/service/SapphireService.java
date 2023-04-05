package com.albiscom.w4usolutions.service;

import com.albiscom.w4usolutions.domain.Sapphire;

import java.util.List;

public interface SapphireService {

    List<Sapphire> getAllList();

    Sapphire getSingleSapphire  (Long id);

    void deleteSingleSapphire (Long id);

    Sapphire updateSingleSapphire (Sapphire sapphire);

    Sapphire saveSingleSapphire (Sapphire sapphire);
}
