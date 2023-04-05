package com.albiscom.w4usolutions.serviceImpl;

import com.albiscom.w4usolutions.domain.Manchester;
import com.albiscom.w4usolutions.repository.ManchesterRepository;
import com.albiscom.w4usolutions.service.ManchesterService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ManchesterServiceImpl implements ManchesterService {

    @Autowired
    private ManchesterRepository manchesterRepository;

    @Override
    public List<Manchester> getAllManchester() {
        return manchesterRepository.findAll();
    }

    @Override
    public Manchester getSingleManchester(Long id) {
        Optional<Manchester> manchester = manchesterRepository.findById(id);
        if(manchester.isPresent()){
            return manchester.get();
        }
            throw new RuntimeException("The citizen cannot be found in manchester " + id) ;
    }

    @Override
    public void deleteSingleManchester(Long id) {
        manchesterRepository.deleteById(id);

    }

    @Override
    public Manchester updateSingleManchester(Manchester manchester) {
        return manchesterRepository.save(manchester);
    }

    @Override
    public Manchester saveSingleManchester(Manchester manchester) {
        return manchesterRepository.save(manchester);
    }
}
