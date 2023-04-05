package com.albiscom.w4usolutions.repository;

import com.albiscom.w4usolutions.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentrepository extends JpaRepository<Student, Long> {
}
