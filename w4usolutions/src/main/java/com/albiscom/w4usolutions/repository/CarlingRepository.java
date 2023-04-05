package com.albiscom.w4usolutions.repository;

import com.albiscom.w4usolutions.domain.Carling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarlingRepository extends JpaRepository<Carling, Long> {
}
