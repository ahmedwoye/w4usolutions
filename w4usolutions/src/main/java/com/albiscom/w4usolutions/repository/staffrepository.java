package com.albiscom.w4usolutions.repository;

import com.albiscom.w4usolutions.domain.staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface staffrepository extends CrudRepository<staff, Long> {



 }
