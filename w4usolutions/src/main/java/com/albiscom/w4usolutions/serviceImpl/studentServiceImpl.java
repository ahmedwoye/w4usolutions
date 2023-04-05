package com.albiscom.w4usolutions.serviceImpl;


import com.albiscom.w4usolutions.domain.Student;
import com.albiscom.w4usolutions.repository.studentrepository;
import com.albiscom.w4usolutions.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentServiceImpl  implements studentservice {

    @Autowired
    private studentrepository Studentrepositorys;

    @Override
    public List<Student> getAllStudent() {
        return Studentrepositorys.findAll();
    }

    @Override
    public Student getSingleStudent(Long id) {
        Optional<Student> students = Studentrepositorys.findById(id);
        if (students.isPresent()){
            return students.get();

        }

        throw new RuntimeException("The student cannot be found" + id );
    }

    @Override
    public void deleteSingleStudent(Long id) {
        Studentrepositorys.deleteById(id);

    }

    @Override
    public Student updateSingleStudent(Student student) {
        return Studentrepositorys.save(student);
    }

    @Override
    public Student savesingleStudent(Student student) {
        return Studentrepositorys.save(student);
    }
}
