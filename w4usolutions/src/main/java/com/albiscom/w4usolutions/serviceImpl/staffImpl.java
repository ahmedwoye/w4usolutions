package com.albiscom.w4usolutions.serviceImpl;

import com.albiscom.w4usolutions.domain.staff;
import com.albiscom.w4usolutions.repository.staffrepository;
import com.albiscom.w4usolutions.service.staffservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class staffImpl implements staffservice {

    @Autowired
    private staffrepository Staffrepository;

    @Override
    public List<staff> getAllstaff() {
        return (List<staff>) Staffrepository.findAll();
    }

    @Override
    public staff getSinglestaff(Long id) {
        Optional<staff> Staffs = Staffrepository.findById(id);
        if(Staffs.isPresent()){
        return Staffs.get();
        }

        throw new RuntimeException("This cannot be found" + id);
    }

    @Override
    public void deleteSingleStaff(Long id) {
        Staffrepository.deleteById(id);


    }

    @Override
    public staff updatesinglestaff(staff Staff) {
        return Staffrepository.save(Staff);
    }

    @Override
    public staff savesinglestaff(staff Staff) {
        return Staffrepository.save(Staff);
    }
}
