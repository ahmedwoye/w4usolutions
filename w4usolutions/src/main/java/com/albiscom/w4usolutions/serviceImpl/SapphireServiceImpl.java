package com.albiscom.w4usolutions.serviceImpl;

import com.albiscom.w4usolutions.domain.Sapphire;
import com.albiscom.w4usolutions.repository.SapphireRepository;
import com.albiscom.w4usolutions.service.SapphireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SapphireServiceImpl  implements SapphireService {

    @Autowired
    private SapphireRepository sapphireRepository;


    @Override
    public List<Sapphire> getAllList() {
        return sapphireRepository.findAll();
    }

    @Override
    public Sapphire getSingleSapphire(Long id) {
        Optional<Sapphire> sapphire = sapphireRepository.findById(id);
        if(sapphire.isPresent()){
            return sapphire.get();
        }
       throw new RuntimeException("The sapphire is not present " + id);
    }

    @Override
    public void deleteSingleSapphire(Long id) {
        sapphireRepository.deleteById(id);
    }

    @Override
    public Sapphire updateSingleSapphire(Sapphire sapphire) {
        return sapphireRepository.save(sapphire);
    }

    @Override
    public Sapphire saveSingleSapphire(Sapphire sapphire) {
        return sapphireRepository.save(sapphire);
    }
}
