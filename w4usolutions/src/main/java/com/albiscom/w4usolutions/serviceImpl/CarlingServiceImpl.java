package com.albiscom.w4usolutions.serviceImpl;

import com.albiscom.w4usolutions.domain.Carling;
import com.albiscom.w4usolutions.repository.CarlingRepository;
import com.albiscom.w4usolutions.service.CarlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarlingServiceImpl implements CarlingService {

    @Autowired
    private CarlingRepository carlingRepository;

    @Override
    public List<Carling> getAllCarling() {
        return carlingRepository.findAll();
    }

    @Override
    public Carling getSingCarling(Long id) {

        Optional<Carling> carling = carlingRepository.findById(id);
        if(carling.isPresent()){
            return carling.get();
        }
            throw new RuntimeException("The carling cannot be found " + id);
    }

    @Override
    public void deleteSingleCarling(Long id) {
        carlingRepository.deleteById(id);
    }

    @Override
    public Carling updateSingleCarling(Carling carling) {
        return carlingRepository.save(carling);
    }

    @Override
    public Carling saveSingleCarling(Carling carling) {
        return carlingRepository.save(carling);
    }
}
