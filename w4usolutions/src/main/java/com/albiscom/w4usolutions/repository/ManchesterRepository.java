package com.albiscom.w4usolutions.repository;

import com.albiscom.w4usolutions.domain.Manchester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManchesterRepository extends JpaRepository<Manchester, Long> {
}
