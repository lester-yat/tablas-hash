package com.lester.geohash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lester.geohash.entity.Subregion;

public interface SubregionRepository extends JpaRepository<Subregion, Long> {
}