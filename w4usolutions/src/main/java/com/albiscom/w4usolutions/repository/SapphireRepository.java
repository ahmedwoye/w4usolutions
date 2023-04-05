package com.albiscom.w4usolutions.repository;

import com.albiscom.w4usolutions.domain.Sapphire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SapphireRepository extends JpaRepository<Sapphire, Long> {
}
